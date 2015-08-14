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

	<div id="products">
		<br />
		<c:forEach items="${titleMetall}" var="titleMetall"></c:forEach>
		<p id="label_prod">Продукция</p>
		<a href="view_metall_armatura-riflenaya">Арматура рифленая</a><br />
		<a href="view_metall_balka">Балка</a><br /> <a
			href="view_metall_kvadrat">Квадрат</a><br /> <a
			href="view_metall_krug">Круг</a><br /> <a
			href="view_metall_list-goriachekatanniy">Лист горячекатанный</a><br />
		<a href="view_metall_list-otinkovaniy">Лист оцинкованный</a><br /> <a
			href="view_metall_list-holodnokatanniy">Лист холоднокатанный</a><br />
		<a href="view_metall_polosa">Полоса</a><br /> <a
			href="view_metall_truba-vodogazoprovodnaya-kruglaya">Трубы
			водогазопроводные круглые</a><br /> <a
			href="view_metall_truba-profilnaya">Трубы профильные</a><br /> <a
			href="view_metall_truba-electrosvarnaya-kruglaya">Трубы
			электросварные</a><br /> <a href="view_metall_ugolok">Уголок</a><br />
		<a href="view_metall_shveller">Швеллер</a><br /> <a
			href="view_metall_shestigrannik">Шестигранник</a><br /> <br /> <a
			href="add">Добавить металл</a>
	</div>

</body>
</html>