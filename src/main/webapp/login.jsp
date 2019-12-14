<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/12
  Time: 11:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
用户登录
<form action="check_Users.do" method="post">
    姓名：<input type="text" id="username" name="username"><br />
    密码：<input type="password" id="userpass" name="userpass"><br />
    <input type="submit" value="确定">
</form>
</body>
</html>
