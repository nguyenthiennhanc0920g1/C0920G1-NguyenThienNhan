package com.nhan.controller;

import com.nhan.service.IProductService;
import com.nhan.service.modelDTO.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    IProductService iProductService;
    @GetMapping("/list")
    public ModelAndView findAll() {
        List<ProductDTO> productDTOList = this.iProductService.findAll();
        return new ModelAndView("list", "listProduct", productDTOList);
    }
}
