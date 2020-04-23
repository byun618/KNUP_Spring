<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%-- <%@ page session="false" %> --%>
<!DOCTYPE html>
<html>
	<head>
	    <meta charset="utf-8"/>
	    <title>Home</title>
	</head>
	<body>
	
	<h1>Hello world!(Develop)</h1>
<% 
	request.setCharacterEncoding("euc-kr"); 
	
	String isLogin = (String) session.getAttribute("isLogin");
	
	%>
		<script>
			console.log("<%=isLogin%>");
		</script>
	<%
	
	if(isLogin == "yes"){
	%>
		
<!-- 		<form action="printForm" method="post" enctype="multipart/form-data">
			
			프린트할 파일을 선택하세용 ><
			<input type="file" name="fileName">
			<br><br>
			<input type="submit" value="print">
		
		</form> -->
		<a href = "/KNUP/printForm">Print</a>
		<a href = "/KNUP/logout">LogOut</a>
		<a href = "/KNUP/unlink">Unlink</a>
		<a href = "/KNUP/sendMsg">SendMsg</a>
	<%
	}else{
	%>	
		
		<a href="https://kauth.kakao.com/oauth/authorize?client_id=7e5d1c5a3647aead2c2abadcedbe6754&redirect_uri=http://localhost:8181/KNUP/login&response_type=code">LogIn</a>
		<br>
		<a href="https://accounts.kakao.com/login?continue=https%3A%2F%2Fkauth.kakao.com%2Foauth%2Fauthorize%3Fresponse_type%3Dcode%26client_id%3D7e5d1c5a3647aead2c2abadcedbe6754%26redirect_uri%3Dhttp%253A%252F%252Flocalhost%253A8181%252FKNUP%252Flogin">Login with another account</a>           
		<br>
		<a href = "/KNUP/logout">LogOut</a>		
		
		<!-- unlink는 user profile에서 가능하게-->
		<!-- <a href = "/KNUP/unlink">Unlink</a> -->
	<%
	}
%>
			</body>
		</html>