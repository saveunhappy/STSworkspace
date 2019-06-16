<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>图形验证码</title>
		
	</head>
	
	
	<body>
<form action="" method="post" id="_form">
		<input type="hidden" name="id" value="${user.id}"> 
		用户名: <input type="text" name="name" value="${user.name}"><br/>
		电话: <input type="text" name="tel" value="${user.tel}"><br/>
		email: <input type="text" name="email" value="${user.email}"><br/>
		身份证: <input type="text" name="identify" value="${user.identify}"><br/>
		日期: <input type="date" name="birth" value='<fmt:formatDate value="${user.birth}" pattern="yyyy-MM-dd"/>'><br/>
		密码: <input type="text" name="password" value="${user.password}" id="psd"><br/>
		请再次输入密码: <input type="text" name="repassword" value="${user.password}"><br/>
		 <input type="submit" value="保存">
	</form>
			<div id="v_container" style="width: 200px;height: 50px;"></div>
		<input type="text" id="code_input" value="" placeholder="请输入验证码"/>
		<button id="my_button">验证</button>
	</body>
	<script src="js/gVerify.js"></script>
	<script type="text/javascript">
		
			
				var verifyCode = new GVerify("v_container");

				document.getElementById("my_button").onclick = function(){
					var res = verifyCode.validate(document.getElementById("code_input").value);
					if(res==true){
						//$("#_form").prop("action","/find");
						var a = $("#_form").attr("action");
						alert(a);
						$("#_form").submit();
					} else {
						alert("验证码错误");

					}
				}
			
		
		
	</script>
</html>
