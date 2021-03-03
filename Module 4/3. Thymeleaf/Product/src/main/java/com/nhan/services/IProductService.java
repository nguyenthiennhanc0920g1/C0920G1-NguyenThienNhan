package com.nhan.services;

import com.nhan.repositories.model.ProductEDM;
import com.nhan.services.model.ProductDTO;

import java.util.List;

public interface IProductService {
    List<ProductDTO> getListProduct();
}
