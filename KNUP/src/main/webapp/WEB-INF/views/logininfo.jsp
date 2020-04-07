<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Login Information</title>
		<!-- <script src="https://developers.kakao.com/sdk/js/kakao.js"></script>
	    <script>
		    Kakao.init('531c5721635c4d44b9fbfb7fd9a9cff8');
		   
		    Kakao.Auth.setAccessToken(${token})
		    
		    function logot(){
		    	if(!Kakao.Auth.getAccessToken()){
		    		console.log('Not Logged in');
		    		return;
		    	}
		    	Kakao.Auth.logout(function(){
		    		console.log(Kakao.Auth.getAccessToken());
		    		location.href = '/KNUP';
		    	});
		 		
		    }
	    </script> -->
	</head>
	<body>
		Login Information
		
		<br>
		<a href = "/KNUP/logout">LogOut</a>
		<a href = "/KNUP/unlink">Unlink</a>
		
		${token}
		
<!-- 		<button type="button" onclick='logot()'>asd</button> -->
	</body>
</html>