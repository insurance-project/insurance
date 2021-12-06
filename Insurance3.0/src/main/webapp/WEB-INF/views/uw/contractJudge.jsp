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
<title>contract judge</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

   <div class="container w-25 mt-5">
      <p class="fs-2 text-center">인수 심사</p>
      <form class="mt-5" name="ContractJudge" method="POST">
         <div class="row mb-3">
            <div class="col-md-6">
               <label for="name" class="form-label">고객 이름</label>
               <input type="text" class="form-control" name="CustomerName" value="${CustomerName}" disabled>
            </div>
            <div class="col-md-6">
                 <label for="name" class="form-label">고객 나이</label>
               <input type="text" class="form-control" name="CustomerAge" value="${CustomerAge}세" disabled>
            </div>
         </div>         
         
         <fieldset class="row mb-3">
            <legend class="col-form-label col-sm-3 pt-0">고객 성별</legend>
            <div class="col-sm-9">
               <div class="form-check form-check-inline">
                  <input class="form-check-input" type="radio" name="CustomerGender" value="1" <c:if test="${CustomerGender eq 'Men'}">checked</c:if> disabled> 
                  <label class="form-check-label" for="1">남성</label>
               </div>
               <div class="form-check form-check-inline">
                  <input class="form-check-input" type="radio" name="CustomerGender" value="1" <c:if test="${CustomerGender eq 'Women'}">checked</c:if> disabled> 
                  <label class="form-check-label" for="2">여성</label>
               </div>
            </div>
         </fieldset>
         <p class="fs-4 text-center">해당 보험 인수 기준</p>
         <div class="row mb-3">
            <div class="col-md-6">
               <label for="name" class="form-label">최소 가입 나이</label>
               <input type="text" class="form-control" name="CustomerMinAge" value="${CustomerMinAge}세" disabled>
            </div>
            <div class="col-md-6">
                 <label for="name" class="form-label">최대 가입 나이</label>
               <input type="text" class="form-control" name="CustomerMaxAge" value="${CustomerMaxAge}세" disabled>
            </div>
         </div>
         
         <fieldset class="row mb-5">
				<legend class="col-form-label col-sm-4 pt-0">가입 가능 성별</legend>
				<div class="col-sm-8">
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="radio" name="JoinGender" value="1" <c:if test="${JoinGender eq '1'}">checked</c:if> disabled> 
						<label class="form-check-label" for="1">남성만</label>
					</div>
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="radio" name="JoinGender" value="2" <c:if test="${JoinGender eq '2'}">checked</c:if> disabled> 
						<label class="form-check-label" for="2">여성만</label>
					</div>
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="radio" name="JoinGender" value="3" <c:if test="${JoinGender eq '3'}">checked</c:if> disabled> 
						<label class="form-check-label" for="3">모두</label>
					</div>
				</div>
			</fieldset>
         
         <div class="text-center">            
        	 <button type="submit" class="btn btn-primary" name="JudgeBtn" formaction="judgeCheck.do">인수 심사하기</button>
            <a href="../home"><button type="button" class="btn btn-secondary">목록</button></a>
            <input type="hidden" name="insuranceID2" value="${insuranceID2}">
            <input type="hidden" name="customerID2" value="${customerID2}">
            <input type="hidden" name="contractID2" value="${contractID2}">
         </div>
      </form>

   </div>
</body>
</html>