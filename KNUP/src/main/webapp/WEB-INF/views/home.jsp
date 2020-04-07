<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
	<head>
	    <meta charset="utf-8"/>
	    <title>Home</title>
	    <script src="https://developers.kakao.com/sdk/js/kakao.js"></script>
	    <script>
	    	Kakao.init('531c5721635c4d44b9fbfb7fd9a9cff8');
		   
		    console.log(Kakao.Auth.getAccessToken());
	    </script>
	</head>
	<body>
		<h1>Hello world!(Develop)</h1>
		<a href="https://kauth.kakao.com/oauth/authorize?client_id=7e5d1c5a3647aead2c2abadcedbe6754&redirect_uri=http://localhost:8181/KNUP/login&response_type=code">LogIn</a>
		<br>
		<a href="https://accounts.kakao.com/login?continue=https%3A%2F%2Fkauth.kakao.com%2Foauth%2Fauthorize%3Fresponse_type%3Dcode%26client_id%3D7e5d1c5a3647aead2c2abadcedbe6754%26redirect_uri%3Dhttp%253A%252F%252Flocalhost%253A8181%252FKNUP%252Flogin">Login with another account</a>           
		
	</body>
</html>