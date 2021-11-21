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
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<title>reward-receipt</title>
</head>
<body>
	<div class="container w-25 mt-5">
		<p class="fs-2 text-center">사고 접수</p>

		<form action="receipt.do" class="mt-5" name="Receipt" method="POST" id="form">
			<div class="mb-3">
				<label for="id" class="form-label">ID</label>
				<input type="text" class="form-control" id="userID" placeholder="고객 ID를 입력하세요">
			</div>
			
			<fieldset class="row mb-3">
				<legend class="col-form-label col-sm-3 pt-0">보험 종류</legend>
				<div class="col-sm-9">
					<div class="form-check">
						<input class="form-check-input" type="radio" name="gridRadios" id="car" value="Car" checked> 
						<label class="form-check-label" for="car">자동차 보험</label>
					</div>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="gridRadios" id="death" value="Death"> 
						<label class="form-check-label" for="death">사망 보험</label>
					</div>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="gridRadios" id="fire" value="Fire"> 
						<label class="form-check-label" for="fire">화재 보험</label>
					</div>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="gridRadios" id="medical" value="Medical"> 
						<label class="form-check-label" for="medical">의료 보험</label>
					</div>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="gridRadios" id="mixedLife" value="MixedLife"> 
						<label class="form-check-label" for="mixedLife">혼합 생명 보험</label>
					</div>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="gridRadios" id="survival" value="Survival"> 
						<label class="form-check-label" for="survival">생존 보험</label>
					</div>
				</div>
			</fieldset>
			<div class="mb-3">
				<label for="date" class="form-label">날짜</label>
				<input type="text" class="form-control" id="date" placeholder="ex) 2021-12-25">
			</div>
			<div class="mb-3">
				<label for="damage" class="form-label">피애 금액</label> 
				<input type="text" class="form-control"
					id="damage" placeholder="숫자만 입력해주세요.">
			</div>
			
			<fieldset class="row mb-5">
				<legend class="col-form-label col-sm-3 pt-0">우연성</legend>
				<div class="col-sm-9">
					<div class="form-check">
						<input class="form-check-input" type="radio" name="gridRadios" id="contingency" value="Contingency" checked> 
						<label class="form-check-label" for="Contingency">있음</label>
					</div>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="gridRadios" id="no" value="NoContingency"> 
						<label class="form-check-label" for="NoContingency">없음</label>
					</div>
				</div>
			</fieldset>
			<div class="text-center">
				<button type="submit" class="btn btn-primary">접수</button>
				<a href="home"><button type="button" class="btn btn-secondary">취소</button></a>
			</div>
		</form>

	</div>

</body>
</html>