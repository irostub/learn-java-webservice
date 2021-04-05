import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "session read attribute servlet",urlPatterns = "/read-session")
public class SessionReadAttributeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        String sessionAttr = (String)session.getAttribute("irostub-session");

        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf-8");
        PrintWriter writer = resp.getWriter();

        writer.write("<html>" +
                "<body>" +
                "<p>session attribute : "+ sessionAttr +"</p>"+
                "</body>" +
                "</html>");
    }
}
