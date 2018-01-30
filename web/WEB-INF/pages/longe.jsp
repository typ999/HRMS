<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/29 0029
  Time: 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title></title>
    <link rel="stylesheet" href="css/index.css">
    <script src="js/jquery-3.1.0.js"></script>
    <script>
        $(document).ready(function () {
            $('input[name="u_name"]').focus(function() {

            }).blur(function(){
                $.ajax({
                    type:"post",
                    url:"longeName",
                    data:"u_name="+$(this).val(),
                    success:function (data) {
                            $("#sp1").html(data);
                            $("#sp1").css("color","red");

                    }
                })

            })
            $('input[name="u_pass"]').click(function () {
                $.ajax({
                    type: "post",
                    url: "longePass",
                    data: {"u_name=": $(this).val(), "u_pass=": $(this).val()},
                    success: function (data) {
                        $("#sp2").html(data);
                        $("#sp2").css("color", "red");

                    }
                })
            })
        });
    </script>
</head>
<body background="image/back1.jpg">
<form action="login" method="post">
    <div class="back">
        <div class="center" >
            <label class="label1"  style="font-family: '宋体'">用户名:</label>
            <input type="text" name="u_name" class="login"  placeholder="请输入用户名">
            <br/><span class='state1' id="sp1"></span><br/><br/>
            <label class="label2"  style="font-family: '宋体'">密&nbsp;码:</label>
            <input type="password" name="u_pass"  class="login" placeholder="请输入密码">
            <br><span class='state1' id="sp2"></span><br><br/>
            <input type="submit" id="login-in"  value="登录"/>
            <a href="forAddJsp" class="sign" >注册</a>
            <br>
        </div>
    </div>
</form>

</body>
</html>
