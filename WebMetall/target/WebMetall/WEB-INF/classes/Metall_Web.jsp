<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" 
  "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Metall_Web</title>
</head>

<body>

	<c:forEach items="${metall}" var="metall">
		<table>

			<tr>
				<td>ID</td>
				<td>Тип</td>
				<td>Наименованиe(eng)</td>
				<td>Наименование</td>
				<td>ГОСТ</td>
				<td>Размер</td>
				<td>Марка</td>
				<td>Длинна, мм</td>
				<td>Цена, бел.руб</td>
				<td>К</td>
			</tr>
			<tr>
				<td>${metall.id}</td>
				<td>${metall.type}</td>
				<td>${metall.type_eng}</td>
				<td>${metall.title}</td>
				<td>${metall.gost}</td>
				<td>${metall.size}</td>
				<td>${metall.model}</td>
				<td>${metall.length}</td>
				<td>${metall.price}</td>
				<td>${metall.k}</td>
			</tr>


		</table>
	</c:forEach>

</body>
</html>