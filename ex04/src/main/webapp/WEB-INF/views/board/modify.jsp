<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@include file="../includes/header.jsp"%>

<div class="row">
	<div class="col-lg-12">
		<h1 class="page-header">게시물 수정</h1>
	</div>
</div>

<div class="row">
	<div class="col-lg-12">
		<div class="panel panel-default">
			<div class="panel-heading">게시물 수정하기</div>
			<div class="panel-body">
				<form role="form" action="/board/modify" method="post">

					<div class="form-group">
						<label>번호</label> <input class="form-control" name="bno"
							value="<c:out value='${board.bno}'/>" readonly>
					</div>

					<div class="form-group">
						<label>제목</label> <input class="form-control" name="title"
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

					<div class="form-group">
						<label>등록일자</label> <input class="form-control" name="regdate"
							value="<fmt:formatDate pattern='yyyy/MM/dd' value='${board.regdate}'/>"
							readonly>
					</div>

					<div class="form-group">
						<label>변경일자</label> <input class="form-control" name="updateDATE"
							value="<fmt:formatDate pattern='yyyy/MM/dd' value='${board.updateDATE}'/>"
							readonly>
					</div>


					<button type="submit" data-oper="modify" class="btn btn-default">수정하기</button>
					<button type="submit" data-oper="remove" class="btn btn-danger">삭제하기</button>
					<button type="submit" data-oper="list" class="btn btn-info">목록가기</button>
				</form>
			</div>
			<!-- pannel body E! -->
		</div>
		<!-- pannel heading E -->
	</div>
	<!-- panel default E -->
</div>
<!-- row E -->

<script>
	$(function() {
		var formObj = $("form");
		$('button').on("click",function(e)){
			e.preventDefault();	// 페이지 이동은 안하고 데이터 값만 넘김 ex : 게시판 페이지 이동 쓰기에 용이
			
			var operation = $(this).data("oper");
			
			console.log(operation);
			
			if(operation === 'remove'){
				formObj.attr("action","/board/remove");
			} else if(operation ==='list'){
				self.location="/board/list";
				return;
			}
			formObj.submit();
			
		});
	});
</script>
<%@include file="../includes/footer.jsp"%>