package com.nhan.text.controller;

import com.nhan.text.model.Question;
import com.nhan.text.model.QuestionType;
import com.nhan.text.service.question.IQuestionService;
import com.nhan.text.service.questionType.IQuestionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class QuestionController {
    @Autowired
    IQuestionService iQuestionService;
    @Autowired
    IQuestionTypeService iQuestionTypeService;
    @GetMapping("/list")
    public String index(Model model, HttpServletRequest request
            , RedirectAttributes redirect) {
        request.getSession().setAttribute("list", null);

        if (model.asMap().get("success") != null)
            redirect.addFlashAttribute("success", model.asMap().get("success").toString());
        return "redirect:/page/1";
    }
    @GetMapping("/page/{pageNumber}")
    public String showCustomerPage(HttpServletRequest request,
                                   @PathVariable int pageNumber, Model model) {
        PagedListHolder<?> pages = (PagedListHolder<?>) request.getSession().getAttribute("list");
        int pageSize = 5;
        List<Question> questionList = iQuestionService.findAll();
        if (pages == null) {
            pages = new PagedListHolder<>(questionList);
            pages.setPageSize(pageSize);
        } else {
            final int goToPage = pageNumber - 1;
            if (goToPage <= pages.getPageCount() && goToPage >= 0) {
                pages.setPage(goToPage);
            }
        }
        request.getSession().setAttribute("list", pages);
        int current = pages.getPage() + 1;
        int begin = Math.max(1, current - questionList.size());
        int end = Math.min(begin + 5, pages.getPageCount());
        int totalPageCount = pages.getPageCount();
        String baseUrl = "/page/";
        model.addAttribute("beginIndex", begin);
        model.addAttribute("endIndex", end);
        model.addAttribute("currentIndex", current);
        model.addAttribute("totalPageCount", totalPageCount);
        model.addAttribute("baseUrl", baseUrl);
        model.addAttribute("listPage", pages);
        model.addAttribute("listPageDTO", questionList);
        return "question/list";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        iQuestionService.deleteById(id);
        return "redirect:/list";
    }

    @GetMapping("/search/{pageNumber}")
    public String search(@RequestParam String td, Model model, HttpServletRequest request,
                         @PathVariable int pageNumber) {
        if (td.equals("")) {
            return "redirect:/list";
        }
        List<Question> questionList = iQuestionService.search(td);
        if (questionList == null) {
            return "redirect:/list";
        }
        PagedListHolder<?> pages = (PagedListHolder<?>) request.getSession().getAttribute("list");
        int pageSize = 5;
        pages = new PagedListHolder<>(questionList);
        pages.setPageSize(pageSize);
        final int goToPage = pageNumber - 1;
        if (goToPage <= pages.getPageCount() && goToPage >= 0) {
            pages.setPage(goToPage);
        }
        request.getSession().setAttribute("list", pages);
        int current = pages.getPage() + 1;
        int begin = Math.max(1, current - questionList.size());
        int end = Math.min(begin + 20, pages.getPageCount());
        int totalPageCount = pages.getPageCount();
        String baseUrl = "/customer/page/";
        model.addAttribute("beginIndex", begin);
        model.addAttribute("endIndex", end);
        model.addAttribute("currentIndex", current);
        model.addAttribute("totalPageCount", totalPageCount);
        model.addAttribute("baseUrl", baseUrl);
        model.addAttribute("listPage", pages);
        return "question/list";
    }

}
