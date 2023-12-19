<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form method="post"
		action="${pageContext.servletContext.contextPath}/register">
		<p>
			ID:<input type="text" name="id" />
		</p>
		<p>
			PASSWORD:<input type="password" name="password" />
		</p>
		<p>
			잔액:<input type="number" name="balance" />
		</p>
		<button type="submit">등록</button>
	</form>




</body>
</html>