<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户界面</title>
</head>
<body>


<h3>用户的管理</h3>
<a href="${ pageContext.request.contextPath }/userAction!save.do">添加用户</a> <br/>
<a href="${ pageContext.request.contextPath }/userAction!update.do">修改用户</a> <br/>
<a href="${ pageContext.request.contextPath }/userAction!delete.do">删除用户</a> <br/>
<a href="${ pageContext.request.contextPath }/userAction!find.do">查询用户</a> <br/>

</body>
</html>