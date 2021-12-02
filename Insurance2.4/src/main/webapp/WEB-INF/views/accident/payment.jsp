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
<script>
	function alertBtn() {
		alert("사고 접수가 완료되었습니다.")
	}
</script>
</head>
<body>
	<div class="container w-25 mt-5">
		<p class="fs-2 text-center">보상금 지급</p>
		<form class="mt-5" name="Payment" method="POST">
			<div class="row mb-3">
				<div class="col-md-6">
				    <label for="customerID" class="form-label">고객 이름</label>
					<input type="text" class="form-control" name="CustomerName" value="${CustomerName}" disabled>
				</div>
				<div class="col-md-6">
				  	<label for="insuranceID" class="form-label">보험 이름</label>
					<input type="text" class="form-control" name="InsuranceName" value="${InsuranceName}" disabled>
				</div>
			</div>	
			<div class="mb-3">
				<label for="date" class="form-label">예상 보상 지급 날짜</label>
				<input type="text" class="form-control" name="RewardDate" placeholder="ex) 2021-12-25">
			</div>		
			<!-- 금액 확인 버튼 누르면 -> 보험 rewardCost와 예상 보상 금액 비교해서 rewardCost 보다 적으면 지급 가능 value 값 지급 가능/지급 불가능 띄우기 predict profit 참고-->
			<div class="mb-3">
				<label for="price" class="form-label mb-2">예상 보상 금액</label> <button type="submit" class="btn btn-warning btn-sm mb-2" name="PayCheck" formaction="checkPrice.do">금액 확인</button>
				<input type="text" class="form-control" placeholder="숫자만 입력하세요">
			</div>
			<div class="mb-5">
				<label for="totalPrice" class="form-label">가능 여부</label>
				<input type="text" class="form-control" name="Possibility" value="${Possibility}">
			</div>
			
			<div class="text-center">
				<button type="submit" class="btn btn-primary" name="SubmitPayment" formaction="payment.do" onClick="alertBtn()">확인</button>
				<a href="../home"><button type="button" class="btn btn-secondary">취소</button></a>
			</div>
		</form>

	</div>
</body>
</html>