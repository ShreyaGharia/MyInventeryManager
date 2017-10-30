<%--
  Created by IntelliJ IDEA.
  User: TR Porwal
  Date: 10/28/2017
  Time: 11:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Inventery</title>
</head>
<body>

<h1>View Inventery</h1>
<form method="GET" action="/InventeryController">
    <table>
        <c:forEach items="${item_id}" var="item_id" varStatus="loop">
            <c:set var="itemname" value="${itemname[loop.index]}" />
            <c:set var="units" value="${units[loop.index]}"/>
            <tr>
                <td><c:out value="$item_id"/></td>
                <td><c:out value="${itemname}" /></td>
                <td><c:out value="${units}" /></td>
            </tr>
        </c:forEach>
    </table>
    <input
            type="submit" value="Submit" />
</form>
</body>
</html>
