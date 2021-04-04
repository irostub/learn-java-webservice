import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet(name="cookie read servlet", urlPatterns = "/read-cookie")
public class CookieReadServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf-8");
        Cookie[] cookies = req.getCookies();
        for(Cookie cookie : cookies){
            if (cookie.getName().equals("irostub")) {
                resp.getWriter().write("<html><body>cookie key : "+ cookie.getName()+", cookie value : "+ cookie.getValue()+"</body></html>");
                break;
            }else{
                System.out.println("[fail] CookieReadServlet.doGet");
            }
        }
    }
}
