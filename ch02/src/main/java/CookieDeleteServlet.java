import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="cookie delete servlet", urlPatterns = "/delete-cookie")
public class CookieDeleteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        for(Cookie cookie : cookies){
            if (cookie.getName().equals("irostub")) {
                cookie.setMaxAge(0);
                resp.addCookie(cookie);
                resp.getWriter().write("<html><body>delete cookie key : "+ cookie.getName()+", cookie value : "+cookie.getValue()+", cookie life time : "+cookie.getMaxAge()+"</body></html>");
                break;
            }else{
                System.out.println("[fail] CookieDeleteServlet.doGet");
            }
        }
    }
}
