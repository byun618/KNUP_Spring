<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Information</title>
</head>
<body>
	Login Information
	<br>
	${dto.userId}
	<br>
	${dto.userEmail}
	<br>
	${dto.userName}
	<br>
	<a href = "/KNUP/logout">LogOut</a>
	<a href = "/KNUP/unlink">Unlink</a>
</body>
</html>