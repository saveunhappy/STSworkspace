<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<head>
<title>用户列表</title>
</head>
<body>
	
	<a href="input">添加</a>
	<table border="1" width="400">
		<thead>
			<tr>
				<th>ID</th>
				<th>NAME</th>
				<th>TEL</th>
				<th>EAMIL</th>
				<th>IDENTIFY</th>
				<th>BIRTH</th>
				<th>PASSWORD</th>
				<th>DO SOME THING</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${users}" var="u">
				<tr align="center">
					<td>${u.id}</td>
					<td>${u.name}</td>
					<td>${u.tel}</td>
					<td>${u.email}</td>
					<td>${u.identify}</td>
					<td><fmt:formatDate value="${u.birth}" pattern="yyyy-MM-dd"/></td>
					
					<td>${u.password}</td>
					<td>
						<a href="/delete?id=${u.id}">删除</a> 
						<a href="/input?id=${u.id}">编辑</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>

<%-- <fmt:formatDate value="${u.birth}" pattern="yyyy-MM-dd"/> --%>
</html>
