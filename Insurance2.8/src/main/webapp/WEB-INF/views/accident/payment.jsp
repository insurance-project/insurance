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
<title>reward-payment</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="../js/reward.js"></script>
</head>
<body>
	<div class="container w-25 mt-5">
		<p class="fs-2 text-center">보상금 지급</p>
		<form class="mt-5" name="Payment" method="POST" action="payment.do">
			<div class="row mb-3">
				<c:forEach items="${accidentList}" var="accidentList" varStatus="status">
			<div class="row mb-3">
				<div class="col-md-6">
				    <label for="customerID" class="form-label">고객 이름</label>
					<input type="text" class="form-control" name="CustomerName" value="${accidentList.getCustomerName()}" disabled>
				</div>
				<div class="col-md-6">
				  	<label for="insuranceID" class="form-label">보험 이름</label>
					<input type="text" class="form-control" name="InsuranceName" value="${accidentList.getInsuranceName()}" disabled>
					<input type = "hidden" name="AccidentID" value="${accidentID}">
				</div>
			</div>
			</c:forEach>	
			</div>
			<div class="mb-3">
				<label for="date" class="form-label">보상 지급 날짜</label>
				<input type="text" class="form-control" name="RewardDate" placeholder="ex) 2021-12-25" value="${RewardDate}">
			</div>		
			<div class="mb-5">
				<label for="check" class="form-label mb-2">보상 금액</label>
				<input type="text" class="form-control" name="RewardPrice" placeholder="숫자만 입력하세요" value="${RewardPrice}" onKeyPress="return checkNum(event)" onkeyup="return del(event)">
			</div>
			<div class="text-center">
				<button type="submit" class="btn btn-primary" name="SubmitPayment" onClick="return payment()">보상하기</button>
				<a href="../home"><button type="button" class="btn btn-secondary">취소</button></a>
			</div>
		</form>

	</div>
</body>
</html>