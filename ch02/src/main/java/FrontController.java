import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@WebServlet(name = "front controller",urlPatterns = "/controller", initParams = {@WebInitParam(name="mapping",value="/WEB-INF/command.properties")})
public class FrontController extends HttpServlet {
    private Properties cmdMapping;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        InputStream inputStream = null;
        try{
            String location = config.getInitParameter("mapping");
            inputStream = getServletContext().getResourceAsStream(location);
            cmdMapping = new Properties();
            cmdMapping.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String cmd = req.getParameter("cmd");
        String cmdClass = (String) cmdMapping.get(cmd);
        Command command = null;

        try{
            command = (Command) Class.forName(cmdClass).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        command.setReq(req);
        command.setResp(resp);
        command.setServletContext(getServletContext());
        command.execute();
    }
}
