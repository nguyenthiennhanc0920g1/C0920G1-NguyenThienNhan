package com.nhan.service.imp;

import com.nhan.service.IProductService;
import com.nhan.service.modelDTO.ProductDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService implements IProductService {
    private static List<ProductDTO> productDTOList = new ArrayList<>();

    static {
        ProductDTO productDTO1 = new ProductDTO
                (1, "Hoa 1", 100, "Hoa tươi 1", "/img/1.jpg");
        ProductDTO productDTO2 = new ProductDTO
                (2, "Hoa 2", 200, "Hoa tươi 2", "/img/2.jpg");
        ProductDTO productDTO3 = new ProductDTO
                (3, "Hoa 3", 300, "Hoa tươi 3", "/img/3.jpg");
        ProductDTO productDTO4 = new ProductDTO
                (4, "Hoa 4", 400, "Hoa tươi 4", "/img/4.jpg");
        ProductDTO productDTO5 = new ProductDTO
                (5, "Hoa 5", 500, "Hoa tươi 5", "/img/5.jpg");
        productDTOList.add(productDTO1);
        productDTOList.add(productDTO2);
        productDTOList.add(productDTO3);
        productDTOList.add(productDTO4);
        productDTOList.add(productDTO5);
    }
    @Override
    public List<ProductDTO> findAll() {
        return productDTOList;
    }
}
