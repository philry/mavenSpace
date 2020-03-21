<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2018/11/14
  Time: 9:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>

    <h1>用户登录</h1>
    <hr/>

    <form action="${pageContext.request.contextPath}/login" method="post">
        用户名:<input type="text" name="username"/><br/>
        密码:<input type="password" name="password"/><br/>
        <input type="submit" value="登录">
        <span style="color:red;">${loginMsg}</span>
    </form>

</body>
</html>
