<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index page</title>

<script type="text/javascript" src="js/jquery-1.3.2.min.js"></script>

<script type="text/javascript">


function createAjax(){
	
	
	var ajax=null;
	try {
		ajax=new XMLHttpRequest();
	} catch (e) {
		ajax=new ActiveXObject("Microsoft.XMLHTTP");
	}
	
	return ajax;
	
}

function checkUsername(){
	var ajax=createAjax();
	
	var username=$("#username").val();
	console.log(username);
	
	ajax.onreadystatechange=function(){
		
		if(ajax.readyState==4){
			
			if(ajax.status==200){
				var result=ajax.responseText;
				console.log(result)
				if(result==1){
					$("#msg_name").html("<b style='color:blue'>恭喜你,用户名可用</b>");
				}else{
					$("#msg_name").html("<b style='color:yellow'>恭喜你,用户名不可用</b>");
				}
				
				
			}else{
				alert("error");
			}
		}
	}
	
	
	ajax.open("POST","/mypro-0102/firstServlet");
	
	
	
	
	ajax.setRequestHeader("Content-Type","application/x-www-form-urlencoded"); 
	console.log(ajax);
	ajax.send("user="+username);
	
	
	
}


</script>
</head>
<body>


姓名：<input name="username" id="username" type="text" onblur="checkUsername()" />
<span id="msg_name"></span>
<br/>
密码:<input name="password" type="password"  / >
<span id="msg_pwd"></span>
<br/>
<input type="submit"  value="submit" /> 


<jsp:forward page="myservlet2.jsp"></jsp:forward>
</body>
</html>