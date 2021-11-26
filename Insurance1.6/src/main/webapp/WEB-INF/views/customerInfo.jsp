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
<title>customer info</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

	<div class="container w-25 mt-5">
		<p class="fs-2 text-center">고객 정보 입력</p>
		<form action="customerInfo.do" class="mt-5" name="InsuranceDesign" method="POST">
			<div class="mb-3">
				<label for="name" class="form-label">고객 이름</label>
				<input type="text" class="form-control" name="CustomerName" placeholder="고객의 이름을 입력하세요.">
			</div>
			<div class="mb-3">
				<label for="age" class="form-label mb-2">나이</label>
				<input type="text" class="form-control" name="Age" placeholder="숫자만 입력하세요">
			</div>
			<fieldset class="row mb-3">
				<legend class="col-form-label col-sm-3 pt-0">성별</legend>
				<div class="col-sm-9">
					<div class="form-check">
						<input class="form-check-input" type="radio" name="Gender" value="Men" checked> 
						<label class="form-check-label" for="men">남성</label>
					</div>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="Gender" value="Women"> 
						<label class="form-check-label" for="women">여성</label>
					</div>
				</div>
			</fieldset>
			<div class="mb-3">
				<label for="job" class="form-label mb-2">직업</label>
				<input type="text" class="form-control" name="Job" placeholder="직업을 입력하세요">
			</div>
			
			<div class="mb-3">
				<label for="phoneNum" class="form-label mb-2">휴대폰 번호</label>
				<input type="text" class="form-control" name="PhoneNum" placeholder="ex) 010-1234-5678">
			</div>
			<div class="mb-3">
				<label for="residentNum" class="form-label mb-2">주민등록번호</label>
				<input type="text" class="form-control" name="ResidentNum" placeholder="ex) 123456-7890123">
			</div>
			
			<div class="text-center">
				<button type="submit" class="btn btn-primary" name="SubmitBtn">확인</button>
				<a href="home"><button type="button" class="btn btn-secondary">취소</button></a>
			</div>
		</form>

	</div>
</body>
</html>