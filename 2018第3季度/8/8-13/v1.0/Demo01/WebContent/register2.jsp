<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>注册页面2</title>

 <script type="text/javascript">
     //onblur失去焦点的值
     
     //定义一个变量用于存放XMLHttpRequest对象
     var xmlHttp;
     function checkIt(){
         //获取文本框的值    
         var account=document.getElementById("account").value;
         //alert("测试获取文本框的值："+account);
         //先创建XMLHttpRequest对象
         // code for IE7+, Firefox, Chrome, Opera, Safari
         if (window.XMLHttpRequest) {
             xmlHttp = new XMLHttpRequest();
         } else {// code for IE6, IE5
             xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
         }
         //服务器地址和数据
         var url = "system/usercheck2";
         //规定请求的类型、URL 以及是否异步处理请求。
         xmlHttp.open("POST",url,true);
         //向请求添加 HTTP 头。这个必加，是提交到后台的方式
         xmlHttp.setRequestHeader("Content-type","application/x-www-form-urlencoded");
         //将请求发送到服务器
         xmlHttp.send("account="+account);
         //回调函数
         xmlHttp.onreadystatechange=function(){
             if (xmlHttp.readyState==4 && xmlHttp.status==200){
                 //给div设置内容
                document.getElementById("errorAccount").innerHTML = xmlHttp.responseText;
             }
         }
         //给div设置内容
         //document.getElementById("errorAccount").innerHTML=account;
     }
 </script>

</head>
<body>
 <center>
     <form action="" method="post">
         <table>
             <caption>注册的页面</caption>
             <tr>
                 <td>账号：</td>
                 <td>
                     <input type="text" name="account" id="account" onblur="checkIt()"/>
                     <div id="errorAccount" style="color:red;display:inline;"></div>    
                 </td>
             </tr>
             <tr>
                 <td>密码：</td>
                 <td><input type="password" name="password"/></td>
             </tr>

                <td>
                     <input type="submit" value="注册2">
                     <input type="reset" value="重置">
                </td>
             </tr>
         </table>    
     </form>
 </center>
</body>
</html>