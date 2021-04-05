import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "default session servlet", urlPatterns = "/session")
public class SessionDefaultServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf-8");
        PrintWriter writer = resp.getWriter();

        HttpSession httpSession = req.getSession();
        writer.write("<html>" +
                "<body>" +
                "<p> session id : "+ httpSession.getId() +"</p>" +
                "<p> session create time : "+ httpSession.getCreationTime() +"</p>" +
                "<p> session access time : "+ httpSession.getLastAccessedTime() +"</p>" +
                "</body>" +
                "</html>");
    }
}
