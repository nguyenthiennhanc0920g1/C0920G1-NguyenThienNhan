package login.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import login.dao.AccountDAO;

@WebServlet(name = "Login", urlPatterns = "/loginTest")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String username = request.getParameter("txtusername");
            String password = request.getParameter("txtpassword");
            //goi DAO de kiem tra dang nhap trong DB
            boolean isValid = AccountDAO.checkLogIn(username, password);
            //chuyen den view tiep theo can cu vao ket qua login
            if (isValid) {
                //khoi tao session
                HttpSession session = request.getSession();
                //thiet lap gia tri trong session
                session.setAttribute("tendangnhap", username);
                //chuyen den view trang chu
                RequestDispatcher dispatch = getServletContext().getRequestDispatcher("/index.jsp");
                dispatch.forward(request, response);
            } else {
                //truong hop that bai se quay lai login
                RequestDispatcher dispatch = getServletContext().getRequestDispatcher("/login.jsp");
                dispatch.forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}