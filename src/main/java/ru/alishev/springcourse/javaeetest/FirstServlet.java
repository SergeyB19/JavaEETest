package ru.alishev.springcourse.javaeetest;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import logic.somePackage.Cart;

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
        HttpSession session = req.getSession();

        String user = (String) session.getAttribute("current_user");
        if (user == null) {

        }
        Cart cart = (Cart) session.getAttribute("cart");

        String name = req.getParameter("name");
        int quantity = Integer.parseInt(req.getParameter("quantity"));

        if (cart == null) {
            cart = new Cart();
            cart.setName(name);
            cart.setQuantity(quantity);

        }
        session.setAttribute("cart", cart);

        Integer count = (Integer) session.getAttribute("count");
        Integer count1 = (Integer) session.getAttribute("cart");
        if (count == null) {
            session.setAttribute("count", 1);
            count = 1;
        } else {
            session.setAttribute("count", count + 1);
        }



     /*   String name = req.getParameter("name");
        String surname = req.getParameter("surname");*/

        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<html>");
        printWriter.println("<h1>" + message + "</h1>");
//        printWriter.println("<h1>" + name + " " + surname + " </h1>");
        printWriter.println("</html>");
        printWriter.println("<h1> Your count is: " + count + " </h1>");

        resp.sendRedirect("https://www.google.com");

        resp.sendRedirect("/testJSP.jsp");

        RequestDispatcher dispatcher = req.getRequestDispatcher("/testJSP.jsp");
        dispatcher.forward(req, resp);

        getServletContext().getRequestDispatcher("/showCart.jsp").forward(req, resp);
    }
}
