<%--
  Created by IntelliJ IDEA.
  User: soft01
  Date: 18-11-23
  Time: 上午9:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
    <h1>文件上传</h1><hr>

    <form action="${pageContext.request.contextPath}/file/upload" method="post" enctype="multipart/form-data">
        用户名：<input type="text" name="username"><br>
        文件名：<input type="file" name="file"><br>
        <input type="submit">
    </form>
</body>
</html>
