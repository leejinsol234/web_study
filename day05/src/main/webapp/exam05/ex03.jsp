<%@ page contentType="text/html; charset=UTF-8"%>
<jsp:useBean id="member" class="models.members.Member" />
<%--
<jsp:setProperty name="member" property="userId" value="사용자01" />
<jsp:setProperty name="member" property="userPw" value="123456" />
<jsp:setProperty name="member" property="email" value="user01@test.org" />
위와 같이 값을 직접 대입하는 경우는 드물다.--%>

<%--
<jsp:setProperty name="member" property="userId" />
<jsp:setProperty name="member" property="userPw" />
<jsp:setProperty name="member" property="email" />
--%>

<jsp:setProperty name="member" property="*" />
<%--property와 name을 매치시켜야 자동으로 값이 입력됨. 다를 경우 param으로 매치시킬 수 있다.--%>
<jsp:setProperty name="member" property="userId" param="memId" />
아이디 : <jsp:getProperty name="member" property="userId" /><br>
비밀번호 : <jsp:getProperty name="member" property="userPw" /><br>
이메일 : <jsp:getProperty name="member" property="email" /><br>