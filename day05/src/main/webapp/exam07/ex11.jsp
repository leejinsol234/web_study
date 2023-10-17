<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<%--var: context경로가 포함된 주소를 변수로 바꿔준다.--%>

<c:url var="link" value='/exam07/ex10.jsp'>
    <c:param name="key1" value="value1"/>
</c:url>

<a href="<%=request.getContextPath()%>/exam07/ex10.jsp">링크1</a>
<a href="${pageContext.request.contextPath}/exam07/ex10.jsp">링크2</a>
<a href="${link}">링크3</a>
<a href="${link}">링크4</a>
