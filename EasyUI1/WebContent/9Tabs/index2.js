$(function(){
	var myTabs = $("#myTabs");
	myTabs.tabs({
		width:500,
	    height:500,
	    tools:'#t-tools'
	});
});
var index= 0;
function addPanel(){
	//去调用选显卡中的方法,往选显卡中添加新的面板
	var myTabs = $("#myTabs");
	index++;
	myTabs.tabs("add",{
		title:"title"+index,
		content:"内容"+index,
		closable:true
	});
}
function removePanel(){
	var myTabs = $("#myTabs");
	var tab = myTabs.tabs('getSelected');
	var index = myTabs.tabs('getTabIndex',tab);
	//根据索引删除面板
	myTabs.tabs("close",index);
	
}
