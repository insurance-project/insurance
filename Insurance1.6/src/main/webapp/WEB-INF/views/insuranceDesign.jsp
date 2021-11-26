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
<title>insurance design</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

	<div class="container w-25 mt-5">
		<p class="fs-2 text-center">보험 설계</p>
		<form action="insuranceDesign.do" class="mt-5" name="InsuranceDesign" method="POST">
			<div class="mb-3">
				<label for="id" class="form-label">보험 이름</label>
				<input type="text" class="form-control" name="InsuraceName" placeholder="보험의 이름을 입력하세요.">
			</div>
			<fieldset class="row mb-3">
				<legend class="col-form-label col-sm-3 pt-0">보험 종류</legend>
				<div class="col-sm-9">
					<div class="form-check">
						<input class="form-check-input" type="radio" name="Kind" value="Car" checked> 
						<label class="form-check-label" for="car">자동차 보험</label>
					</div>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="Kind" value="Death"> 
						<label class="form-check-label" for="death">사망 보험</label>
					</div>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="Kind" value="Fire"> 
						<label class="form-check-label" for="fire">화재 보험</label>
					</div>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="Kind" value="Medical"> 
						<label class="form-check-label" for="medical">의료 보험</label>
					</div>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="Kind" value="MixedLife"> 
						<label class="form-check-label" for="mixedLife">혼합 생명 보험</label>
					</div>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="Kind"  value="Survival"> 
						<label class="form-check-label" for="survival">생존 보험</label>
					</div>
				</div>
			</fieldset>
			<div class="mb-3">
				<label for="price" class="form-label mb-2">기본 보험료</label>
				<input type="text" class="form-control" name="Premium" placeholder="숫자만 입력하세요">
			</div>
			<div class="mb-3">
				<label for="price" class="form-label mb-2">보험 요율</label>
				<input type="text" class="form-control" name="PremiumRate" placeholder="숫자만 입력하세요">
			</div>
			
			<div class="mb-3">
				<label for="price" class="form-label mb-2">보장 기간</label>
				<input type="text" class="form-control" name="Warranty" placeholder="숫자만 입력하세요">
			</div>
			<div class="mb-3">
				<label for="price" class="form-label mb-2">기본 보상금</label>
				<input type="text" class="form-control" name="Reward" placeholder="숫자만 입력하세요">
			</div>
			
			<div class="mb-3">
				<label for="price" class="form-label mb-2">보상율</label>
				<input type="text" class="form-control" name="RewardRate" placeholder="숫자만 입력하세요">
			</div>
			
			<div class="text-center">
				<button type="submit" class="btn btn-primary" name="SubmitBtn">손익 예측 확인</button>
				<a href="home"><button type="button" class="btn btn-secondary">취소</button></a>
			</div>
		</form>

	</div>
</body>
</html>