<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>登录</h1>
	<form action="/login" method="post">
	
		账号：<input type="text" name="username"/><br/>
		密码<input type="password" name="password"/><br/>
		<input type="submit" value="登录"/>
		
	</form>
</body>
</html>