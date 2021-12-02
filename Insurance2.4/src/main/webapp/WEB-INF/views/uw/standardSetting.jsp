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
<title>insurance standard setting</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script>
	function alertBtn() {
		alert("입력하시겠습니까?")
	}
</script>
</head>
<body>

	<div class="container w-25 mt-5">
		<p class="fs-3 text-center">보험 인수 기준 설정</p>
		<form action="standardSetting.do" class="mt-5" name="StandardSetting" method="POST">
			<div class="mb-3">
				<label for="name" class="form-label">최소 가입 가능 나이</label>
				<input type="text" class="form-control" name="CustomerMinAge" placeholder="숫자만 입력하세요">
			</div>
			<div class="mb-3">
				<label for="age" class="form-label mb-2">최대 가입 가능 나이</label>
				<input type="text" class="form-control" name="CustomerMaxAge" placeholder="숫자만 입력하세요">
			</div>
			<fieldset class="row mb-5">
				<legend class="col-form-label col-sm-4 pt-0">가입 가능 성별</legend>
				<div class="col-sm-8">
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="radio" name="CustomerGender" value="1" checked> 
						<label class="form-check-label" for="1">남성만</label>
					</div>
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="radio" name="CustomerGender" value="2"> 
						<label class="form-check-label" for="2">여성만</label>
					</div>
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="radio" name="CustomerGender" value="3"> 
						<label class="form-check-label" for="3">모두</label>
					</div>
				</div>
			</fieldset>
			
			<div class="text-center">
				<button type="submit" class="btn btn-primary" name="SubmitBtn"  onClick="alertBtn()">확인</button>
				<a href="../home"><button type="button" class="btn btn-secondary">취소</button></a>
				<input type="hidden" name="AllowStandardID" value="${AllowStandardID}">
			</div>
		</form>

	</div>
</body>
</html>