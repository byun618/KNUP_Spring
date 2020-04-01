<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!(Develop)
</h1>

<P>  The time on the server is ${serverTime}. </P>

<c:forEach items="${list}" var="dto">
	<p>${dto.mId}, ${dto.mWritter}</p>
</c:forEach>

<button onclick="location='login'">LOGIN</button>

</body>
</html>
