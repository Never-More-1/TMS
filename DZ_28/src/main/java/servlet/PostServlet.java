package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet("/save-request")
public class PostServlet extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String error = request.getParameter("error");
        boolean flag = true;
        if (!email.isEmpty() && email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+.[a-zA-Z]{2,}")) {
            request.setAttribute("email", email);
        } else {
            request.setAttribute("Email is incorrect! Please try again", error);
            flag = false;
        }
        if (!password.isEmpty() && password.length() >= 3) {
            request.setAttribute("password", password);
        } else {
            request.setAttribute("Password is incorrect! Please try again", error);
            flag = false;
        }
        if (flag){
            request.getRequestDispatcher("success.jsp").forward(request, response);
        }else {
            request.getRequestDispatcher("failed.jsp").forward(request, response);
        }
    }
}
