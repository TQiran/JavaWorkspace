<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>编辑页面</title>
</head>
<body>
	<div style="width: 500px; margin: 0px auto; text-align: center">
		<form action="update" method="post">
			<input type="hidden" name="id" value="${c.id }"/>
			<input type="text" name="name" value="${c.name }"/>
			<input type="submit" value="提交">
		</form>
	</div>
</body>
</html>