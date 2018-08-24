
//页面加载完毕事件
window.onload = function(){
	//console.debug(document.getElementById("provinceSelect"));
	$.get("/CityHTMLServlet?cmd=listProvince",function(data){
		document.getElementById("provinceSelect").innerHTML += data;
	});
};


function provinceSelectChange(){
	//获取当前选中的id
	var provinceId = document.getElementById("provinceSelect").value;
	
	var citySelect = document.getElementById("citySelect");
	citySelect.innerHTML = "<option value='-1'>--请选择--</option>";
	
	if(provinceId==-1){
		return;
	}
	
	$.get("/CityHTMLServlet?cmd=listCity","provinceId="+provinceId,function(data){
		citySelect.innerHTML += data;
	});
}