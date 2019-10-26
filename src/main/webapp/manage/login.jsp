<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>登录页面</title>
</head>
<body>

<div align="center">
    <form action="${pageContext.request.contextPath}/login/login" method="post">
        <p>用户登录</p>
        账号：<input name="username" type="text" />
        <br><br>
        密码：<input name="userpwd" type="password" />
        <br><br>
        <input type="reset" value="撤 销" />
        <input type="submit" value="提 交" />
    </form>
</div>

</body>
</html>