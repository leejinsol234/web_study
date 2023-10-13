<%@ page contentType="text/html; charset=UTF-8" %>

<%
    // _jspService(...) 메서드 지역 내에 번역됨(지역 변수)
    int num1 = 100;
    int num2 = 200;
    //out.write("합계: "+(num1+num2+num3+num4));
    //out.write("합계: "+ add(num1,num2));
    int result = add(num1,num2);

%>

<%=result%>

<%!
    //선언문(번역되는 위치가 클래스명 바로 아래로, 멤버 변수로 추가된다.)
    int num3 = 300;
    int num4 = 400;

    int add(int num1,int num2){
            return num1+num2;
    }
%>