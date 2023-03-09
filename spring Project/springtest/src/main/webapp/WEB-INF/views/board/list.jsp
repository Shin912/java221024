<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<table class="table table-hover">
	<thead>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>추천/비추천</th>
			<th>조회수</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${list }" var="board">
			<tr>
				<td>${board.bo_num }</td>
				<td>
					<a href="<c:url value='/board/detail/${board.bo_num}'></c:url>">
					${board.bo_title }
					</a>
				</td>
				<td>${board.bo_me_id }</td>
				<td>${board.bo_register_date_str }</td>
				<td>${board.bo_up}/${board.bo_down}</td>
				<td>${board.bo_views }</td>
			</tr>
		</c:forEach>
	</tbody>
</table>

<ul class="pagination justify-content-center">
	<li class="page-item <c:if test="${!pm.prev}"> disabled</c:if>" >
		<a href="<c:url value='/board/list/?page=${pm.startPage-1 }'></c:url>" class="page-link">이전</a>
	</li>
	<c:forEach begin="${pm.startPage }" end="${pm.endPage }" var="i">
		<li class="page-item <c:if test="${i == pm.cri.page }"> active</c:if>">
			<a href="<c:url value='/board/list/?page=${i}'></c:url>" class="page-link">${i}</a>
		</li>
	</c:forEach>
	<li class="page-item <c:if test="${!pm.next}"> disabled</c:if>" >
		<a href="<c:url value='/board/list/?page=${pm.endPage+1 }'></c:url>" class="page-link">다음</a>
	</li>
</ul>

<form class="input-group mb-3" action="<c:url value='/board/list'></c:url>">
  	<select class="input-group-prepend" name="type">
  		<option value="0">전체</option>
  		<c:forEach items="${typeList}" var="type">
  			<option value="${type.bt_num}" <c:if test="${pm.cri.type == type.bt_num }"> selected</c:if>>${type.bt_name}</option>
  		</c:forEach>
  	</select>
  	<input type="text" class="form-control" placeholder="Search" name="search" value="${pm.cri.search}">
  	<div class="input-group-append">
   		<button class="btn btn-success" type="submit">검색</button>
  	</div>
</form>