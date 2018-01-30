<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/29 0029
  Time: 10:40
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
<form action="getResumes" method="post">
    <input type="submit" value="查看简历">
</form>
<form action="foraddResumeJsp" method="post">
    <input type="submit" value="添加修改简历">
</form>
<c:forEach items="${sessionScope.recruitments}" var="rec">
    <div>
        <c:forEach items="${sessionScope.companys}" var="com">
            <c:choose>
            <c:when test="${rec.c_id==com.c_id}">
                公司名：${com.c_name}
            </c:when>
            </c:choose>
        </c:forEach>
        <c:forEach items="${sessionScope.jobs}" var="job">
            <c:choose>
                <c:when test="${rec.j_id==job.j_id}">
                   职务： ${job.j_name}
                </c:when>
            </c:choose>
        </c:forEach>
        薪水：${rec.rm_money}
        详情：${rec.rm_requirement}
        需要人数：${rec.rm_people}
        <form action="addDeparAndRes" method="post">
            <input type="hidden" value="${rec.rm_id}" name="rm_id"/>
            <input type="submit"value="投递简历">
        </form>
    </div>
</c:forEach>
</body>
</html>
