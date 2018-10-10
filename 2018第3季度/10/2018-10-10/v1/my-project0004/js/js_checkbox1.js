//window.onload=function(){
	function checkAll(){
		//alert("invoke!!!")
		//获取到全选的那个复选框的all
		var  all=document.getElementById("all");
		var single=document.getElementsByName("checkNames[]");
		
		if(all.checked==true){
			
			for (var i = 0; i < single.length; i++) {
				single[i].checked=true;
			}
			
		}else{
			for (var j = 0; j < single.length; j++) {
				single[j].checked=false;
			}
		}
		
	}
	
	
	
//}
