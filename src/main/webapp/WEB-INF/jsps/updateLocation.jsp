<%@ include file="common/headers.jspf"%>
<html>
<head>
<meta charset="UTF-8">
<title>Update Location</title>
</head>
<body>
	<form action="update-loc" method="post"> 
	<pre>
	Id   : <input type="text" name="id" value="${location.id}" readonly/>
	
	Code :  <input type="text" name="code" value="${location.code}"/>
	
	Name :  <input type="text" name="name" value="${location.name}"/>
	
	Type :  urban <input type="radio" name="type" value="URBAN" ${location.type=='URBAN'?'checked':''}/>
		    rural <input type="radio" name="type" value="RURAL" ${location.type=='RURAL'?'checked':''}/>
	
	<input type="submit" value="update"/>
	</pre>
	</form>
	<pre>
	${msg}
	<a href="display-locations">view all</a>
	</pre>
</body>
</html>