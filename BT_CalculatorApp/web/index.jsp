<%--
  Created by IntelliJ IDEA.
  User: HN
  Date: 8/3/2020
  Time: 11:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Calculator</title>
  <style>
    td{
      font-family: "Abyssinica SIL";
    }
    form{
      margin-left: 20%;
      margin-right: 20%;
      margin-bottom: 20%;
      border: 1px solid cadetblue;
    }
    h1{
      margin-left: 20%;
      margin-right: 20%;
      margin-bottom: 2%;
    }
    #Button {
      /*padding-left: 20%;*/
    }
    fieldset{
      padding-left: 20%;
    }
  </style>
</head>
<body>
<h1 style="padding-left: 20%">Simple Calculator</h1>
<form method="post" action="CalculatorServlet">
  <fieldset>
  <legend>Calculator</legend>
  <table>
    <tr>
      <td>First operand: </td>
      <td><input name="first-operand" type="text"/></td>
    </tr>
    <tr>
      <td>Operator: </td>
      <td>
        <select name="operator">
          <option value="+">Addition</option>
          <option value="-">Subtraction</option>
          <option value="*">Multiplication</option>
          <option value="/">Division</option>
        </select>
      </td>
    </tr>
    <tr>
      <td>Second operand: </td>
      <td><input name="second-operand" type="text"/></td>
    </tr>
    <tr>
      <td></td>
      <td><input type="submit" value="Calculate" id="Button"/></td>
    </tr>
  </table>
  </fieldset>
</form>
</body>
</html>