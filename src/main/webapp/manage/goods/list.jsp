<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>goods_list</title>
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

<ul class="breadcrumb">
    <li><a href="#">菜品信息管理</a> <span class="divider">/</span></li>
    <li class="active">菜品列表</li>
</ul>
<div>
    <form class="search-well" action="${pageContext.request.contextPath }/manage/goods/list" method="post">
        菜名：<input type="text" name="gname" value="${param.gname}"/>
        状态：
        <select name="gstate">
            <c:choose>
                <c:when test="${param.gstate==1}">
                    <option value="-1" >全部</option>
                    <option value="1" selected="selected">可用</option>
                    <option value="0">不可用</option>
                </c:when>
                <c:when test="${param.gstate==0}">
                    <option value="-1">全部</option>
                    <option value="1">可用</option>
                    <option value="0" selected="selected">不可用</option>
                </c:when>
                <c:otherwise>
                    <option value="-1">全部</option>
                    <option value="1">可用</option>
                    <option value="0">不可用</option>
                </c:otherwise>
            </c:choose>
        </select>

        <input type="submit" value="查找" />
        <input type="button" value="增加" onclick="window.location.href='${pageContext.request.contextPath}/manage/goods/add'" />
    </form>
    <table class="table table-bordered">
        <thead>
        <tr>
            <th>菜名</th>
            <th>价格</th>
            <th>描述</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${list}" var="goods">

            <tr>
                <td>${goods.gname}</td>
                <td>${goods.gprice}</td>
                <td>${goods.gcontent}</td>
                <td>
                    <c:choose>
                        <c:when test="${goods.gstate==1}">可用</c:when>
                        <c:otherwise>不可用</c:otherwise>
                    </c:choose>
                </td>
                <td>
                    <a href="${pageContext.request.contextPath }/manage/goods/toedit${goods.gid}">编辑</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <%--<%@ include file="/tools/pager.jsp" %>--%>
</div>
</body>
</html>
