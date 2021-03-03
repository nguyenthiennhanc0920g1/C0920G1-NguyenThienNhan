package customer.repository;

import customer.model.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO implements ICustomerDAO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/case_study_furama_module_3?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "qweqwe1993";

    private static final String INSERT_CUSTOMERS_SQL = "insert into customers values" +
            " (customers.id_customer, ?,?,?,?,?,?,?,?)";

    private static final String SELECT_CUSTOMERS_BY_ID = "select * from customers where id_customer =?";
    private static final String SELECT_ALL_CUSTOMERS = "select * from customers";
    private static final String DELETE_CUSTOMERS_SQL = "delete from customers where id_customer = ?;";
    private static final String UPDATE_CUSTOMERS_SQL = "update users set customers.id_customer," +
            " id_type_customer = ?," +
            "full_name_customer= ?, " +
            "birthday_customer =?," +
            "id_card_customer = ?" +
            "phone_number_customer = ?," +
            "email_customer = ?," +
            "address_customer = ?" +
            " where id_customer = ?;";

    public CustomerDAO() {
    }

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }

    @Override
    public void insertCustomer(Customer customer) throws SQLException {
        System.out.println(INSERT_CUSTOMERS_SQL);
        // try-with-resource statement will auto close the connection.
        try (Connection connection = getConnection(); PreparedStatement preparedStatement =
                connection.prepareStatement(INSERT_CUSTOMERS_SQL)) {
            preparedStatement.setInt(1, customer.getIdCustomer());
            preparedStatement.setInt(2, customer.getCustomerTypeId());
            preparedStatement.setString(3, customer.getNameCustomer());
            preparedStatement.setString(4, customer.getBirthdayCustomer());
            preparedStatement.setString(5, customer.getIdCardCustomer());
            preparedStatement.setString(6, customer.getPhoneCustomer());
            preparedStatement.setString(7, customer.getEmailCustomer());
            preparedStatement.setString(8, customer.getAddressCustomer());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }

    @Override
    public Customer selectCustomer(int id_customer) {
        Customer customer = null;
        // Step 1: Establishing a Connection
        try (Connection connection = getConnection();
             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CUSTOMERS_BY_ID);) {
            preparedStatement.setInt(1, id_customer);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int typeID = rs.getInt("id_type_customer");
                String name = rs.getString("full_name_customer");
                String birthday = rs.getString("birthday_customer");
                String idCard = rs.getString("id_card_customer");
                String phone = rs.getString("phone_number_customer");
                String email = rs.getString("email_customer");
                String address = rs.getString("address_customer");
                customer = new Customer(id_customer, typeID, name, birthday, idCard, phone, email, address);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return customer;
    }

    @Override
    public List<Customer> selectAllCustomer() {
        // using try-with-resources to avoid closing resources (boiler plate code)
        List<Customer> customers = new ArrayList<>();
        // Step 1: Establishing a Connection
        try (Connection connection = getConnection();

             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMERS);) {
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int id_customer = rs.getInt("id_customer");
                int typeID = rs.getInt("id_type_customer");
                String name = rs.getString("full_name_customer");
                String birthday = rs.getString("birthday_customer");
                String idCard = rs.getString("id_card_customer");
                String phone = rs.getString("phone_number_customer");
                String email = rs.getString("email_customer");
                String address = rs.getString("address_customer");
                customers.add(new Customer(id_customer, typeID, name, birthday, idCard, phone, email, address));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return customers;
    }

    @Override
    public boolean deleteCustomer(int id) throws SQLException {
        boolean rowDeleted;
        try (Connection connection = getConnection(); PreparedStatement statement =
                connection.prepareStatement(DELETE_CUSTOMERS_SQL);) {
            statement.setInt(1, id);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }

    @Override
    public boolean updateCustomer(Customer customer) throws SQLException {
        boolean rowUpdated;
        try (Connection connection = getConnection(); PreparedStatement statement =
                connection.prepareStatement(UPDATE_CUSTOMERS_SQL);) {
            statement.setInt(1, customer.getIdCustomer());
            statement.setInt(2, customer.getCustomerTypeId());
            statement.setString(3, customer.getNameCustomer());
            statement.setString(4, customer.getBirthdayCustomer());
            statement.setString(5, customer.getIdCardCustomer());
            statement.setString(6, customer.getPhoneCustomer());
            statement.setString(7, customer.getEmailCustomer());
            statement.setString(8, customer.getAddressCustomer());

            rowUpdated = statement.executeUpdate() > 0;
        }
        return rowUpdated;
    }

    @Override
    public Customer getCustomerById(int id) {
        Customer customer = null;
        String query = "{CALL get_user_by_id(?)}";
        // Step 1: Establishing a Connection
        try (Connection connection = getConnection();
             // Step 2:Create a statement using connection object
             CallableStatement callableStatement = connection.prepareCall(query);) {
            callableStatement.setInt(1, id);
            // Step 3: Execute the query or update query
            ResultSet rs = callableStatement.executeQuery();
            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int typeID = rs.getInt("id_type_customer");
                String name = rs.getString("full_name_customer");
                String birthday = rs.getString("birthday_customer");
                String idCard = rs.getString("id_card_customer");
                String phone = rs.getString("phone_number_customer");
                String email = rs.getString("email_customer");
                String address = rs.getString("address_customer");
                customer = new Customer(id, typeID, name, birthday, idCard, phone, email, address);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return customer;
    }

    @Override
    public void insertCustomerStore(Customer customer) throws SQLException {
        String query = "{CALL insert_customer(customers.id_customer, ?,?,?,?,?,?,?,?) }";
        // try-with-resource statement will auto close the connection.
        try (Connection connection = getConnection();
             CallableStatement callableStatement = connection.prepareCall(query);) {
            callableStatement.setInt(1, customer.getIdCustomer());
            callableStatement.setInt(2, customer.getCustomerTypeId());
            callableStatement.setString(3, customer.getNameCustomer());
            callableStatement.setString(4, customer.getBirthdayCustomer());
            callableStatement.setString(5, customer.getIdCardCustomer());
            callableStatement.setString(6, customer.getPhoneCustomer());
            callableStatement.setString(7, customer.getEmailCustomer());
            callableStatement.setString(8, customer.getAddressCustomer());
            System.out.println(callableStatement);
            callableStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }
}
