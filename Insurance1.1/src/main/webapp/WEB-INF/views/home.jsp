<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Home</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="css/menubar.css" type="text/css" />
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="js/menubar.js" type="text/javascript"></script>

</head>
<body>
	<div id="container">
		<span id="title">Welcome to Insurance Company!</span>
		<ul id="nav">
			<li class="topMenu"><a href="#">보험 설계</a>
				<ul class="subMenu">
					<li><a href="#">보험 설계</a></li>
					<li><a href="#">예상 손익 분석</a></li>
					<li><a href="#">판매 실적 열람</a></li>
					<li><a href="#">보험 정보 수정</a></li>
				</ul>
			</li>
			<li class="topMenu"><a href="#">U/W</a>
				<ul class="subMenu">
					<li><a href="#">인수 기준 설정</a></li>
					<li><a href="#">고객 보험 심사</a></li>
				</ul>
			</li>
			<li class="topMenu"><a href="#">영업</a>
				<ul class="subMenu">
					<li><a href="#">고객 정보 열람</a></li>
					<li><a href="#">고객 정보 입력</a></li>
					<li><a href="#">보험 계약</a></li>
				</ul>
			</li>
			<li class="topMenu"><a href="#">사고 처리</a>
				<ul class="subMenu">
					<li><a href="receipt">사고 접수</a></li>
					<li><a href="payment">보상금 지급</a></li>
				</ul></li>
		</ul>

	</div>
</body>
</html>