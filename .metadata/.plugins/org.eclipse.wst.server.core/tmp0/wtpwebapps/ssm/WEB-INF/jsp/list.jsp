<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>目录列表</title>
</head>
<body>
	<div style="width: 500px; margin: 0px auto; text-align: center">
		<c:if test="${empty cs }">
			没有目录记录
		</c:if>
		<c:if test="${not empty cs }">
			<table border="1" cellspacing="0" cellpadding="10" align='center'>
				<tr>
					<td>id</td>
					<td>name</td>
					<td>删除</td>
					<td>编辑</td>
				</tr>
				<c:forEach items="${cs }" var="c">
					<tr>
						<td>${c.id }</td>
						<td>${c.name }</td>
						<td><a href="delete?id=${c.id }">删除</a></td>
						<td><a href="edit?id=${c.id }">编辑</a></td>
					</tr>
				</c:forEach>
			</table>
		</c:if>
		<br /> <br />
		<a href="?start=0">首页</a>
		<a href="?start=${page.start - page.count }">上一页</a>
		<a href="?start=${page.start + page.count }">下一页</a>
		<a href="?start=${page.last }">尾页</a>
		<br /> <br />
		<form action="add" method="post">
			<input type="text" name="name" /> <input type="submit" value="提交" />
		</form>
	</div>
	
</body>
</html>