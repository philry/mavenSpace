<%--
  Created by IntelliJ IDEA.
  User: soft01
  Date: 18-11-22
  Time: 下午4:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.9.1.min.js"></script>
    <script type="text/javascript">
        $(function(){
            $("#s2").click(function(){
                $.ajax({
                    type:"post",
                    url:"${pageContext.request.contextPath}/ajax/find",//在controller层找到对应的路径运行该方法
                    dataType:"json",  //从controller层传过来的数据类型
                    success:function(user){
                        $("#s3").html(user.id);
                        $("#s4").html(user.username);
                        $("#s5").html(user.password);
                        $("#s6").html(user.phone);
                        $("#s7").html(user.address);
                    }
                })
            })
        })
    </script>
</head>
<body>
    <a href="javaScript:;" id="s2">查看详情</a><hr>
    <div>
        编号：<span id="s3"></span><br>
        用户名：<span id="s4"></span><br>
        密码：<span id="s5"></span><br>
        电话：<span id="s6"></span><br>
        地址：<span id="s7"></span><br>
    </div>
</body>
</html>
