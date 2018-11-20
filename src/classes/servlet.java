package classes;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class servlet  extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        this.process(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        this.process(request, response);
    }

    /*
       generate the page showing all the request parameters
     */
    private void process(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setStatus(200);

        PrintWriter out = response.getWriter();
        response.setContentType("text/plain");

        // Get the values of all request parameters
        Enumeration en = request.getParameterNames();
        while(en.hasMoreElements()) {
            // Get the name of the request parameter
            String pname = (String)en.nextElement();
            String pvalue = request.getParameter(pname);
            out.println("hello " + pvalue);

            Cookie name = new Cookie("name", pvalue);
            name.setMaxAge(60*60*24);
            response.addCookie( name );



        }
        out.close();
    }
}
