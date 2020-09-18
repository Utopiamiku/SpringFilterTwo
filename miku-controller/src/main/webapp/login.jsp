<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <%
        String path = request.getContextPath();
        String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
    %>

    <base href="<%=basePath%>">
</head>
<body>
Utopiamiku
<form action="login" method="post">
    <input type="text" name="userName"><br/>
    <input type="password" name="userPwd"><br/>
    <security:csrfInput/>
    <input type="checkbox" name="remember-me"/>记住密码<br/>
    <button type="submit">登录</button><font color="red">${error==1?"登录失败":""}</font>
</form>
</body>
</html>