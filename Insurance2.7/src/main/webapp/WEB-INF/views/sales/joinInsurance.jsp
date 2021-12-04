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
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="../js/sales.js"></script>

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
							<td><input type="radio" name="Join" value="${insuranceList.getInsuranceID()}"></td>
							<td><c:out value="${status.count}"/></td>
							<td><c:out value="${insuranceList.getInsuranceName()}" /></td>
							<c:if test="${insuranceList.getKind()=='Car'}">
								<td>자동차 보험</td>
							</c:if>
							<c:if test="${insuranceList.getKind()=='Death'}">
								<td>사망 보험</td>
							</c:if>
							<c:if test="${insuranceList.getKind()=='Fire'}">
								<td>화재 보험</td>
							</c:if>
							<c:if test="${insuranceList.getKind()=='Medical'}">
								<td>의료 보험</td>
							</c:if>
							<c:if test="${insuranceList.getKind()=='MixedLife'}">
								<td>혼합 생명 보험</td>
							</c:if>
							<c:if test="${insuranceList.getKind()=='Survival'}">
								<td>생명 보험</td>
							</c:if>
							<td><c:out value="${insuranceList.getPremium()}" />원</td>
							<td><c:out value="${insuranceList.getWarranty()}" />년</td>
						</tr>
					</c:forEach>
					<c:if test="${empty insuranceList}">
						<script>alert("가입 가능한 보험이 존재하지 않습니다.");</script>
					</c:if>
				</tbody>
			</table>
			<div class="text-center">
				<button type="submit" class="btn btn-primary" name="SubmitBtn" onClick="return join()">보험 계약</button>				
				<a href="../home"><button type="button" class="btn btn-secondary">목록</button></a>
				<input type="hidden" name="CustomerID" value="${customerID}">
				<input type="hidden" name="Result" value="${Result}">
			</div>
		</form>
	</div>
</body>
</html>