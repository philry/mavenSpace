<%--
  Created by IntelliJ IDEA.
  User: soft01
  Date: 18-11-14
  Time: 上午10:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册</title>
</head>
<body>
    <h1>用户注册</h1><hr/>
    <form method="post" action="${pageContext.request.contextPath}/regist">
        用&nbsp;&nbsp;户&nbsp;&nbsp;名：<input type="text" name="username"><br>
        输入密码：<input type="password" name="password"><br>
        确认密码：<input type="password" name="rePassword"><br>
        <input type="submit" value="注册">
        <span style="color:red">${registMsg}</span>
    </form>
</body>
</html>
