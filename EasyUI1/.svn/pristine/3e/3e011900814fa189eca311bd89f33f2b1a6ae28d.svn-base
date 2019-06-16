$(function(){
	$("#myDatagrid").datagrid({
		width:300,
		height:500,
		title:'数据表格',
		url:'data.json',
		striped:true,
		singleSelect:true,
		toolbar:'#tb',
		pagination:true,
		rownumbers:true,
		pageList:[5,10,20],
		pageSize:5,
		//fit:true,
		//fitColumns:true,
		frozenColumns:[[
		                	{field:'productid',title:'产品ID',rowspan:2}
		                ]],
		columns:[
		         [
		          	{field:'productname',title:'产品名称',width:1,rowspan:2},
		          	{title:'汇总信息',width:1,colspan:5}
		         ],
		         [
		          {field:'unitcost',title:'成本单价',width:1},
		          {field:'status',title:'状态',width:1},
		          {field:'listprice',title:'售价',width:1},
		          {field:'attr1',title:'属性',width:1},
		          {field:'itemid',title:'分类ID',width:1}
		          ]]
	});
});
function priceFormatter(value,record,index){
	if(value<30){
		return "<font color='red'>"+value+"</font>";
	}else{
		return value;
	}
}

