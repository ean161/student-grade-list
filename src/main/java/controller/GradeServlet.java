package controller;

import dao.GradeDAO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author CE190990 - Nguyen Hoai An
 */
@WebServlet(name="GradeServlet", urlPatterns={"/grade"})
public class GradeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        GradeDAO grade = new GradeDAO();
        
        request.setAttribute("list", grade.getAll());
        request.getRequestDispatcher("WEB-INF/grade.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    }
}
