<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>报名详情</title>
	</head>
	
	<body>
		
		
			<h2 class="top" style="margin-left:300px">个人信息详情</h2>
				<table style="margin-left: 300px" >	
				<tr>
				<td>姓名:</td>
				<td>${stu.name}</td>
				</tr>
				<tr>
				<td>性别:</td>
				<td>${stu.sex}</td>
				</tr>
				<tr>
				<td>手机号:</td>
				<td>${stu.tel}</td>
				</tr>
				<tr>
				<td>所在公司:</td>
				<td>${stu.szgs}</td>
				</tr>
				<tr>
				<td>所在部门:</td>
				<td>${stu.bm}</td>
				</tr>
				<tr>
				<td>职务:</td>
				<td>${stu.zw}</td>
				</tr>
				<tr>
				<td>报名时间:</td>
				<td>${stu.bmsj}</td>
				</tr>
				<tr>
				<td>生日:</td>
				<td>${stu.sr}</td>
				</tr>
				<tr>
				<td>QQ:</td>
				<td>${stu.qq}</td>
				</tr>
				<tr>
				<td>微信:</td>
				<td>${stu.vx}</td>
				</tr>
				<tr>
				<td>邮箱:</td>
				<td>${stu.email}</td>
				</tr>
				<tr>
				<td>微博:未填写</td>
				</tr>
			
				</table>
	</body>
</html>