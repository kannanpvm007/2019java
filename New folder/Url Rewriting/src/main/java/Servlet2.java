import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet1
 */
@WebServlet(urlPatterns = "/servlet2", initParams = {
        @WebInitParam(name = "servlet2WebInitParam", value = "servlet2") })
public class Servlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet2 doGet called");
        ServletContext context = getServletContext();
        String fullname = context.getInitParameter("name");
        System.out.println("Servlet2 getInitParameter -> " + fullname);

        ServletConfig config = getServletConfig();
        String servlet2InitParam = config.getInitParameter("servlet2WebInitParam");

        req.setAttribute("servlet2InitParam", servlet2InitParam);
        req.setAttribute("fullname", fullname);
        RequestDispatcher rd = req.getRequestDispatcher("servlet2.jsp");
        rd.forward(req, resp);

    }

}