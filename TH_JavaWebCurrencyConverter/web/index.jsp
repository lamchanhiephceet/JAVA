<%--
  Created by IntelliJ IDEA.
  User: HN
  Date: 7/31/2020
  Time: 2:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Currency Converter</title>
  <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<h2>Currency Converter</h2>
<form method="post" action="${pageContext.request.contextPath}/convert">
  <label>Rate: </label><br/>

  <label>
    <input type="text" name="rate" placeholder="RATE" value="23000"/>
  </label><br/>
  <label>USD: </label><br/>

  <label>
    <input type="text" name="usd" placeholder="USD" value="0"/>
  </label><br/>
  <input type = "submit" id = "submit" value = "Converter"/>
</form>
</body>
</html>
