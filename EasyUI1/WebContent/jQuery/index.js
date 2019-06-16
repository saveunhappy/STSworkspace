//页面加载完毕后
$(function(){
	//1,获取id为myul的元素?
	console.log($("#myul"));
	//2,获取class为myCls的元素?
	console.log($(".myCls"));
	//3,获取所有li的元素?
	console.log($("li"));
	//4,获取id为myul下的所有li元素?祖先  后代
	console.log($("#myul li"));
	//5,获取id为myul下的所有li子元素(不包含嵌套的li元素)?父>子
	console.log($("#myul>li"));
	//6,获取标签内的属性值?
	console.log($("#myul").attr("cmd"));
	//7,如何将JSON字符串转成JSON对象
	//var data = '{"version":"1.0"}';
	var data = "{'version':'1.0'}";
	console.log(data);
	//eval("("+data+")")
	//data = eval("("+data+")");
	//console.log(data);
	//data = $.parseJSON(data);
	//console.log(data);
	//HTML5中的特性
	console.log($("#myul").data("cmd"));
});
