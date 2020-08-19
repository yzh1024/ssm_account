<%--
  Created by IntelliJ IDEA.
  User: YZH
  Date: 2020/8/17
  Time: 17:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h3>查询所有账户的信息</h3>

    <%--<c:forEach items="${list}" var="account">

    </c:forEach>--%>
        <%--${account.name}--%>
        <table border="1px" cellspacing="0" width="300px">
            <tr>
                <th>id</th>
                <th>姓名</th>
                <th>金额</th>
            </tr>

            <c:forEach items="${list}" var="account">
                <tr>
                    <th>${account.id}</th>
                    <th>${account.name}</th>
                    <th>${account.money}</th>
                </tr>
            </c:forEach>

        </table>

    <a href="../account/zhu">返回主菜单</a>



</body>
</html>
