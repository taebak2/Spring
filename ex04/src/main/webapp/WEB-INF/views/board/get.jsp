<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@include file="../includes/header.jsp"%>

<div class="row">
	<div class="col-lg-12">
		<h1 class="page-header">게시물 세부 보기</h1>
	</div>
</div>

<div class="row">
	<div class="col-lg-12">
		<div class="panel panel-default">
			<div class="panel-heading">게시물 세부내용 출력</div>
			<div class="panel-body">
				<div class="form-group">
					<label>번호</label> <input class="form-control" name="bno"
						value="<c:out value='${board.bno}'/>" readonly>
				</div>
				<div class="form-group">
					<label>제목</label> <input class="form-control" name="bno"
						value="<c:out value='${board.title}'/>" readonly>
				</div>
				<div class="form-group">
					<label>내용</label>
					<textarea class="form-control" rows="3" name="content" readonly>
					<c:out value='${board.content}' />
					</textarea>
				</div>
				<div class="form-group">
					<label>작성자</label> <input class="form-control" name="writer"
						value="<c:out value='${board.writer}'/>">
				</div>
				<button data-oper="modify" class="btn btn-default"
					onclick="location.href='/board/modify?bno=<c:out value="${board.bno}"/>'">수정하기</button>
				<button data-oper="list" class="btn btn-info"
					onclick="location.href='/board/list'">목록가기</button>

			</div>
			<!-- pannel body E! -->
		</div>
		<!-- pannel heading E -->
	</div>
	<!-- panel default E -->
</div>
<!-- row E -->
<%@include file="../includes/footer.jsp"%>