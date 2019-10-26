<%--
  Created by IntelliJ IDEA.
  User: FAST
  Date: 2019/10/25
  Time: 15:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>角色管理</title>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/css/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/stylesheets/theme.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/css/font-awesome/css/font-awesome.css">
    <script src="${pageContext.request.contextPath}/css/jquery-1.8.1.min.js"
            type="text/javascript"></script>
</head>
<body>
    <form action="${pageContext.request.contextPath}/SysRole/rolelist">
            <label>角色名：</label>
            <input type="text" name="rolename" value="${param.rolename}"/>
            <input type="submit" value="查找" />
            <input type="button" value="增加" href="${pageContext.request.contextPath}">
<%--        <label>角色状态：</label>--%>
<%--        <select name="rolestate">--%>
<%--            <c:choose>--%>
<%--                <c:when test="${param.rolestate==1}">--%>
<%--                    <option value="1" selected="selected">可用</option>--%>
<%--                    <option value="0">不可用</option>--%>
<%--                    <option value="-1">全部</option>--%>
<%--                </c:when>--%>
<%--                <c:when test="${param.rolestate==0}">--%>
<%--                    <option value="1">可用</option>xi--%>
<%--                    <option value="0" selected="selected">不可用</option>--%>
<%--                    <option value="-1">全部</option>--%>
<%--                </c:when>--%>
<%--                <c:otherwise>--%>
<%--                    <option value="1">可用</option>--%>
<%--                    <option value="0">不可用</option>--%>
<%--                    <option value="-1" selected="selected">全部</option>--%>
<%--                </c:otherwise>--%>
<%--            </c:choose>--%>
<%--        </select>--%>
    </form>
    <table class="table table-bordered">
        <thead>
            <tr>
                <th>角色名称</th>
                <th>角色状态</th>
                <th>操作</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${list}" var="sysrole">
                <tr>
                    <td>${sysrole.rolename}</td>
                    <td>
                        <c:choose>
                            <c:when test="${sysrole.rolestate==1}">可用</c:when>
                            <c:otherwise>不可用</c:otherwise>
                        </c:choose>
                    </td>
                    <td><a href="${pageContext.request.contextPath}/SysRole/toedit?${sysrole.roleid}">编辑</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
