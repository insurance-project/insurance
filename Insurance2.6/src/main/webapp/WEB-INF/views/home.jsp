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
<script src="js/menubar.js"></script>

</head>
<body>
	<div id="container">
		<span id="title">Welcome to Insurance Company!</span>
		<ul id="nav">
			<li class="topMenu"><a href="#">보험 설계</a>
				<ul class="subMenu">
					<li><a href="design/insuranceDesign">보험 설계</a></li>
					<li><a href="design/insuranceList">보험 정보 수정</a></li>
					<li><a href="design/salesOpen">판매 실적 열람</a></li>
				</ul>
			</li>
			<li class="topMenu"><a href="#">U/W</a>
				<ul class="subMenu">
					<li><a href="uw/referenceList">인수 기준 설정</a></li>
					<li><a href="uw/judgeList">고객 보험 심사</a></li>
				</ul>
			</li>
			<li class="topMenu"><a href="#">영업</a>
				<ul class="subMenu">
					<li><a href="sales/customerInfo">고객 정보 입력</a></li>
					<li><a href="sales/insuranceContract">보험 계약</a></li>
					<li><a href="sales/customerInfoOpen">고객 정보 열람</a></li>
				</ul>
			</li>
			<li class="topMenu"><a href="#">사고 처리</a>
				<ul class="subMenu">
					<li><a href="accident/forReceiptList">사고 접수</a></li>
					<li><a href="accident/receiptList">보상금 지급</a></li>
				</ul></li>
		</ul>

	</div>
</body>

<script>

	$(document).ready(function() {
		let result = '<c:out value="${Checker}"/>';
		checkAlert(result);
	
		function checkAlert(result) {
			if (result === '') {
				return;
			}
			if (result === "true") {
				alert("계약 신청이 완료되었습니다.");
			} else if (result === "false") {
				alert("이미 계약된 보험입니다. 다른 보험을 선택해주세요.");
			}
		}
	});
</script>
</html>