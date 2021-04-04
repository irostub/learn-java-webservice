import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "cookie create servlet", urlPatterns = "/create-cookie")
public class CookieCreateServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("irostub", "rainbow");
        cookie.setMaxAge(3600);

        resp.addCookie(cookie);
        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf-8");
        resp.getWriter().write("<html>" +
                "<body>" +
                "<a href=\"/read-cookie\">read cookie</a>" +
                "</body>" +
                "</html>");
    }
}
