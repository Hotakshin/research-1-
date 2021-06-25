<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>설문조사</title>
</head>
<body>
	<div align="center">
		<div><h1>시작</h1></div>
		<c:if test="${!empty email }">
		<div>
		<h1>${vo.email } ${message }</h1>
		</div>
		</c:if>
		<div>
			<h2><a href="survey">설문조사</a></h2>
		</div>
		
	</div>
</body>
</html>