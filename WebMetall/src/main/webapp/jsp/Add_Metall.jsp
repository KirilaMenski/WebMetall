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
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Add Metall</title>
</head>
<body>

			<form:form action="add_metall" method="POST" commandName="metall">
				Тип:<form:input type="text"	path="type" />
				<br />
				Тип_eng: <form:input type="text" path="type_eng" /><br/>
				Наименование: <form:input type="text" path="title" /><br/>
				ГОСТ: <form:input type="text" path="gost" /><br/>
				Размер: <form:input type="text"	path="size" /><br />
				Марка: <form:input type="text" path="model" /><br/>
				Длинна: <form:input type="text" path="length" /><br/>
				Ценна: <form:input type="text" path="price" /><br/>
				К: <form:input type="text" path="k" /><br/>
				<input type="submit" value="Добавить" />
			</form:form>


</body>
</html>