<%--
  Created by IntelliJ IDEA.
  User: soft01
  Date: 18-11-20
  Time: 下午5:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>
    <h1>用户登录</h1><hr/>
    <form action="${pageContext.request.ContextPath}/login" method="post">
        用户名:<input type="text" value="用户名"><br/>
        密&nbsp;&nbsp;&nbsp;码:<input type="password" value="密码"><br/>
        <input type="submit" value="登录"><br/>
        <span style="color :red">${loginMsg}</span>
    </form>
</body>
</html>
