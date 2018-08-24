
//页面加载完毕事件
window.onload = function(){

	$.get("/CityXMLServlet?cmd=listProvince",function(xmlDoc){
		//responseXML
		
		var provinceSelect = document.getElementById("provinceSelect");
		
		//获取文档中所有<data>标签
		var datas = xmlDoc.getElementsByTagName("data");
		for ( var i = 0; i < datas.length; i++) {
			//获取每一个<data>标签
			var data =datas[i];
			//获取元素的id属性
			var id = data.getAttribute("id");
			
			//firstChild获取第一个子节点,nodeValue获取文本节点对象的值.
			var name = data.firstChild.nodeValue;
			
			//创建option
			var option = document.createElement("option");
			option.value = id;
			option.innerHTML = name;
			
			//添加option到select下拉框.
			provinceSelect.appendChild(option);
		}
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
	
	$.get("/CityXMLServlet?cmd=listCity","provinceId="+provinceId,function(data){
		citySelect.innerHTML += data;
	});
}