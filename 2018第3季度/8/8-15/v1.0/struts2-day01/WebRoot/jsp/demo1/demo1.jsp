<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>demo1 jsp pages</title>
</head>
<body>

<h1>struts2 ActionContext 访问Servlet的API的方式1</h1>


<form action="${pageContext.request.contextPath }/requestDemo1.do" method="post">

姓名:<input type="text" name="name" />
年龄:<input type="text" name="age"/>
<input type="submit" value="提交"/>


</form>
</body>
</html>