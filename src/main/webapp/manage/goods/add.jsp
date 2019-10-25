<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>goods_add</title>
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
<input type="text" value="川菜" id="gtname"><span id="ssss"></span>
<input type="text" id="gname" onblur="add()">
<button id="but">点击</button>
<script>
//    var add=function () {
        <%--$.ajax({--%>
            <%--url:"${pageContext.request.contextPath}/manage/goods/ajax",--%>
            <%--data:{"gtname":$("#gtname").val(),"gname":$("#gname").val()},--%>
            <%--success:function (data) {--%>
               <%--alert(data);--%>
               <%--console.log(data)--%>
            <%--}--%>
            <%--})--%>
    <%--}--%>
    $(function(){
        alert("asd");
        $("#but").on("click",function(){
            $.ajax({
                type: "post",
                url: "${pageContext.request.contextPath }/ss/aa",
                contentType: "application/json;charset=utf-8",
                data: '{"roleName":"asdfadsf"}',
                dataType: "json",
                success:function(data){
                    alert(data);
                }
        })
    })
})



</script>
</body>
</html>
