<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>信息界面</title>
</head>
<body>

<h1>Struts2的属性驱动中:set方法的方式</h1>
<form action="${ pageContext.request.contextPath }/strutsDemo1.do" method="post">
	名称:<input type="text" name="name"><br/>
	年龄:<input type="text" name="age"><br/>
	生日:<input type="text" name="birthday"><br/>
	<input type="submit" value="提交">
</form>
</body>
</html>