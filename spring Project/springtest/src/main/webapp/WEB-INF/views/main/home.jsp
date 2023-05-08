<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<div class="container-fluid">
	<h1>스프링</h1>
	<a href="/spring/ex1">데이터 전송 예제1</a> <br>
	<a href="/spring/ex2">데이터 전송 예제2</a> <br>
	<a href="/spring/ex3">데이터 전송 예제3</a> <br>
	<a href="/spring/ex4">데이터 전송 예제4</a> <br>
	<a href="/spring/ex5?num=2022123001">DB 연결 해제5</a> <br>
	<button id="api-btn">조회</button>
	<div id="result"></div>
	<script type="text/javascript">
		${'api-btn'}.click(function(){
			$.ajax({
				url : "https://apis.data.go.kr/1741000/TsunamiShelter3/getTsunamiShelter1List?serviceKey=WD2vUw0n%2BOo2gRYBWfPja6kbXBNsRSjfjwEFvWp3cLD2i304vJVl0dfw5%2BizAV6n55dcWeEJfZFfaQgC5oeNXw%3D%3D&pageNo=1&numOfRows=10&type=json",
				dataType : 'json',
				success : function(data){
					var raws = data.TsunamiShelter[1].raw;
					console.log(raws);
					var body = '';
					for(item of raws){
						body += '<tr>'
						+ '<td>' + item.id + '</td>'
						+ '<td>' + item.sido_name + '</td>'
						+ '</tr>'
					}
					$('<table border="i"></table>').html(body).appendTo('#result');
					
					data = "아이디,시도명\n251,강원도\n250,강원도";
					var raws = data.split("\n");
					body = '';
					for(row of raws){
						var cols = row.split(',');
						body += '<tr>'
							+ '<td>' + cols[0] + '</td>'
							+ '<td>' + cols[1] + '</td>'
							+ '</tr>'
					}
					$('<table border="i"></table>').html(body).appendTo('#result');
				}
			})
		});
	</script>
	
</div>
