<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title>报名信息</title>
		<style type="text/css">
		#all{
	float: left;
	border: 1px black solid;
	margin-left:15%;
	margin-top: 100px;
}
.top{
	margin-top:20px ;
	background-color: skyblue;
	height: 50px;
	width:60%;
	margin-left: 180px;
}
.top h1{
	padding-top:3px;
}
#top_tr{
	margin-bottom: 50px;
	padding-right:480px;
	width:30%;
}
#u1380 {
    border-width: 0px;
    position: absolute;
    left: 750px;
    top: 193px;
    width: 290px;
    height: 25px;
  	margin-top: 30px;
  	margin-left: 350px;
}

.table_biao{
	margin-top: 100px;
	width:1100px ;
	text-align: center;
	margin-right: 20px;
	margin-left: 20px;
}
.chaolianjie{
	text-align: right;
	margin-top: 80px;
}
.inputo{
	border: none;
}
.input1{
	border: none;
	color: red;
}
		</style>
	</head>

	<body>
		<div id="all">

				<div class="top">
					<h1  style="text-align:center">报名信息</h1>
				</div>
				<hr />
				<h2 style="text-align:left">规则长方体固体物质空间转移技术交流会</h2>
				
				<!--模糊查询单个-->
				<form action="listOne1" method="post">
				<table>
				<tr id="u1380">
				<td>
					<input type="text"  placeholder="请输入查询的ID" name="id" style="color: rgb(153, 153, 153);font-size: 15px;" >
					<input type="submit" value="搜索" />
					<td>
				</tr>
				</table>
				</form>
				
				<table	class="table_biao"border="1px" cellspacing="1"  >
			<tr  style="background-color: #99CCFF;" >
				<td>编号</td>
				<td>姓名</td>
				<td>性别</td>
				<td>手机</td>
				<td>所在公司</td>
				<td>部门</td>
				<td>职务</td>
				<td>操作</td>
			</tr>
			<c:forEach var="stu" items="${pageInfo.list }">
				<tr>
					<td>${stu.id}</td>
					<td>${stu.name}</td>
					<td>${stu.sex}</td>
					<td>${stu.tel}</td>
					<td>${stu.szgs}</td>
					<td>${stu.bm}</td>
					<td>${stu.zw}</td>
					<!--修改单个-->
					<td style="width: 100px;"><a href="load1?id=${stu.id }" style="text-decoration: none; color:brown">编辑</a>&nbsp;&nbsp;&nbsp;
					<!--删除单个-->
					<a href="del?id=${stu.id }" style="text-decoration: none;color: skyblue;">删除</a>
					<!--查看单个详情-->
					<a href="load?id=${stu.id }" style="text-decoration: none; color:deeppink">查看详情</a>
					
					</td>
				</tr>
			</c:forEach>
				
				</table>
		
			<div class="chaolianjie">
			<a href="#" style="text-decoration: none; color: orangered;" >通知</a>
			&nbsp;
			<a href="add.jsp" style="text-decoration: none; color: green;">添加</a>		
			&nbsp;
			<a href="#" style="text-decoration: none; color: darkgoldenrod;">导出</a>
			&nbsp;
			</div>
		
		
	
		
		<a href="listall?currentPage=${pageInfo.firstPage }">首页</a> 
		<a href="listall?currentPage=${pageInfo.prePage }">上一页</a>
		${pageInfo.pageNum }|${pageInfo.pages } 
		<a href="listall?currentPage=${pageInfo.nextPage }">下一页</a> 
		<a href="listall?currentPage=${pageInfo.lastPage }">尾页</a>
		</div>
	
		
	</body>
</html>

