<%--
  Created by IntelliJ IDEA.
  User: HN
  Date: 7/31/2020
  Time: 11:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>simple login</title>
    <style type="text/css">
      .login{
        height:180px;width:230px;
        margin:0;
        padding:10px;
        border:1px#CCC solid;
      }
      .login{
        padding:5px;
        margin:5px;
      }
    </style>
  </head>
  <body>
  <form method="post" action="login">
    <div class="login">
      <h2>Login</h2>
      <input type="text" name="username" size="30" placeholder="username"/> <br>
      <input type="password" name="password" size="30" placeholder="password"/> <br>
      <input type="submit" value="Sign in"/>
    </div>
  </form>
  </body>
</html>
