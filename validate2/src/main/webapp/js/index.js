$(function(){
	$("#myWindow").window({
		width:400,
		height:400,
		draggable:false,
		resizable:false,
		shadow:false,
		smodal:true,
		closed:true,
		modal:true
		
	});

	$("#open").click(function(){
		$('#myWindow').window('open');
	})
});


