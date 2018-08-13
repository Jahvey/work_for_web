<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>客户页面</title>
</head>
<body>
<h3>客户的管理</h3>
<a href="${ pageContext.request.contextPath }/saveCustomerAction.do">添加客户</a> <br/>
<a href="${ pageContext.request.contextPath }/updateCustomerAction.do">修改客户</a> <br/>
<a href="${ pageContext.request.contextPath }/deleteCustomerAction.do">删除客户</a> <br/>
<a href="${ pageContext.request.contextPath }/findCustomerAction.do">查询客户</a> <br/>
</body>
</html>