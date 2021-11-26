<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>join insurance list</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

	<div class="container w-50 mt-5">
		<p class="fs-2 text-center">보험 계약 - 보험 리스트</p>
		<p class="small text-center">계약을 원하는 보험을 선택하세요</p>
		<form action="joinInsurance.do" class="mt-5" name="JoinInsurance" method="POST">
			<table class="table table-bordered">
				<thead>
				    <tr>
				      <th scope="col">선택</th>
				      <th scope="col">번호</th>
				      <th scope="col">보험 이름</th>
				      <th scope="col">보험 종류</th>
				      <th scope="col">기본 보험료</th>
				      <th scope="col">보장 기간</th>
				    </tr>
				  </thead>
				  <tbody>
				    <c:forEach items="${insuranceList}" var="insuranceList" varStatus="status">
						<tr class="odd">
							<td><input type="radio" name="Join" value="${insuranceList.getInsuranceID}"></td>
							<td><c:out value="${status.count}"/></td>
							<td><c:out value="${insuranceList.getInsuranceName()}" /></td>
							<td><c:out value="${insuranceList.getKind()}" /></td>
							<td><c:out value="${insuranceList.getPremium()}" /></td>
							<td><c:out value="${insuranceList.getWarranty()}" /></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<div class="text-center">
				<button type="submit" class="btn btn-primary" name="SubmitBtn">보험 계약</button>
				<a href="home"><button type="button" class="btn btn-secondary">목록</button></a>
			</div>
		</form>
	</div>
</body>
</html>