//func
console.log($.fn.dialog.defaults);

$(function(){
	
	$("#mydiv1").dialog({
		title:"我的第3个对话框",
		width:300,
		height:350,
		maximizable:true,
		resizable:true,
		collapsible:true,
		
		//添加事件
		onResize:function(){
			
			console.log(this,arguments);
		}
		
			
	});
	
	
});
