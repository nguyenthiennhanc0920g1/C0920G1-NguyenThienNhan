package com.nhan.controller;

import com.nhan.service.IBenhAnService;
import com.nhan.service.models.BenhAnChiTietDto;
import com.nhan.viewmodels.UpdateBenhAnViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BenhVienController {
    @Autowired
    IBenhAnService benhAnService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView benhAnChiTietList(){
        List<BenhAnChiTietDto> list = this.benhAnService.getListBenhAnChiTiet();
        return new ModelAndView("list", "benhAnList", list);
    }

    @RequestMapping(value = "/editBenhAnChiTiet", method = RequestMethod.POST)
    public ModelAndView editBenhAnChiTiet(UpdateBenhAnViewModel editBenhAn, Model modelx){
        this.benhAnService.updateBenhAnChiTiet(editBenhAn.getMaBenhAn(), editBenhAn.getBacsi());
        List<BenhAnChiTietDto> list = this.benhAnService.getListBenhAnChiTiet();
        return new ModelAndView("list", "benhAnList", list);
    }

    @RequestMapping(value = "/benhAnChiTiet/{benhAnId}", method = RequestMethod.GET)
    public ModelAndView benhAnChiTiet(@PathVariable String benhAnId){
        BenhAnChiTietDto benhAnChiTietDto = this.benhAnService.getBenhAnChiTiet(benhAnId);
        return new ModelAndView("edit", "benhAn", benhAnChiTietDto);
    }
}
