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
</head>
<body>
<h3>增加账户</h3>

<form action="../account/add" method="post">
    姓名：<input type="text"name="name"><br/>
    金额：<input type="text"name="money"><br/>
    <input type="submit" value="保存">
</form>
<a href="../account/zhu">返回主菜单</a>
</body>
</html>
