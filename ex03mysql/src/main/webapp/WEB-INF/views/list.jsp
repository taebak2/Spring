<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css">
</head>
<body>
	<%@ include file="menu.jsp" %>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">게시판</h1>
		</div>
	</div>
	<div class="container">
		<table border="1" width="100%">
			<tr align="center">
				<th width="10%">번호</th>
				<th width="50%">제목</th>
				<th width="10%">내용</th>
				<th width="10%">아이디</th>
				<th width="10%">게시일자</th>
				<th width="10%">조회수</th>
			</tr>

			<c:forEach var="boardli" items="${list}">
				<tr align="center">
					<td>${boardli.num}</td>
					<td>${boardli.title}</td>
					<td>${boardli.content}</td>
					<td>${boardli.id}</td>
					<td>${boardli.postdate}</td>
					<td>${boardli.visitcount}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>









