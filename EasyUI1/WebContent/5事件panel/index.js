console.log(jQuery.fn.panel.defaults);
jQuery.fn.panel.defaults.title="默认标题头";
$(function(){
	$("#myPanel").panel({
		title:'js中的标题',
		iconCls:'icon-add',
		width:200,
		height:200,
		//headerCls:"border_top_none",
		//bodyCls:"border_right_none",
		//fit:true
		//border:false
		content:'js中的内容',
		collapsible:true,
		minimizable:true,
		maximizable:true,
		closable:true,
		//collapsed:true,
		//maximized:true,
		//closed:true
		href:'content.html',
		cache:false,
		loadingMessage:"我在拼命的加载",
		onCollapse:function(){
			console.log("面板折叠了");
		},
		onExpand:function(){
			console.log("面板展开了");
		}
	});
});


function openPanel(){
	//调用组件的打开面板方法
	$("#myPanel").panel("open");
	//$("#myPanel").open();
}

function closePanel(){
	//调用组件的关闭面板方法
	$("#myPanel").panel("close");
}