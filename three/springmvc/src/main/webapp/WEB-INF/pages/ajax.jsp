<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2018/11/22
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.9.1.min.js"></script>
    <script type="text/javascript">
        $(function(){
           $("#username").blur(function(){
              $.ajax({
                 type:"post",
                 url:"${pageContext.request.contextPath}/ajax/checkUsername",
                 data:{"username":$(this).val()},
                 dataType:"text",
                 success:function(result){
                     $("#s1").html(result);
                 }
              });
           });

           $("#show").click(function(){
               $.ajax({
                   type:"post",
                   url:"${pageContext.request.contextPath}/ajax/find",
                   dataType:"json",
                   success:function(user){
                       $("#s2").html(user.id);
                       $("#s3").html(user.username);
                       $("#s4").html(user.password);
                       $("#s5").html(user.phone);
                       $("#s6").html(user.address);
                   }
               })
           });

        });
    </script>
</head>
<body>

    <input type="text" id="username">
    <span id="s1"></span>


    <hr/>
    <a href="javaScript:;" id="show">查看详情</a>
    <hr/>
    <div>
        编号:<span id="s2"></span><br/>
        用户名:<span id="s3"></span><br/>
        密码:<span id="s4"></span><br/>
        电话:<span id="s5"></span><br/>
        地址:<span id="s6"></span><br/>
    </div>

</body>
</html>
