$(function(){
	//1.先获取到需要初始化的组件
	var myBtn = $(".myButton");
	var text = myBtn.html();
	var temp = '<span class="l-btn-left"><span class="l-btn-text">'+text+'</span></span>';
	myBtn.html(temp);
	myBtn.addClass("easyui-linkbutton l-btn");
});