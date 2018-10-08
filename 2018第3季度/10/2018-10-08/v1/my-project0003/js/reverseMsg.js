window.onload=function(){
	
	new Vue({
		
		el:'#app-5',
		data:{
			message:'hello message 123!'
			
		},
		methods:{
			reverseMsg1:function(){
				this.message=this.message.split(' ').reverse().join(' ')
			}
		}
	})
}
