<%@page session="false"%>
<html>
<body>
	<h1>Title : ${title}</h1>
	<h1>Message : ${message}</h1>
	
	<a href="${pageContext.request.contextPath}/login">Click here to Login to the site</a>
	
</body>
</html>