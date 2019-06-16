$(function(){
	//完成功能,双击自动展开或者收缩节点
	//1,监听鼠标双击的事件.
	//2.判断节点的状态
	//	如果是展开展开,让节点收缩
	//	如果节点为收缩,让节点展开.
	$("#myTree").tree({
		url:'tree.json',
		animate:true,
		checkbox:true,
		lines:true,
		dnd:true,
		onDblClick:function(node){
			console.log(node);
			if(node.state=='open'){
				//调用tree组件的收缩方法
				$("#myTree").tree("collapse",node.target);
			}else{
				//调用tree组件的展开方法
				$("#myTree").tree("expand",node.target);
			}
		},
		formatter:function(node){
			//需要判断一下节点是否有子元素
			if(node.children){
				//如果有
				//返回的内容修改
				return node.text+"("+node.children.length+")";
			}else{
				//如果没有
				//返回原样内容
				return node.text;
				
			}
		}
	});
});


