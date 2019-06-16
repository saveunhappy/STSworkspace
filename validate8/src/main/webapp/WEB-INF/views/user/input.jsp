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
		电话: <input type="text" name="className" value="${user.className}"><br/>
		email: <input type="text" name="profession" value="${user.profession}"><br/>
		身份证: <input type="text" name="department" value="${user.department}"><br/>
		日期: <input type="date" name="rudang" value='<fmt:formatDate value="${user.rudang}" pattern="yyyy-MM-dd"/>'><br/>
		密码: <input type="text" name="fujian" value="${user.fujian}"><br/>
		 <input type="submit" value="保存">
	</form>
</body>
</html>
