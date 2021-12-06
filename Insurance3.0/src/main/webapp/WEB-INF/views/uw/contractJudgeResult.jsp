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
<title>contract judge result</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

	<div class="container w-25 mt-5">
		<p class="fs-2 text-center">인수 심사 결과</p>
		<form class="mt-5" name="ContractJudgeResult" method="POST">			
			<div class="row mb-3">
				<div class="fs-5 text-center">
					<c:if test="${result eq 1 }">
						<p class="text-primary">해당 고객은 인수심사가 통과되었습니다</p>
					</c:if>
					<c:if test="${result eq 2 }">
						<p class="text-danger">해당 고객은 인수심사가 불통과되었습니다</p>
						<p class="fs-6">사유: 보험에 가입할 수 있는 나이가 아닙니다.</p>
					</c:if>
						<c:if test="${result eq 3 }">
						<p class="text-danger">해당 고객은 인수심사가 불통과되었습니다</p>
						<p class="fs-6">사유:보험에 가입할 수 있는 성별이 아닙니다.</p>
					</c:if>						
				</div>
			</div>
			
			<div class="text-center">				
				<a href="../home"><button type="button" class="btn btn-secondary">메인화면으로</button></a>				
			</div>
		</form>

	</div>
</body>
</html>