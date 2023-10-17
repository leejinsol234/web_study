<%@ page contentType="text/html; charset=UTF-8"%>
<%
    //pageContext.setAttribute("num1",100);
    request.setAttribute("num1",200);
    application.setAttribute("num1",300);
%>


<%--동일한 속성명이 존재할 경우 적용되는 우선순위(좁은 범위부터 넓은 범위로)가 존재한다.--%>
num1: ${num1}<br>

<%--EL표현식의 내장객체--%>
<%--마침표(.) 또는 대괄호(['속성명'])의 두 가지 방법으로 작성 가능--%>
pageScope: ${pageScope.num1}<br>
requestScope: ${requestScope.num1}<br>
applicationScope: ${applicationScope['num1']}

