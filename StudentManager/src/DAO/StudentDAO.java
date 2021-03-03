package DAO;

import Model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/student_db";
    private String jdbcUsername = "root";
    private String jdbcPassword = "qweqwe1993";
    private static final String INSERT_STUDENTS_SQL = "INSERT INTO STUDENT(name, brithday, email, address) VALUES " +
            " (?, ?, ?, ?);";

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public Student getStudentByName(String name) {
        String sql = "SELECT * from student_list where name LIKE ? LIMIT 1 ";
        Student student = null;
        // Step 1: Establishing a Connection
        try {
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql) ;
            preparedStatement.setString(1, "%" + name + "%");
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int id = rs.getInt("id");
                String nameDB = rs.getString("name");
                Date birthday = rs.getDate("brithday");
                String email = rs.getString("email");
                String address = rs.getString("address");
                student = new Student(id, nameDB, birthday.getTime(), email, address);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return student;
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

    public List<Student> getStudents() {
        String sql = "SELECT * from student_list";
        List<Student> students = new ArrayList<>();

        // Step 1: Establishing a Connection
        try {
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql) ;
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();
            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                Student student = null;
                int id = rs.getInt("id");
                String nameDB = rs.getString("name");
                Date birthday = rs.getDate("brithday");
                String email = rs.getString("email");
                String address = rs.getString("address");
                student = new Student(id, nameDB, birthday.getTime(), email, address);
                students.add(student);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }

        return students;
    }
}
