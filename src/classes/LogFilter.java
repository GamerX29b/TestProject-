package classes;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogFilter implements Filter {

    public LogFilter() {
    }

    @Override
    public void init(FilterConfig fConfig) throws ServletException {
        System.out.println("Приложение запущено");
    }

    @Override
    public void destroy() {
        System.out.println("Приложение остановлено");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {


        HttpServletRequest req = (HttpServletRequest) request;


        String servletPath = req.getServletPath();

        System.out.println("#INFO " + new Date() + " - ServletPath :" + servletPath //
                + ", URL =" + req.getRequestURL());

            Cookie cookie = null;

            Cookie[] cookies = ((HttpServletRequest) request).getCookies();

                for (int i = 0; i < cookies.length; i++){
                    cookie = cookies[i];

                   if ((cookie.getName()).equals("Name")){
                        chain.doFilter(request, response);                 //проверяем наличие куки под названием name
                        break;
                     }else{
            HttpServletResponse resp = (HttpServletResponse) response;     //Если нет куки, отправлять на главную
             resp.sendRedirect( "/hte");
                          }
                      }



}}