<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/30 0030
  Time: 10:18
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
<form action="addCompany" method="post">
    公司名称：<input type="text" name="c_name">
    公司地址：<input type="text" name="c_address">
    公司电话：<input type="text" name="c_phone">
    公司详情：<input type="text" name="c_blurb">
    <input type="submit" value="添加公司">
</form>
<form action="addDep" method="post">
    部门名称：<input type="text" name="d_name">
    <input type="submit" value="添加部门">
</form>
<form action="addJob" method="post">
    职务名称：<input type="text" name="j_name">
    <input type="submit" value="添加职务">
</form>
<c:forEach items="${sessionScope.companys}" var="com">
    ${com}
</c:forEach>
<c:forEach items="${sessionScope.jobs}" var="job">
    ${job}
</c:forEach>
<form action="addRec" method="post">
    公司ID：<input type="text" name="c_id">
    职务ID：<input type="text" name="j_id">
    薪资：<input type="text" name="rm_money">
    详情：<input type="text" name="rm_requirement">
    人数：<input type="text" name="rm_people">
    <input type="submit" value="添加招聘">
</form>
</body>
</html>
