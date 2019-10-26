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
    <script>
        //增加跟节点
        function addroot() {
            $("#funpid").val("-1");
            $("#funpname").val("根节点");
            $("#funname").val("");
            $("#funurl").val("");
            $("#funid").val("");
            $("#addchild").attr("disabled", "disabled");
        }
        //增加子节点
        function addchild(){
            $("#funpid").val($("#funid").val());
            $("#funpname").val($("#funname").val());
            $("#funname").val("");
            $("#funurl").val("");
            $("#funid").val("");
            $("#addchild").attr("disabled","disabled");
        }

        //点击节点事件
        function check(obj){
            var o= $(obj);
            var pid = o.attr("datapid");
            var id = o.attr("dataid");
            var name = o.attr("dataname");
            var url = o.attr("dataurl");
            var state=o.attr("datastate");
            var pname=o.attr("datapname");

            $("#funpid").val(pid);
            $("#funname").val(name);
            $("#funurl").val(url);
            $("#funid").val(id);
            $("#funstate").val(state);
            $("#funpname").val(pname);

            if(pid=="-1"){
                //可以增加子节点
                $("#addchild").removeAttr("disabled");
            }else{
                $("#addchild").attr("disabled","disabled");
            }
        }

        //保存
        function save(){
            var funpid=$("#funpid").val();
            var funid=$("#funid").val();
            var funname=$("#funname").val();
            var funurl=$("#funurl").val();
            var funstate=$("#funstate").val();
            var cmd="add";
            if(funid!=""){
                cmd="edit";
            }
            $.ajax({
                type: "POST",
                url: "${pageContext.request.contextPath}/sys/fun/"+cmd,
                data: "funpid="+funpid+"&funid="+funid+"&funname="+funname+"&funurl="+funurl+"&funstate="+funstate,
                success: function(msg){
                    if(msg=="0"){
                        alert("保存失败");
                    }else{
                        alert("保存成功")
                        $("body").load("${pageContext.request.contextPath}/sys/fun/list");
                    }
                }
            });
        }
    </script>
    <style type="text/css">
        dt{
            cursor:pointer;
            line-height: 30px;
            font-size: 16px;
        }
        dd{
            cursor:pointer;
            line-height: 25px;
        }
    </style>
</head>
<body>

</body>
</html>
