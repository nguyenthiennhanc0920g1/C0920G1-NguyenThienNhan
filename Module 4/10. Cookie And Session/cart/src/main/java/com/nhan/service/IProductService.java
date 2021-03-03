package com.nhan.service;

import com.nhan.service.modelDTO.ProductDTO;

import java.util.List;

public interface IProductService {
    List<ProductDTO> findAll();
}
