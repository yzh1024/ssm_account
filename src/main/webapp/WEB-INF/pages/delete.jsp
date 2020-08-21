<%--
  Created by IntelliJ IDEA.
  User: YZH
  Date: 2020/8/18
  Time: 11:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>删除账户</title>
    <script src="../js/jquery.min.js"></script>

    <script>
        $(function () {
            $("#btn").click(function () {
                alert("删除成功")
            });
        });
    </script>
</head>
<body>
<h3>删除账户</h3>
<form action="../account/delete" method="post">
    请输入要删除的id：<input type="text"name="id"><br/>
    <input id="btn" type="submit" value="删除">
</form>

<a href="../account/zhu">返回主菜单</a>
</body>
</html>
