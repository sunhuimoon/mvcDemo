<%--
  Created by IntelliJ IDEA.
  User: sunhui
  Date: 2020/11/19
  Time: 11:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>hello</title>
</head>
<body>
<h3>这是一个标题。</h3>
<h3>这是一个标题。</h3>
id:${requestScope.user.id}<br/>
email:${requestScope.user.email}<br/>
username:${requestScope.user.username}<br/>
role:${requestScope.user.role}<br/>
mobile:${requestScope.user.mobile}<br/>
</body>
</html>
