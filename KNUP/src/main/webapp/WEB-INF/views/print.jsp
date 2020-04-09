<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
	<body>
		<form action="print" enctype="multipart/form-data">
		
		프린트할 파일을 선택하세용 ><
		<input type="file" name="profile">
		<br/><br/>
		<input type="submit" value="print">
		
		</form>
	</body>
</html>