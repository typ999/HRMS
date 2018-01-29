<%--
  Created by IntelliJ IDEA.
  User: Sope
  Date: 2018/1/17
  Time: 17:12
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
    <link rel="stylesheet" href="css/addUser.css">
    <title></title>
    <style>
        .state1{
            color:#aaa;
        }
        .state2{
            color:#000;
        }
        .state3{
            color:red;
        }
        .state4{
            color:green;
        }
    </style>
    <script src="js/jquery-3.1.0.js"></script>
    <script>
        var x = false;
        var y = false;
        var z = false;
        $(document).ready(function () {
            // 验证用户名
            $('input[name="u_name"]').focus(function(){
                $(this).next().text('用户名应该为4-16位之间，以字母开头').removeClass('state1').addClass('state2');
            }).blur(function(){
                if($(this).val().search(/^[A-Za-z]+[A-Za-z0-9]{4,16}$/)==-1){
                    $("#sp1").html("用户名应该为4-16位之间，以字母开头");
                    $("#sp1").css("color","red");
                }else{
                    $.ajax({
                        type:"post",
                        url:"checkName",
                        data:"name="+$(this).val(),
                        success:function (data) {
                            if (data.length==4){
                                $("#sp1").html(data);
                                $("#sp1").css("color","green");
                                x=true;
                            }else{
                                $("#sp1").html(data);
                                $("#sp1").css("color","red");
                            }
                        }
                    })
                }
            });

            //验证密码
            $('input[name="u_pass"]').focus(function(){
                $(this).next().text('密码应该为4-20位之间').removeClass('state1').addClass('state2');
            }).blur(function(){
                if($(this).val().search(/[A-Za-z0-9]{4,20}$/)==-1){
                    $(this).next().text('密码应该为4-20位之间').removeClass('state1').addClass('state3');
                }else{
                    $(this).next().text('输入成功').removeClass('state1').addClass('state4');
                    y=true;
                }
            });

            //验证确认密码
            $('input[name="repass"]').focus(function(){
                $(this).next().text('输入的确认密码要和上面的密码一致,规则也要相同').removeClass('state1').addClass('state2');
            }).blur(function(){
                if($(this).val().search(/[0-9]{4,20}$/)==-1&& $(this).val() != $('input[name="pass"]').val()){
                    $(this).next().text('输入的确认密码要和上面的密码一致,规则也要相同').removeClass('state1').addClass('state3');
                }else{
                    $(this).next().text('输入成功').removeClass('state1').addClass('state4');
                    z=true;
                }
            });
            $("#upass").keydown(function () {
                var len = $("#upass").val().length;
                if (len<4){
                    $("#w").css("backgroundColor","red");
                    $("#m").css("backgroundColor","rgba(0,0,0,0)");
                    $("#s").css("backgroundColor","rgba(0,0,0,0)");
                    $("#error2").html("密码不得少于4位");
                }else if (len>=4&&len<=7){
                    $("#error2").html("");
                    $("#w").css("backgroundColor","red");
                    $("#m").css("backgroundColor","yellow");
                    $("#s").css("backgroundColor","rgba(0,0,0,0)");
                }else{
                    $("#error2").html("");
                    $("#w").css("backgroundColor","red");
                    $("#m").css("backgroundColor","yellow");
                    $("#s").css("backgroundColor","green");
                }
            });
        });
        function checkAll() {
            if (x){
                if (y){
                    if(z){
                        return true;
                    }
                }
            }
            alert("输入有误，请检查！");
            return false;
        }
    </script>

</head>
<body background="image/timg (2).jpg">
<div class="center">
    <form action="adduser" method="post" onsubmit="return checkAll()">
        用 户 名:<input type="text" name="u_name" placeholder="请输入用户名" class="input" >
        <span class='state1' id="sp1"></span><br/><br/>
        密　　码:<input type="password" name="u_pass" id="upass" placeholder="请输入密码" class="input">
        <span class='state1'></span><br/>
        <span id="w">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
        <span id="m">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
        <span id="s">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
        <div id="error2"></div>
        确认密码:<input type="password" name="repass" placeholder="请输入确认密码" class="input">
        <span class='state1'></span><br/><br/>
        <input type="submit" value="注册" class="sign-up" >
    </form>
</div>

</body>
</html>
