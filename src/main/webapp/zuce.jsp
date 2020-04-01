<%--
  Created by IntelliJ IDEA.
  User: MI
  Date: 2020/3/26
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
</head>
<script type="text/javascript">
    $(function () {

        alert("xx");

    })


</script>
<body>

<form action="/exercise/book/zuce.do">
    账号：<input type="text" name="username"> <br><br>

    密码:<input type="password" name="password"> <br><br>

    <input type="submit" value="注册">
</form>



</body>
</html>
