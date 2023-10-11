package models.member;

import jakarta.servlet.http.HttpServletRequest;

public class LoginService {
    public void login(HttpServletRequest request){
        String userId = request.getParameter("userId");
        String userPw = request.getParameter("userPw");

        System.out.printf("userId = %s, userPw = %s", userId, userPw);
    }
}
