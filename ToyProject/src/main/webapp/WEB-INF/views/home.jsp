<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<c:if test="${logId==null}">
		<a href="loginForm">로그인</a>
	</c:if>
	<c:if test="${logId!=null}">
		${logId}님
		<a href="logoutOk">로그아웃</a>
	</c:if>
	게시판

</body>
</html>
