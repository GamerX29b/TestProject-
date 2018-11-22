package classes;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import java.util.Enumeration;

public class servlet  extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        this.process(request, response);
    }


    private void process(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setStatus(200);

        PrintWriter out = response.getWriter();
        response.setContentType("text/plain");

        // Get the values of all request parameters
        Enumeration en = request.getParameterNames();
        out.print("hello ");
        int i = 0;
        String names = request.getParameter("parametr0");
        String surname = request.getParameter("parametr1");
        String patronymic = request.getParameter("parametr2");

/*
        while(en.hasMoreElements()) {
            i++;
            String pname = (String) en.nextElement();
            String pvalue = request.getParameter(pname);

            switch (i){
                case 1: patronymic = pvalue; break;
                case 2: names = pvalue; break;
                case 3: surname = pvalue; break;

        }}
  */
            Random random = new Random();
            int id = random.nextInt();

            out.print(names + " " + surname + " " + patronymic);
            out.println(baseConnect.InsertDBO(id ,names,surname,patronymic));

            Cookie name = new Cookie("Name", names);
            name.setMaxAge(60*60*24);
            response.addCookie( name );

        out.close();
    }
}
