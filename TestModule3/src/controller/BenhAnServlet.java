package controller;

import DAO.connection.BenhAnDAO;
import model.BenhAn;
import model.BenhNhan;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "BenhAnServlet", urlPatterns = "/benhan")
public class BenhAnServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private BenhAnDAO BenhAnDAO;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        try {
            switch (action) {
                case "edit":
                    showEditForm(request, response);
                    break;
                case "delete":
                    deleteBenhAn(request, response);
                    break;
                default:
                    listBenhAn(request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }
    private void listBenhAn(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        List<BenhAn> listBenhAn = BenhAnDAO.selectAllBenhAn();
        request.setAttribute("listBenhAn", listBenhAn);
        RequestDispatcher dispatcher = request.getRequestDispatcher("benhan/list.jsp");
        dispatcher.forward(request, response);
    }
    private void deleteBenhAn(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        String maBenhAn =request.getParameter("maBenhAn");
        BenhAnDAO.deleteBenhAn(maBenhAn);

        List<BenhAn> listBenhAn = DAO.connection.BenhAnDAO.selectAllBenhAn();
        request.setAttribute("listBenhAn", listBenhAn);
        RequestDispatcher dispatcher = request.getRequestDispatcher("BenhAn/list.jsp");
        dispatcher.forward(request, response);
    }
    private void showEditForm(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, ServletException, IOException {
        String maBenhAn = request.getParameter("maBenhAn");
        BenhAn existingUser = BenhAnDAO.getBenhAnById(maBenhAn);
        RequestDispatcher dispatcher = request.getRequestDispatcher("BenhAn/edit.jsp");
        request.setAttribute("benhAn", existingUser);
        dispatcher.forward(request, response);

    }
}
