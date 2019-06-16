<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>更改页面</title>
		
	</head>
		
	<body>
				<div class="top">
					<h1>更改页面</h1>
				</div>
				<hr />
				<!--action-->
			<form action="update?id=${stu.id }" method="post">
		<table>
			<tr>
			<td>
				编号：<input type="text" name="id" value="${stu.id }" style="width: 250px" />
			</td>	<p></p>
			</tr>
			<tr>
			<td>
				姓名：<input type="text" name="name" value="${stu.name }" style="width: 250px"/>
			</td>	<p></p>
			</tr>
			<tr>
			<td>
				性别：<input type="text" name="sex" value="${stu.sex }" style="width: 250px"/>
			</td>	<p></p>
			</tr>
			<tr>
			<td>
				手机号：<input type="text" name="tel" value="${stu.tel }" style="width: 250px"/>
				</td><p></p>
			</tr>
			<tr>
			<td>
				所在公司：<input type="text" name="szgs" value="${stu.szgs }" style="width: 250px"/>
			</td>	<p></p>
			</tr>
			<tr>
			<td>
				部门：<input type="text" name="bm" value="${stu.bm }" style="width: 250px"/>
			</td>	<p></p>
			</tr>
				<tr>
				<td>
				职务：<input type="text" name="zw" value="${stu.zw }" style="width: 250px"/>
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
