function deptFormatter(value,record,index){
			if(value)
				return value.name;
			else
				return value;
		}
		$(function(){
			$("#myDatagrid").datagrid({
				url:"employee.json",
				fit:true,
				fitColumns:true,
				rownumbers:true,
				pagination:true,
				singleSelect:true,
				toolbar:'#tt',
				columns:[
				         [
							{field:"id",title:"编号",width:1,align:'center'},
				            {field:"name",title:"姓名",width:1,align:'center'},
				            {field:"age",title:"年龄",width:1,align:'center'},
				            {field:"dept",title:"部门",width:1,formatter:deptFormatter,align:'center'},
				            {field:"email",title:"邮箱",width:1,align:'center'}
				         ]
				        ]
			});
			
			$("#myDialog").dialog({
				width:300,
				height:250,
				buttons:'#bb',
				closed:true
			});
		});
		
		function add(){
			$("#myDialog").dialog("open");
			$("#myDialog").dialog("setTitle","新增");
			//清空内容
			$("#myForm").form("clear");
		}
		function edit(){
			//先判断用户是否有选中数据
			var rowData = $("#myDatagrid").datagrid("getSelected");
			if(rowData){
				$("#myDialog").dialog("open");
				$("#myDialog").dialog("setTitle","编辑");
				//清空内容
				$("#myForm").form("clear");
				if(rowData.dept){
					rowData["dept.id"]=rowData.dept.id;
				}
				else{
					rowData["dept.id"]=null;s
				}
				console.log(rowData);
				$("#myForm").form("load",rowData);//基于同名匹配的规则
				//回显内容
			}else{
				$.messager.alert("温馨提示","请选择需要编辑的数据.","warning");
			}
		}
		function del(){
			//先判断用户是否有选中数据
			var rowData = $("#myDatagrid").datagrid("getSelected");
			if(rowData){
				//删除之前,让用户确定是否需要删除数据
	            $.messager.confirm('温馨提示', "您确定需要删除数据吗?", function(r){
	                if (r){
	                	$.get("delete.json?id="+rowData.id,function(data){
	    					if(data.success){
	    						//给出对应的提示,刷新表格
	    						$.messager.alert("温馨提示",data.msg,"info",function(){
	    							//刷新表格
	    							$("#myDatagrid").datagrid("reload");
	    						});
	    					}else{
	    						$.messager.alert("温馨提示",data.msg,"error");
	    					}
	    				},"json");
	                }
	            });
			}else{
				$.messager.alert("温馨提示","请选择需要删除的数据.","warning");
			}
		}
		function refresh(){
			$("#myDatagrid").datagrid("reload");
		}
		function save(){
			//先判断到底是新增还是更新
			var url;
			var id = $("input[name='id']").val();
			if(id){
				//编辑操作
				url = "update.json";
			}else{
				//新增
				url = "save.json";
			}
			$("#myForm").form("submit",{
				url:url,
				onSubmit:function(){
					return true;
				},
				success:function(data){
					//需要判断是否有保存成功
					data = $.parseJSON(data);
					if(data.success){
						$.messager.alert("温馨提示",data.msg,"info",function(){
							//确定之后关闭对话框,属性数据表格
							$("#myDialog").dialog("close");
							$("#myDatagrid").datagrid("load");
						});
						
					}else{
						$.messager.alert("温馨提示",data.msg,"error");
					}
				}
			});
		}
		function cancel(){
			$("#myDialog").dialog("close");
		}