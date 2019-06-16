$(function(){
	var myTabs = $("#myTabs");
	myTabs.tabs({
		width:500,
		height:'auto',
		tabWidth:112
	});
	//思路:给每个面板的头部添加鼠标移入事件.
	//1.通过选项卡获取到所有面板
	var panelArr = myTabs.tabs("tabs");
	//2.遍历面板集合,找到头部添加鼠标移入事件
	for ( var i = 0; i < panelArr.length; i++) {
		var panelUI = panelArr[i];
		panelUI.panel("options").tab.off().on("mouseenter",{index:i},function(event){
			console.log("鼠标移入了");
			//选中面板.调用选项卡的方法来选中面板
			myTabs.tabs("select",event.data.index);
		});
	}
	//此时i已经变成3
	console.log("结束了");
});


