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
	<h2>
	보험 설계하기
	</h2>
<form action="insuranceDesign.do" name="InsuranceDesign" method="POST" id="form">
	   	보험 이름 : <input type="text" name="InsuraceName"><br/>
	   <fieldset class="row mb-3">
				<legend class="col-form-label col-sm-3 pt-0">보험 종류</legend>
				<div class="col-sm-9">
					<div class="form-check">
						<input class="form-check-input" type="radio" name="Kind" id="car" value="Car" checked> 
						<label class="form-check-label" for="car">자동차 보험</label>
					</div>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="Kind" id="death" value="Death"> 
						<label class="form-check-label" for="death">사망 보험</label>
					</div>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="Kind" id="fire" value="Fire"> 
						<label class="form-check-label" for="fire">화재 보험</label>
					</div>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="Kind" id="medical" value="Medical"> 
						<label class="form-check-label" for="medical">의료 보험</label>
					</div>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="Kind" id="mixedLife" value="MixedLife"> 
						<label class="form-check-label" for="mixedLife">혼합 생명 보험</label>
					</div>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="Kind" id="survival" value="Survival"> 
						<label class="form-check-label" for="survival">생존 보험</label>
					</div>
				</div>
			</fieldset>
	    기본 보험료 : <input type="text" name="Premium"><br/>
	    보장 기간 : <input type="text" name="Warranty"><br/>
	    기본 보상금 : <input type="text" name="Reward"><br/>
	    보험 요율 : <input type="text" name="PremiumRate"><br/>   
	    보상율 : <input type="text" name="RewardRate"><br/>
	    예상 가입자 수 : <input type="text" name="Subscribers"><br/>        
	    손익 예측 : <input type="text" name="TotalProfit" value="${TotalProfit}"><br/>  
		<input type="submit" value="설계 완료" name="SubmitBtn">
		<input type="submit" value="손익 예측" name="PredictBtn">
		<a href="home"><input type="button" value="이전"></a>
		
	</form>	
</body>
</html>