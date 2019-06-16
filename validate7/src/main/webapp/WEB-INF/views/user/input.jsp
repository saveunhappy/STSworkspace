<%@ page contentType="text/html;charset=UTF-8" language="java"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
<title>编辑界面</title>
</head>
<body>
	<form action="/saveOrUpdate" method="post">
		<input type="hidden" name="id" value="${user.id}"> 
		用户名: <input type="text" name="name" value="${user.name}"><br/>
		电话: <input type="text" name="tel" value="${user.tel}"><br/>
		email: <input type="text" name="email" value="${user.email}"><br/>
		身份证: <input type="text" name="identify" value="${user.identify}"><br/>
		日期: <input type="date" name="birth" value='<fmt:formatDate value="${user.birth}" pattern="yyyy-MM-dd"/>'><br/>
		密码: <input type="text" name="password" value="${user.password}"><br/>
		 <input type="submit" value="保存">
	</form>
</body>
</html>
