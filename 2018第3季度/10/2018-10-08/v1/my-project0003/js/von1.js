window.onload=function(){
	new Vue({
	el:'#app',
	data:{
		name:'vue js.testing'
	},
	methods:{
		greet:function(event){
			//this 代表的是方法里面指代的是当前Vue实例
			
			alert('Hello '+this.name+' !');
			
			//event 是指原生的DOM事件
			if(event){
				alert(event.target.tagName)
			}
		}
	}
	
})
}
