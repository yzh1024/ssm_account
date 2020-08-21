<%--
  Created by IntelliJ IDEA.
  User: YZH
  Date: 2020/8/18
  Time: 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>增加账户</title>
    <script src="../js/jquery.min.js"></script>

    <script>
        $(function () {
            $("#btn").click(function () {
                alert("添加成功")
            });
        });
    </script>
</head>
<body>
<h3>增加账户</h3>

<form action="../account/add" method="post">
    姓名：<input type="text"name="name"><br/>
    金额：<input type="text"name="money"><br/>
    <input id="btn" type="submit" value="保存">
</form>
<a href="../account/zhu">返回主菜单</a>
</body>
</html>
