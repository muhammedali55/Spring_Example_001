<?xml version="1.0" encoding="ISO-8859-1" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html 
	xmlns="http://www.w3.org/1999/xhtml"
	
	>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${ornek}</h1>
<table>
	<thead>
		<tr>
			<td>ID</td>
			<td>AD</td>
			<td>SOYAD</td>
		</tr>
	</thead>	
	
	<c:forEach items="${owners}" var="ls">
		<tr>
			<td>${ls.id}</td>
			<td>${ls.ad}</td>
			<td>${ls.soyad}</td>
			
		</tr>
	</c:forEach>
</table>


</body>
</html>