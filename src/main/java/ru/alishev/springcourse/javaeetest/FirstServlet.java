package ru.alishev.springcourse.javaeetest;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "firstServlet", value = "/hello-world")
public class FirstServlet extends HttpServlet {
    private String message;


    public void init() {
        message = "Hello";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String surname = req.getParameter("surname");

        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<html>");
        printWriter.println("<h1>" + message + "</h1>");
        printWriter.println("<h1>" + name + " " + surname + " </h1>");
        printWriter.println("</html>");
    }
}
