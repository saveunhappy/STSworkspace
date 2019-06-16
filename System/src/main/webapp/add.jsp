<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>添加页面</title>
		
	</head>
		
	<body>
				<div class="top">
					<h1>添加报名</h1>
				</div>
				<hr />
				<!--action-->
			<form action="add" method="post">
		<table>
			
			<tr>
			<td>
				姓名：<input type="text" name="name" value="" style="width: 250px"/>
			</td>	<p></p>
			</tr>
			<tr>
			<td>
				性别：<input type="text" name="sex" value="" style="width: 250px"/>
			</td>	<p></p>
			</tr>
			<tr>
			<td>
				手机号：<input type="text" name="tel" value="" style="width: 250px"/>
				</td><p></p>
			</tr>
			<tr>
			<td>
				所在公司：<input type="text" name="szgs" value="" style="width: 250px"/>
			</td>	<p></p>
			</tr>
			<tr>
			<td>
				部门：<input type="text" name="bm" value="" style="width: 250px"/>
			</td>	<p></p>
			</tr>
				<tr>
				<td>
				职务：<input type="text" name="zw" value="" style="width: 250px"/>
				</td><p></p>
			</tr>
				<tr>
    			<td colspan="2">
    				<input type="submit" value="确定"/>
    			</td>
				</table>
			</form>
	</body>
</html>
