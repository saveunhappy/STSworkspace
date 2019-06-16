<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>图形验证码</title>
		<script src="js/gVerify.js"></script>
	</head>
	<body>
	 <form action="/find" method="post">
  <p>
   <label >用户名</label>
   <input type="text" name="name" size="25" />

  </p>
  <p>
   <label>电子邮件</label>
   <input type="text" name="email" />

  </p>
  <p>
   <label>身份证号</label>
   <input type="text" name="identfy"/>
  </p>
  <p>
   <label for="phone">电话号码</label>
   <input type="text" name="tel" />

  </p>

	
	
		<div id="v_container" style="width: 200px;height: 50px;"></div>
		<input type="text" id="code_input" value="" placeholder="请输入验证码"/>
		<button id="my_button">验证</button>
		<input type="submit" value="提交" />
		 </form>
	</body>
	
	<script>
		var verifyCode = new GVerify("v_container");

		document.getElementById("my_button").onclick = function(){
			var res = verifyCode.validate(document.getElementById("code_input").value);
			if(res){
				alert("验证正确");
			}else{
				alert("验证码错误");
				return;
			}
		}
	</script>
</html>
