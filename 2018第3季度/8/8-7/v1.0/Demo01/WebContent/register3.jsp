<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>注册3</title>
</head>
<script type="text/javascript" src="js/jquery-2.0.3.min.js"></script>
<script type="text/javascript">

    $(document).ready(function(){
         //给账号文本框绑定失去焦点的事件
        
         $("#regist").click(function(){
        	// $("#account").blur(function(){
        		 var accountData=$("#account").val()
        		 accountData=$.trim(accountData) 
        		 var pwdData=$("#password").val()
        		 pwdData=$.trim(pwdData) 
        		
	             alert("测试--->"+accountData+"::"+pwdData);
	             $.ajax({
                 url:"system/UserCheck3Servlet",//设置服务器地址，即为servlet配置的url-pattern
                 type:"post",//提交的方式
	                 data:{ 
	                	 account:accountData,
	                	 pwd:pwdData
	               	},//提交到服务器的数据，多个值以逗号分割开{account:$(this).val(),...}
	              
	                 success:function(data){//回调函数，data是返回的数据
	                     $("#errorAccount").html(data);
	                 }
	             });
	         });
	     });

</script>
<body>

<center>
<form action="" method="post">
         <table>
             <caption>注册的页面3</caption>
             <tr>
             	<td>账号：</td>
             	<td>
             		<input type="text" name="account" id="account" placeholder="username" />
             	  <div id="errorAccount" style="color:red;display:inline;" ></div>
             	</td>
             </tr>
             <tr>
             	<td>密码：</td>
             	<td>
             		<input type="password" name="password" id="password" placeholder="password">
             	</td>
             </tr>
             <center>
             <tr>
             
             	<td><input id="regist" type="button" value="注册3" ></td>
		
             </tr>
             </center>
         </table>

</form>

</center>


</body>
</html>