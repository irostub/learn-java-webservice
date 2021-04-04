import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="cookie modify servlet", urlPatterns = "/modify-cookie")
public class CookieModifyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        for(Cookie cookie : cookies){
            if (cookie.getName().equals("irostub")) {
                Cookie modCookie = new Cookie("irostub", "flavor");
                resp.addCookie(modCookie);
                resp.getWriter().write("<html><body>modyiy cookie key : "+ cookie.getName()+", cookie value : "+modCookie.getValue()+"</body></html>");
                break;
            }else{
                System.out.println("[fail] CookieModifyServlet.doGet");
            }
        }
    }
}
