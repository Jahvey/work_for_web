
//页面加载完毕事件
window.onload = function(){
	$.get("/CityJSONServlet?cmd=listProvince",function(jsonObject){
		//后台获取jsonstring后,需要转换为对象
		//var datas = eval("("+jsonString+")");
		
		
		for ( var i = 0; i < jsonObject.length; i++) {
			var data = jsonObject[i];
			console.debug(data.id,data.name);
		}
	});
};


function provinceSelectChange(){
	//获取当前选中的id
	var provinceId = document.getElementById("provinceSelect").value;
}