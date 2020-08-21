<%--
  Created by IntelliJ IDEA.
  User: YZH
  Date: 2020/8/18
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改账户</title>
    <script src="../js/jquery.min.js"></script>

    <script>
        $(function () {
            $("#btn").click(function () {
                alert("修改成功")
            });
        });
    </script>
</head>
<body>
<h3>修改账户</h3>

<form action="../account/change" method="post">
    请输入您要删除的id：<input type="text"name="id"><br/>
    请输入修改后的姓名：<input type="text"name="name"><br/>
    请输入修改后的金额：<input type="text"name="money"><br/>
    <input id="btn" type="submit" value="修改">
</form>

<a href="../account/zhu">返回主菜单</a>
</body>
</html>
