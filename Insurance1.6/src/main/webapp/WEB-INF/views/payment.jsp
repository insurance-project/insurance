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
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container w-25 mt-5">
		<p class="fs-2 text-center">보상금 지급</p>
		<form action="payment.do" class="mt-5" name="Payment" method="POST">
			<div class="mb-3">
				<label for="id" class="form-label">ID</label>
				<input type="text" class="form-control" name="UserID" placeholder="고객 ID를 입력하세요">
			</div>
			<div class="mb-3">
				<label for="price" class="form-label mb-2">예상 보상 금액</label> <button type="submit" class="btn btn-danger btn-sm mb-2" name="PayCheck">금액 확인</button>
				<input type="text" class="form-control" placeholder="숫자만 입력하세요">
			</div>
			<div class="mb-3">
				<label for="totalPrice" class="form-label">보상 금액</label>
				<input type="text" class="form-control" value="${totalPrice}">
			</div>
			<div class="mb-3">
				<label for="date" class="form-label">예상 보상 지급 날짜</label>
				<input type="text" class="form-control" placeholder="ex) 2021-12-25">
			</div>
			
			<div class="text-center">
				<button type="submit" class="btn btn-primary" name="SubmitPayment">확인</button>
				<a href="home"><button type="button" class="btn btn-secondary">취소</button></a>
			</div>
		</form>

	</div>
</body>
</html>