<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<% Object userName = request.getSession().getAttribute("userName"); %>
<c:if test="${userName==null }">
  <a href="<c:url value="login" />">login</a>
    <a href="<c:url value="register" />">register</a>
  
</c:if>
<c:if test="${userName!=null }">
  登陆成功 <%=userName.toString() %> <a href="<c:url value="sessions/destroy" />">logout</a>
</c:if>
</body>
</html>