<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>insurance sales perform</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

	<div class="container w-25 mt-5">
		<p class="fs-2 text-center">판매 실적 상세 정보</p>
			<div class="mb-3">
				<label for="id" class="form-label">보험 이름</label>
				<input type="text" class="form-control" name="InsuraceName" placeholder="보험의 이름을 입력하세요." value="${InsuranceName}" disabled>
			</div>
			<fieldset class="row mb-3">
				<legend class="col-form-label col-sm-3 pt-0">보험 종류</legend>
				<div class="col-sm-9">
					<div class="form-check">
						<input class="form-check-input" type="radio" name="Kind" value="Car" <c:if test="${Kind eq 'Car'}">checked</c:if> disabled> 
						<label class="form-check-label" for="car">자동차 보험</label>
					</div>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="Kind" value="Death" <c:if test="${Kind eq 'Death'}">checked</c:if> disabled> 
						<label class="form-check-label" for="death">사망 보험</label>
					</div>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="Kind" value="Fire" <c:if test="${Kind eq 'Fire'}">checked</c:if> disabled> 
						<label class="form-check-label" for="fire">화재 보험</label>
					</div>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="Kind" value="Medical" <c:if test="${Kind eq 'Medical'}">checked</c:if> disabled> 
						<label class="form-check-label" for="medical">의료 보험</label>
					</div>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="Kind" value="MixedLife" <c:if test="${Kind eq 'MixedLife'}">checked</c:if> disabled> 
						<label class="form-check-label" for="mixedLife">혼합 생명 보험</label>
					</div>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="Kind"  value="Survival" <c:if test="${Kind eq 'Survival'}">checked</c:if> disabled>  
						<label class="form-check-label" for="survival">생존 보험</label>
					</div>
				</div>
			</fieldset>
			<div class="mb-3">
				<label for="price" class="form-label mb-2">보험료</label>
				<input type="text" class="form-control" name="Profit" placeholder="숫자만 입력하세요" value="${Profit}" disabled>
			</div>
			<div class="mb-3">
				<label for="price" class="form-label mb-2">가입자 수</label>
				<input type="text" class="form-control" name="Subscribers" placeholder="숫자만 입력하세요" value="${Subscribers}" disabled>
			</div>
			
			<div class="mb-3">
				<label for="price" class="form-label mb-2">총 수익</label>
				<input type="text" class="form-control" name="TotalProfit" placeholder="숫자만 입력하세요" value="${TotalProfit}" disabled>
			</div>
			<div class="text-center">
				<a href="../home"><button type="button" class="btn btn-secondary">목록</button></a>
				<input type="hidden" name="InsuranceID" value="${insuranceID}">
			</div>
	</div>
</body>
</html>