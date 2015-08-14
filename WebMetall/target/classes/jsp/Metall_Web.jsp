<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" 
  "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
<link rel="stylesheet" href="style/style.css">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Metall_Web</title>
</head>

<body>
	<div id="main">
		<%@ include file="serviceJSP/header.jsp"%>


		<div id="main_page">

			<%@ include file="serviceJSP/products.jsp"%>

			<div id="table">
				<br />
				<table border="1">

					<tr>
						<th>№</th>
						<th>Наименование</th>
						<th>Размер</th>
						<th>Марка</th>
						<th>Длинна, мм</th>
						<th>Цена, бел.руб</th>
					</tr>
					<c:forEach items="${metall}" var="metall">
						<tr>
							<td>${metall.id}</td>
							<td>${metall.title} - ${metall.gost}</td>
							<td>${metall.size}</td>
							<td>${metall.model}</td>
							<td>${metall.length}</td>
							<td>${metall.price}</td>
						</tr>

					</c:forEach>
				</table>
			</div>
		</div>


		<%@ include file="serviceJSP/footer.jsp"%>
	</div>

</body>
</html>