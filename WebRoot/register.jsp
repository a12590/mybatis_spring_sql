<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>员工注册</title>
  </head>
  <body>
	<form action="${pageContext.request.contextPath}/emp/register.action" method="POST">
		<table border="2" align="center">
			<tr>
				<th>编号</th>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<th>姓名</th>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<th>薪水</th>
				<td><input type="text" name="sal"></td>
			</tr>
			<tr>
				<th>性别</th>
				<td>
					<input type="radio" name="sex" value="男"/>男
					<input type="radio" name="sex" value="女" checked/>女
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="注册"/>
				</td>
			</tr>
		</table>
	</form>		
  </body>
</html>
