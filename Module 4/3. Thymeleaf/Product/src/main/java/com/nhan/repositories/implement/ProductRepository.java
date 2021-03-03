package com.nhan.repositories.implement;

import com.nhan.repositories.IProductRepository;
import com.nhan.repositories.model.ProductEDM;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository extends DBConnection implements IProductRepository {
    private static final String SELECT_ALL_PRODUCT = "select * from product_manager;";

    @Override
    public List<ProductEDM> getListProduct() {
        Connection connection = this.getConnection();
        List<ProductEDM> productEDMList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareCall(SELECT_ALL_PRODUCT);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");
                Double price = resultSet.getDouble("price");
                String img = resultSet.getString("img");
                int quantity = resultSet.getInt("quantity");
                ProductEDM productEDM = new ProductEDM(id, name, price, img, quantity);
                productEDMList.add(productEDM);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.close();
        }
        return productEDMList;
    }
}
