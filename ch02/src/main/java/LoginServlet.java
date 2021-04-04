import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="login servlet", urlPatterns = "/postsend")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("LoginServlet.doPost");

        String user = req.getParameter("user");
        String pwd = req.getParameter("pwd");

        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf-8");

        PrintWriter writer = resp.getWriter();

        writer.write("<html>" +
                "<body>" +
                "<p>" +
                "입력된 아이디 "+user+
                "</p>" +
                "<p>" +
                "입력된 비밀번호 "+pwd+
                "</p>" +
                "</body>" +
                "</html>");
    }
}
