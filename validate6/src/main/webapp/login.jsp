<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="jquery-easyui/themes/default/easyui.css"><!-- 样式文件 -->   
	<link rel="stylesheet" type="text/css" href="jquery-easyui/themes/icon.css"> <!--图标样式  -->  
	<script type="text/javascript" src="jquery-easyui/jquery.min.js"></script> <!-- jQuery核心库 -->
	<script type="text/javascript" src="jquery-easyui/jquery.easyui.min.js"></script>  <!-- EasyUI核心库 --> 
	<script type="text/javascript" src="js/index.js"></script>
	<script type="text/javascript" src="js/jquery.validate.min.js"></script>
	<script type="text/javascript" src="js/card.js"></script>
	<script type="text/javascript" src="js/validate.js"></script>
	
	
</head>
<body>
	<a class="easyui-linkbutton" id="open">打开</a>
	<div id="myWindow">
	
	<form action="/login" method="post" id="myform">
		&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
		账号:<input type="text" name="name"/><br>
		&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
		密码:<input type="password" name="password"/><br>
		<br>
		&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
		
		<a class="easyui-linkbutton" onclick="document.getElementById('myform').submit();return false;">登录</a>
		&emsp;&emsp;&emsp;&emsp;
		<a class="easyui-linkbutton" href="register.jsp">注册</a><br>
		
		&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
		<a class="easyui-linkbutton" href="register.jsp">忘记密码</a>
	</form>
	</div>
</body>
</html>