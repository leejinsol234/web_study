package servlets;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class HelloServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //System.out.println("안녕하세요.");
        System.out.println("doGet"); //매 요청시마다 호출됨.

        String common1 = req.getServletContext().getInitParameter("common1");
        System.out.println(common1);
    }

    @Override
    public void destroy() {
        System.out.println("destroy"); //서버가 꺼질 때 실행됨.
    }

    @Override
    public void init(ServletConfig config) throws ServletException { //HelloServlet내에서만 설정값
        String key1 = config.getInitParameter("key1");
        String key2 = config.getInitParameter("key2");
        System.out.printf("key1=%s, key2=%s%n",key1,key2);

    }

    /*
    @Override
    public void init() throws ServletException {
        System.out.println("init"); //객체가 만들어지면 바로 실행됨.
    }
    */
}
