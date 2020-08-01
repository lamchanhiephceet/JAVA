<%--
  Created by IntelliJ IDEA.
  User: HN
  Date: 8/1/2020
  Time: 10:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>
    <link rel="stylesheet" type="text/css" href="css/style.css"/>
  </head>
  <body>
  <div id="cpntent">
    <h1>Product Discount Calculator</h1>
    <form method="post" action="discount">
      <div id="data">

        <label>Product Description
        <input type="=text" name="productDescription"/>
        </label><br>
        <label> List Price:
        <input type="text" name="listPrice"/>
        </label><br>
        <label>Discount Percent:
        <input type="text" name="discountPercent"/>
        </label><br>

      </div>

      <div id="buttons">
        <label>&nbsp;
        <input type="submit" value="Calculate Discount"/>
        </label>
      </div>
    </form>
  </div>
  </body>
</html>
