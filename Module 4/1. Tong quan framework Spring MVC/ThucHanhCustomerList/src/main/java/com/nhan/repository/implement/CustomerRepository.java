package com.nhan.repository.implement;

import org.springframework.stereotype.Repository;
import com.nhan.repository.ICustomerRepository;
import com.nhan.repository.models.CustomerEDM;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepository extends DBConnection implements ICustomerRepository {
    private static final String SELECT_ALL_CUSTOMERS = "select * from customers_manager";
    private static final String SELECT_CUSTOMERS = "select * from customers_manager where id = ?";
    private static final String UPDATE_CUSTOMERS = "update customers_manager set name = ?, email = ?, " +
            "address = ? where id = ?";

    @Override
    public List<CustomerEDM> getListCustomer() {
        Connection connection = this.getConnection();
        List<CustomerEDM> customerEDMList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareCall(SELECT_ALL_CUSTOMERS);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                CustomerEDM customerEDM = new CustomerEDM(id, name, email, address);
                customerEDMList.add(customerEDM);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.close();
        }
        return customerEDMList;
    }

    @Override
    public CustomerEDM getCustomer(int id) {
        Connection connection = this.getConnection();
        CustomerEDM customerEDM = null;
        try {
            PreparedStatement preparedStatement = connection.prepareCall(SELECT_CUSTOMERS);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int idC = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                customerEDM = new CustomerEDM(id, name, email, address);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.close();
        }
        return customerEDM;
    }

    @Override
    public void updateCustomer(int id, String name, String email, String address) {
        Connection connection = this.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareCall(UPDATE_CUSTOMERS);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, address);
            preparedStatement.setInt(4, id);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.close();
        }
    }
}
