package Controller;

import DAO.StudentDAO;
import Model.Student;
import sun.misc.IOUtils;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "StudentServlet", urlPatterns = {"/", "/student"})
public class StudentServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        StudentDAO studentDAO = new StudentDAO();
        List<Student> students = studentDAO.getStudents();
        request.setAttribute("list", students);
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
//        String name = request.getParameter("input");
//        StudentDAO studentDAO = new StudentDAO();
//        Student student = studentDAO.getStudentByName(name);
//        request.setAttribute("st", student);
//        RequestDispatcher dispatcher = request.getRequestDispatcher("student/view.jsp");
//        dispatcher.forward(request, response);
    }
}
