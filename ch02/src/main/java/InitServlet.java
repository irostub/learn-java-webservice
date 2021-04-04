import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(name="init servlet", urlPatterns = "/init", initParams = @WebInitParam(name="siteName", value = "irostub"))
public class InitServlet extends HttpServlet {
    private String name;

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("InitServlet.init");

        name = config.getInitParameter("siteName");
        System.out.println("입력받은 sitename은 = " + name + "입니다.");
    }
}
