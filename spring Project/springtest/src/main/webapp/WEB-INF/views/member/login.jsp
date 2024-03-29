<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="container">
	<h1>로그인</h1>
	<form action="<c:url value='/login'></c:url>" method="post">
		<div class="form-group">
			<label for="id">아이디:</label>
			<input type="text" class="form-control" id="id" name="me_id">
		</div>
		<div class="form-group">
			<label for="pw">비번:</label>
			<input type="password" class="form-control" id="pw" name="me_pw">
		</div>
		<label>
			<input type="checkbox" name="autoLogin" value="true"> 자동로그인
		</label>
		<button class="btn btn-outline-success col-12">로그인</button>
	</form>
</div>
<script>
$('#id').focus();
</script>