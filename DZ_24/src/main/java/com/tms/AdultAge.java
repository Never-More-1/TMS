package com.tms;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.Writer;

@WebServlet(name = "TimeServlet", urlPatterns = {"/ageCheck"})
public class AdultAge extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        int age = Integer.parseInt(req.getParameter("age"));
        Writer out = resp.getWriter();
        System.out.println("Enter your age: ");
        if (age < 18 && age > 0) {
            out.append("<html>Your age is not adult!!! " + age + "</html>");
        }
        else if (age > 18) {
            out.append("<html>You are adult!!! " + age + "</html>");
        }
    }
}
