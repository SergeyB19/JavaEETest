import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class GetCookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>");

        for (Cookie cookie : cookies) {
            printWriter.println("<h1>" + cookie.getName() + " : " + cookie.getValue() + "</h1>");

        }
        printWriter.println("</html>");
    }
}
