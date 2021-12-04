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
<title>predict profit</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="../js/design.js"></script>
</head>
<body>

	<div class="container w-25 mt-5">
		<p class="fs-2 text-center">손익 예측 확인</p>
		<form action="form1" class="mt-5" action="setPredict.do" name="PredictProfit" method="POST">
			<div class="mb-3">
				<label for="price" class="form-label mb-2">예상 보험료</label>
				<input type="text" class="form-control" name="Profit" placeholder="숫자만 입력하세요" value="${profit}" onKeyPress="return checkNum(event)" onkeyup="return del(event)">
			</div>
			<div class="mb-3">
			<label for="price" class="form-label mb-2">예상 가입자 수</label>
			<input type="text" class="form-control" name="Subscribers" placeholder="숫자만 입력하세요" value="${subscribers}" onKeyPress="return checkNum(event)" onkeyup="return del(event)"> 
			</div>
			<div class="mb-3">
				<label for="totalPrice" class="form-label mb-2">손익 예측</label><button type="submit" class="btn btn-danger btn-sm mb-2 mx-2" name="SubmitBtn" formaction="predict.do" onclick="return totalProfit()">손익 분석</button>	
				<input type="text" class="form-control" name="TotalProfit" value="${totalProfit}" disabled>
			</div>

			<div class="text-center">				
				<button type="submit" class="btn btn-primary" name="CalculateBtn" formaction="setPredict.do" onclick="return predictProfit()">보험 설계완료</button>
				<a href="../home"><button type="button" class="btn btn-secondary">취소</button></a>
				<input type="hidden" name="InsuranceID" value="${InsuranceID}">
			</div>
		</form>

	</div>
</body>
</html>