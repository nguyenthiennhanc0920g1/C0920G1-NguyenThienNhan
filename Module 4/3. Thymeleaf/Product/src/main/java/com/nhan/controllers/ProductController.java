package com.nhan.controllers;

import com.nhan.services.IProductService;
import com.nhan.services.model.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    IProductService iProductService;
    @GetMapping(value = "/list")
    public ModelAndView listProduct(){
        List<ProductDTO> productDTOList = this.iProductService.getListProduct();
        return new ModelAndView("list", "listProduct", productDTOList);
    }
}
