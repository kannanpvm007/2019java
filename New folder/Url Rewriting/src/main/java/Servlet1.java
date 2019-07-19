import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebInitParam;

/**
 * Servlet1
 */
@WebServlet(urlPatterns = "/servlet1",
initParams =
{
    @WebInitParam(name = "servlet1WebInitParam", value = "servlet1")
})
public class Servlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet1 doGet called");
        ServletContext context = getServletContext();
        String name = "Ramya";
        context.setInitParameter("name", name);
        String fullname = context.getInitParameter("name");
        
        System.out.println("Servlet1 setInitParameter -> "+name);

        ServletConfig config = getServletConfig();
        String servlet1InitParam = config.getInitParameter("servlet1WebInitParam");
        
        req.setAttribute("servlet1InitParam", servlet1InitParam);
        req.setAttribute("fullname", fullname);
        RequestDispatcher rd = req.getRequestDispatcher("servlet1.jsp");
        rd.forward(req, resp);
    }

}