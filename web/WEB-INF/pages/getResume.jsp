<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<c:forEach items="${sessionScope.resumes}" var="re">
<table border="1" cellspacing="0" cellpadding="5">
    <tr>
        <td colspan="6"><center><b>个人简历</b></center></td>
    </tr>
    <tr>
        <td rowspan="4">个人信息</td>
        <td>姓名</td>
        <td>${re.r_name}</td>
        <td>性别</td>
        <td>${re.r_sex}</td>
        <td rowspan="4"></td>
    </tr>
    <tr>
        <td>出生年月</td>
        <td>${re.r_birthday}</td>
        <td>名族</td>
        <td>${re.r_national}</td>
    </tr>
    <tr>
        <td>毕业院校</td>
        <td>${re.r_school}</td>
        <td>学历</td>
        <td>${re.r_degree}</td>
    </tr>
    <tr>
        <td>专业</td>
        <td>${re.r_professional}</td>
        <td>意向</td>
        <td>${re.r_intention}</td>
    </tr>
    <tr>
        <td rowspan="2">联系方式</td>
        <td>联系电话</td>
        <td colspan="4">${re.r_phone}</td>
    </tr>
    <tr>
        <td>E-mail</td>
        <td colspan="4">${re.r_email}</td>
    </tr>
    <tr>
        <td>个人能力</td>
        <td colspan="5">${re.r_skills}</td>
    </tr>
    <tr>
        <td rowspan="4">自我评价</td>
        <td colspan="5">${re.r_self}</td>
    </tr>
    <tr></tr>
    <tr></tr>
    <tr></tr>
    <tr>
        <td rowspan="4">工作经历</td>
        <td colspan="5">${re.r_experience}</td>
    </tr>
</table>
</c:forEach>
</body>
</html>
