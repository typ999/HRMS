<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/29 0029
  Time: 16:36
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
</head>
<body>
<table border="1" cellspacing="0" cellpadding="5">
    <tr>
        <td colspan="6"><center><b>个人简历</b></center></td>
    </tr>
    <tr>
        <td rowspan="5">个人信息</td>
        <td>姓名</td>
        <td>佟雨朋</td>
        <td>性别</td>
        <td>男</td>
        <td rowspan="5"><img src="新建文件夹%20(2)/唐门1.jpg" height="220" width="140"></td>
    </tr>
    <tr>
        <td>出生年月</td>
        <td>1996.3.19</td>
        <td>名族</td>
        <td>汉族</td>
    </tr>
    <tr>
        <td>籍贯</td>
        <td>沈阳</td>
        <td>政治面貌</td>
        <td>团员</td>
    </tr>
    <tr>
        <td>毕业院校</td>
        <td>上师天华</td>
        <td>学历</td>
        <td>本科</td>
    </tr>
    <tr>
        <td>专业</td>
        <td>计科</td>
        <td>学位</td>
        <td>暂无</td>
    </tr>
    <tr>
        <td rowspan="2">联系方式</td>
        <td>联系电话</td>
        <td colspan="4">18701859935</td>
    </tr>
    <tr>
        <td>E-mail</td>
        <td colspan="4">593465729@qq.com</td>
    </tr>
    <tr>
        <td rowspan="2">个人能力</td>
        <td>计算机水平</td>
        <td colspan="4">二级</td>
    </tr>
    <tr>
        <td>英语水平</td>
        <td colspan="4">一般</td>
    </tr>
    <tr>
        <td rowspan="4">自我评价</td>
        <td colspan="5">&nbsp</td>
    </tr>
    <tr></tr>
    <tr></tr>
    <tr></tr>
    <tr>
        <td rowspan="4">教育背景</td>
        <td colspan="5">&nbsp</td>
    </tr>
    <tr></tr>
    <tr></tr>
    <tr></tr>
    <tr></tr>
    <tr>
        <td rowspan="4">社会实践</td>
        <td colspan="5">&nbsp</td>
    </tr>
</table>
</body>
</html>
