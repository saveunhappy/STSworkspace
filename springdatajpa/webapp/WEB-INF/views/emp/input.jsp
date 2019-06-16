<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
   
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/scripts/jquery-1.9.1.min.js"></script>
<script type="text/javascript">
	 $(function(){
		
		 $("#lastName").change(function(){
				var val = $(this).val();
				val = $.trim(val);
				$(this).val(val);
				
				var _oldLastName = $("#_oldLastName").val();
				_oldLastName = $.trim(_oldLastName);
				if(_oldLastName != null && _oldLastName != "" && _oldLastName == val){
					alert("lastName 可用!");
					return;
				}
		 	var url = "${pageContext.request.contextPath}/ajaxValidateLastName";
		 	var args = {"lastName":val,"date":new Date()};
		 
			
			$.post(url,args,function(data){
				if(data=="0"){
					alert("lastName可用")
				}else if(data=="1"){
					alert("lastName不可用");
				}else{
					alert("网络或者程序出错");
				}
				
			});
			
			
		});
	}); 
</script>
</head>
<body>
	<c:set value="${pageContext.request.contextPath}/emp" var="url"></c:set>

	<c:if test="${employee.id != null}">
		<c:set value="${pageContext.request.contextPath}/emp/${employee.id}" var="url"></c:set>
	</c:if>

	
	<form:form action="${url}" method="POST" modelAttribute="employee">
			<c:if test="${employee.id != null}">
				<input type="hidden" id="_oldLastName" value="${employee.lastName}"/>
				<form:hidden path="id"/>
				<input type="hidden" name="_method" value="PUT"/>
			</c:if>
			
			
			
			
			
			LastName: <form:input path="lastName" id="lastName"/>
			<br>
			email:<form:input path="email"/>
			<br>
			Birth:<form:input path="birth"/>
			<br>
			Department:
			<form:select path="department.id" items="${departments}" 
			 itemLabel="departmentName" itemValue="id">
			
			</form:select>
			<input type="submit" value="submit" />
	</form:form>
	
</body>
</html>