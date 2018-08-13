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
         var url="system/usercheck?account="+account;
         //规定请求的类型、URL 以及是否异步处理请求。
         xmlHttp.open("GET",url,true);
         //将请求发送到服务器
         xmlHttp.send();
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