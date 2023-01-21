<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>createLocation Page</title>
</head>
<body>
<form action="save-loc" method="post"> 
	<pre>
	Id   : <input type="text" name="id"/>
	
	Code :  <input type="text" name="code"/>
	
	Name :  <input type="text" name="name"/>
	
	Type :  urban <input type="radio" name="type" value="URBAN"/>
		    rural <input type="radio" name="type" value="RURAL"/>
	
	<input type="submit" value="save"/>
	</pre>
</form>
<pre>
${msg}
<a href="display-locations">view all</a>
</pre>
</body>
</html>