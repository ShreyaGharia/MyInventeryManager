
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
    <title>Add Inventery</title>
</head>
<body>

<h1>Add Inventery</h1>
<form method="POST" action="/InventeryController">
    Item ID : <input type="text" name="id"
                     value= ""/> <br />
    Item Name : <input
        type="text" name="itemName"
        value="" <br />
    Units: <input
        type="text" name="units"
        value="" /> <br />
    <br /> <input
        type="submit" value="Submit" />
</form>
</body>
</html>



