<%--
  Created by IntelliJ IDEA.
  User: Snorlax
  Date: 2019/10/28
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>增加用户</title>
</head>
<body>
<ul class="breadcrumb">
    <li><a href="#">用户管理</a> <span class="divider">/</span></li>
    <li class="active">增加用户</li>
</ul>
<div class="alert">
    <button type="button" class="close" data-dismiss="alert">×</button>
    <h4>提示!</h4>
    <strong>${msg}</strong>
</div>
<div class="row-fluid">
    <div class="span12">
        <form class="form-horizontal"
              action="${pageContext.request.contextPath}/user/addUser"
              method="post">
            <!-- <input style="display:none" id="roleid" type="text" value="1" name="roleid"/> -->
            <div class="control-group">
                <label class="control-label" for="username">用户名:</label>
                <div class="controls">
                    <input id="username" type="text" name="username" />
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="usertruename">真实姓名:</label>
                <div class="controls">
                    <input id="usertruename" type="text" name="usertruename" />
                </div>
            </div>
            <%--<div class="control-group">--%>
                <%--<label class="control-label" for="rolename">用户角色:</label>--%>
                <%--<div class="controls">--%>
                    <%--<select id="roleid" name="roleid">--%>
                        <%--<c:forEach items="${list}" var="item">--%>
                            <%--<option value="${item.roleid}">${item.rolename}</option>--%>
                        <%--</c:forEach>--%>
                    <%--</select>--%>
                <%--</div>--%>
            <%--</div>--%>
            <%--<div class="control-group">--%>
                <%--<label class="control-label" for="userphone">联系电话:</label>--%>
                <%--<div class="controls">--%>
                    <%--<input id="userphone" type="text" name="userphone" />--%>
                <%--</div>--%>
            <%--</div>--%>
            <div class="control-group">
                <label class="control-label" for="userpwd">用户密码:</label>
                <div class="controls">
                    <input id="userpwd" type="password" name="userpwd" />
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="usersex">用户性别:</label>
                <div class="controls">
                    <select id="usersex" name="usersex">
                        <option value="1">男</option>
                        <option value="0">女</option>
                    </select>
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="userstate">用户状态：</label>
                <div class="controls">
                    <select id="userstate" name="userstate">
                        <option value="1">可用</option>
                        <option value="0">不可用</option>
                    </select>
                </div>
            </div>
            <div class="control-group">
                <div class="controls">
                    <input type="submit" class="btn" value="提交" />
                    <button class="btn btn-primary" type="button" onclick="javascript:location.href='${pageContext.request.contextPath}/user/allUser';">返回</button>
                </div>
            </div>
        </form>
    </div>
</div>


</body>
</html>
