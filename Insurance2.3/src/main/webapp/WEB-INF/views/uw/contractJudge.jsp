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
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script>
	function passBtn() {
		alert("해당 계약의 심사를 통과시키겠습니까?")
	}
	
	function nonPassBtn() {
		alert("해당 계약의 심사를 통과 탈락시키겠습니까?")
	}
</script>
</head>
<body>

	<div class="container w-25 mt-5">
		<p class="fs-2 text-center">계약 인수 심사</p>
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
			<div class="mb-5">
				<label for="name" class="form-label">인수 심사</label> <button type="submit" class="btn btn-warning btn-sm mb-2 mx-2" name="JudgeBtn" formaction="judgeCheck.do">인수 심사</button>
				<input type="text" class="form-control" name="JudgeCheck" value="${JudgeCheck}">
			</div>
			
			<div class="text-center">
				<button type="submit" class="btn btn-primary" name="SubmitBtn" formaction="judgePass" onClick="passBtn()">인수 심사 통과</button>
				<button type="submit" class="btn btn-danger" name="SubmitBtn" formaction="judgeNonPass" onClick="nonPassBtn()">인수 심사 통과 실패</button>
				<a href="../home"><button type="button" class="btn btn-secondary">취소</button></a>
			</div>
		</form>

	</div>
</body>
</html>