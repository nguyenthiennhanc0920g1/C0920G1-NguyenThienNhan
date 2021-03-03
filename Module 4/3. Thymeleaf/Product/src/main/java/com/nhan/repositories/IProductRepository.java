package com.nhan.repositories;

import com.nhan.repositories.model.ProductEDM;

import java.util.List;

public interface IProductRepository {
    List<ProductEDM> getListProduct();
}
