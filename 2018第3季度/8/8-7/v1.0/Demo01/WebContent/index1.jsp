<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>


 <script type="text/javascript" src="js/jquery.min.js"></script>
 <script type="text/javascript" src="js/ajax.js"></script>
 <script type="text/javascript">
     $(document).ready(function(){
         //异步验证
         $("#account").blur(function(){
             $.post("system/usercheck",{account:$(this).val()},
            		 
                 function(data){
                     if(data=="true"){
                         //如果已经存在，提示账号已经被注册
                         $("#errorAccount").html("账号已被注册，请重新输入!");
                     }else{
                         //这里可以注册的可以不进行提示,清空即可
                         $("#errorAccount").html("<font color='green'>账号可以注册哟!</font>");
                     }
             },"text");
         });
     });
    
 </script>
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

             <tr>
                 <td></td>
                 <td>
                     <input type="submit" value="注册">
                     <input type="reset" value="重置">
                 </td>
             </tr>
        </table>    
     </form>
 </center>
</body>
</html>