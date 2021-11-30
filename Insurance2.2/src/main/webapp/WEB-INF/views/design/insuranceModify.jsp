<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<c:set var="path" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>insurance modify</title>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script>
	function modifyBtn() {
		alert("수정하시겠습니까?")
	}
	function deleteBtn() {
		alert("삭제하시겠습니까?")
	}
</script>
</head>
<body>

	<div class="container w-25 mt-5">
		<p class="fs-2 text-center">보험 정보 수정</p>
		<form action="insuranceModify.do" class="mt-5" name="InsuranceModify" method="POST">
			<div class="mb-3">
				<label for="id" class="form-label">보험 이름</label>
				<input type="text" class="form-control" name="InsuraceName" placeholder="보험의 이름을 입력하세요." value="${InsuranceName}">
			</div>
			<fieldset class="row mb-3">
				<legend class="col-form-label col-sm-3 pt-0">보험 종류</legend>
				<div class="col-sm-9">
					<div class="form-check">
						<input class="form-check-input" type="radio" name="Kind" value="Car" <c:if test="${Kind eq 'Car'}">checked</c:if>> 
						<label class="form-check-label" for="car">자동차 보험</label>
					</div>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="Kind" value="Death" <c:if test="${Kind eq 'Death'}">checked</c:if>> 
						<label class="form-check-label" for="death">사망 보험</label>
					</div>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="Kind" value="Fire" <c:if test="${Kind eq 'Fire'}">checked</c:if>> 
						<label class="form-check-label" for="fire">화재 보험</label>
					</div>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="Kind" value="Medical" <c:if test="${Kind eq 'Medical'}">checked</c:if>> 
						<label class="form-check-label" for="medical">의료 보험</label>
					</div>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="Kind" value="MixedLife" <c:if test="${Kind eq 'MixedLife'}">checked</c:if>> 
						<label class="form-check-label" for="mixedLife">혼합 생명 보험</label>
					</div>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="Kind"  value="Survival" <c:if test="${Kind eq 'Survival'}">checked</c:if>>  
						<label class="form-check-label" for="survival">생존 보험</label>
					</div>
				</div>
			</fieldset>
			<div class="mb-3">
				<label for="price" class="form-label mb-2">기본 보험료</label>
				<input type="text" class="form-control" name="Premium" placeholder="숫자만 입력하세요" value="${Premium}">
			</div>
			<div class="mb-3">
				<label for="price" class="form-label mb-2">보험 요율</label>
				<input type="text" class="form-control" name="PremiumRate" placeholder="숫자만 입력하세요" value="${PremiumRate}">
			</div>
			
			<div class="mb-3">
				<label for="price" class="form-label mb-2">보장 기간</label>
				<input type="text" class="form-control" name="Warranty" placeholder="숫자만 입력하세요" value="${Warranty}">
			</div>
			<div class="mb-3">
				<label for="price" class="form-label mb-2">기본 보상금</label>
				<input type="text" class="form-control" name="Reward" placeholder="숫자만 입력하세요" value="${Reward}">
			</div>
			
			<div class="mb-3">
				<label for="price" class="form-label mb-2">보상율</label>
				<input type="text" class="form-control" name="RewardRate" placeholder="숫자만 입력하세요" value="${RewardRate}">
			</div>
			
			<div class="text-center">
				<button type="submit" class="btn btn-primary" name="ModifyBtn" onclick="modifyBtn()">수정 완료</button>
				<a href="deleteInsurance?insuranceID=${InsuranceID}"><button type="button" class="btn btn-danger" name="DeleteBtn" onclick="deleteBtn()">삭제</button></a>
				<a href="insuranceList"><button type="button" class="btn btn-secondary">취소</button></a>
				<input type="hidden" name="InsuranceID" value="${InsuranceID}">
			</div>
		</form>

	</div>
</body>
</html>