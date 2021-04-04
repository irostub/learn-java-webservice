import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="hello servlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf-8");
        PrintWriter writer = resp.getWriter();

        writer.write("<html>" +
                "<body>" +
                "get 요청 확인" +
                "</body>" +
                "</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf-8");
        PrintWriter writer = resp.getWriter();


        writer.write("<html>" +
                "<body>" +
                "post 요청 확인" +
                "</body>" +
                "</html>");
    }
}
