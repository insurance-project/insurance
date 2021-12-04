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
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="../js/reward.js"></script>

<title>accident receipt</title>
</head>
<body>
	<div class="container w-25 mt-5">
		<p class="fs-2 text-center">사고 접수</p>

		<form action="receipt.do" class="mt-5" name="Receipt" method="POST">
			<div class="row mb-3">
				 <c:forEach items="${contractList}" var="contractList" varStatus="status">		
				<div class="col-md-6">
				    <label for="customerID" class="form-label">고객 이름</label>
					<input type="text" class="form-control" name="CustomerName" value="${contractList.getCustomerName()}" disabled>
				</div>
				<div class="col-md-6">
				  	<label for="insuranceID" class="form-label">보험 이름</label>
					<input type="text" class="form-control" name="InsuranceName" value="${contractList.getInsuranceName()}" disabled>
				</div>
				</c:forEach>
			</div>			
			<fieldset class="row mb-3">
				<legend class="col-form-label col-sm-3 pt-0">사고 종류</legend>
				<div class="col-sm-9">
					<div class="form-check">
						<input class="form-check-input" type="radio" name="AccidentKind" value="TrafficAccident" checked> 
						<label class="form-check-label" for="trafficAccident">교통사고</label>
					</div>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="AccidentKind" value="Fire"> 
						<label class="form-check-label" for="fire">화재 사고</label>
					</div>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="AccidentKind" value="Wound"> 
						<label class="form-check-label" for="wound">상해</label>
					</div>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="AccidentKind" value="Disease"> 
						<label class="form-check-label" for="disease">질병</label>
					</div>
				</div>
			</fieldset>
			<div class="mb-3">
				<label for="accidentDate" class="form-label">사고 날짜</label>
				<input type="text" class="form-control" name="AccidentDate" placeholder="ex) 2021-12-25">
			</div>
			<div class="mb-3">
				<label for="damage" class="form-label">피해 금액</label> 
				<input type="text" class="form-control" name="DamagePrice" placeholder="숫자만 입력해주세요." onKeyPress="return checkNum(event)" onkeyup="return del(event)">
			</div>
			
			<fieldset class="row mb-5">
				<legend class="col-form-label col-sm-3 pt-0">고의성</legend>
				<div class="col-sm-9">
					<div class="form-check form-check-inline">
					  	<input class="form-check-input" type="radio" name="Contingency" value="1"> 
						<label class="form-check-label" for="1">있음</label>
					</div>
					<div class="form-check form-check-inline">
					  	<input class="form-check-input" type="radio" name="Contingency" value="0" checked> 
						<label class="form-check-label" for="0">없음</label>
					</div>
				</div>
			</fieldset>
			<div class="text-center">
				<button type="submit" class="btn btn-primary" name="SubmitBtn" onClick="return receipt()">접수 완료</button>
				<a href="../home"><button type="button" class="btn btn-secondary">취소</button></a>
			</div>
		</form>

	</div>

</body>
</html>