<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" 
  "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
<link rel="stylesheet" href="style/style.css">

<script type='text/javascript'
	src='http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js'></script>
<script type="text/javascript" src="js/animate.js"></script>
<script type="text/javascript" src="js/calculate.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Metall_Web</title>
</head>

<body>
	<div id="main">
		<%@ include file="serviceJSP/header.jsp"%>

		<div id="view_metall">

			<%@ include file="serviceJSP/products.jsp"%>

			<div id="table">
				<br />
				<table border="1" id="metallByTitle">

					<tr>

						<th>Наименование</th>
						<th>Размер</th>
						<th>Марка</th>
						<th>Длинна, мм</th>
						<th>Цена, бел.руб</th>
					</tr>
					<c:forEach items="${metallByTitle}" var="metallByTitle">

						<tr onclick="showDiv(${metallByTitle.id});">


							<td>${metallByTitle.title}-${metallByTitle.gost}
								<div id="calculate${metallByTitle.id}">

									<span id="model">${metallByTitle.title}-${metallByTitle.gost},
										${metallByTitle.price} бел.руб.</span> <span id="exit"><a
										href="" onclick="hideDiv(${metallByTitle.id});"><img
											id="exit" src="style/image/exit.jpg"></a></span> <br />
									<table>
										<tr>
											<th></th>
											<th>т</th>
											<th>м</th>
											<th>Цена</th>
											<th>Сумма, бел.руб</th>
											<th></th>
										</tr>
										<tr>
											<td>Количество:</td>
											<td><input type="text" id="num_value${metallByTitle.id}"
												oninput="calculate(${metallByTitle.id});"></td>
											<td><input type="text" id="totalMass${metallByTitle.id}"></td>
											<td><input type="text" id="price${metallByTitle.id}"
												value="${metallByTitle.price}" disabled></td>
											<td><input type="text"
												id="totalPrice${metallByTitle.id}"></td>
											<td><img alt="add_basket"
												src="style/image/add_basket.png"></td>
										</tr>
									</table>
								</div>
							</td>
							<td>${metallByTitle.size}</td>
							<td>${metallByTitle.model}</td>
							<td>${metallByTitle.length}</td>
							<td>${metallByTitle.price}</td>

						</tr>



					</c:forEach>
				</table>
			</div>


		</div>
		<%@ include file="serviceJSP/footer.jsp"%>
	</div>
</body>
</html>