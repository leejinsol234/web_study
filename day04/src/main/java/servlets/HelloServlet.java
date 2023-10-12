package servlets;

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
    }

    @Override
    public void destroy() {
        System.out.println("destroy"); //서버가 꺼질 때 실행됨.
    }

    @Override
    public void init() throws ServletException {
        System.out.println("init"); //객체가 만들어지면 바로 실행됨.
    }
}
