package login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AccountDAO {
    public static boolean checkLogIn(String username, String password) {
        boolean isValid = false;
        try {
            Class.forName("com.mysql.jdbc.Driver"); //load driver
            // mo ket noi den server
            Connection con = DriverManager.
                    getConnection("jdbc:mysql://localhost:3306/quan_ly_tai_khoan",
                            "root", "qweqwe1993");
            String sql = "select * from tai_khoan where username = ? and password = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, username);
            pre.setString(2, password);
            // thuc thi cau lenh truy van trong mySQL
            ResultSet rs = pre.executeQuery();
            //truong hop dang nhap thanh cong
            if (rs.next()) {
                isValid = true;
            } else {
                isValid = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isValid;
    }
}
