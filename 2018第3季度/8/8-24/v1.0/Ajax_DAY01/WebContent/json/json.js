//var arr = [];//[] == new Array();
//var obj = {};//{} == new Object

//这个{}就是一个对象,我一般把这种对象称为JSON对象.
var o = {
	"name" : "itcast",
	"age" : 18,
	"sex" : true,
	"hobby" : [ "玩游戏", "写代码" ],
	"dept" : {
		"id" : 1,
		"name" : "开发部"
	}
};
// console.debug(o);
console.debug(o.hobby[1]);

var users = [ {
	name : "张三"
}, {
	name : "李四"
}, {
	name : "王五"
} ];
for ( var i = 0; i < users.length; i++) {
	var u = users[i];
	console.debug(u.name);
}

// jsonstring 符合json格式的字符串.
var s = "{name:'张三',age:18}";
// var obj = eval(s);//语法错误,转换失败,因为json的原始形态,有一个(),
// alert({}.toSource());
var o = eval("(" + s + ")");
console.debug(o.name, o.age);

var sc = {
	"id" : 1,
	"name" : "四川"
}

alert(sc.name);