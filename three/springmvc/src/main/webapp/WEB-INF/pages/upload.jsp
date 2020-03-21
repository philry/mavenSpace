<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2018/11/23
  Time: 9:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>

    <h1>文件上传</h1>
    <hr/>

    <form action="${pageContext.request.contextPath}/file/uploads" method="post" enctype="multipart/form-data">
        用户名:<input type="text" name="username"/><br/>
        文件1:<input type="file" name="file"/><br/>
        文件2:<input type="file" name="file"/><br/>
        <input type="submit" value="提交">
    </form>




</body>
</html>
