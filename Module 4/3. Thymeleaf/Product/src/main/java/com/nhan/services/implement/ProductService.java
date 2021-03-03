package com.nhan.services.implement;

import com.nhan.repositories.IProductRepository;
import com.nhan.repositories.model.ProductEDM;
import com.nhan.services.IProductService;
import com.nhan.services.model.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    IProductRepository iProductRepository;

    @Override
    public List<ProductDTO> getListProduct() {
        List<ProductEDM> productEDMList = this.iProductRepository.getListProduct();
        List<ProductDTO> productDTOList = new ArrayList<>();
        for (ProductEDM edm : productEDMList) {
            ProductDTO productDTO = new ProductDTO(edm.getId(), edm.getName(), edm.getPrice(), edm.getImg(),
                    edm.getQuantity());
            productDTOList.add(productDTO);
        }
        return productDTOList;
    }
}
