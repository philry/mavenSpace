<%--
  Created by IntelliJ IDEA.
  User: soft01
  Date: 18-11-21
  Time: 下午2:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>
    <h1>用户登录</h1><hr>
    <form action="${pageContext.request.contextPath}/login" method="post">
        用户名：<input type="text" name="username"> <br>
        密&nbsp;&nbsp;&nbsp;码：<input type="password" name="password"><br>
        <input type="submit" value="登录"><br>
        <span style="color:red">${loginMsg}</span>
    </form>
</body>
</html>
