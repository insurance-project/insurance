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
<title>contract list for accident receipt</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

	<div class="container w-50 mt-5">
		<p class="fs-2 text-center">사고 접수 - 보험 리스트</p>
		<p class="small text-center">접수 신청할 보험 선택하세요.</p>
			<table class="table table-bordered">
				<thead>
				    <tr>
				      <th scope="col">번호</th>
				      <th scope="col">보험 이름</th>
				      <th scope="col">보험 종류</th>
				      <th scope="col">기본 보험료</th>
				      <th scope="col">보장 기간</th>
				    </tr>
				  </thead>
				  
				  <tbody>
					 <c:forEach items="${contractList}" var="contractList" varStatus="status">
						<tr class="odd">
							<td><c:out value="${status.count}"/></td>
							<td><a href="accidentReceipt?no=${contractList.getInsuranceID()}">
								<c:out value="${contractList.getInsuranceName()}" /></a>
							</td>
							<c:if test="${contractList.getKind()=='Car'}">
								<td>자동차 보험</td>
							</c:if>
							<c:if test="${contractList.getKind()=='Death'}">
								<td>사망 보험</td>
							</c:if>
							<c:if test="${contractList.getKind()=='Fire'}">
								<td>화재 보험</td>
							</c:if>
							<c:if test="${contractList.getKind()=='Medical'}">
								<td>의료 보험</td>
							</c:if>
							<c:if test="${contractList.getKind()=='MixedLife'}">
								<td>혼합 생명 보험</td>
							</c:if>
							<c:if test="${contractList.getKind()=='Survival'}">
								<td>생명 보험</td>
							</c:if>
							<td><c:out value="${contractList.getPremium()}" />원</td>
							<td><c:out value="${contractList.getWarranty()}" />년</td>
						</tr>
					</c:forEach>
					<c:if test="${empty contractList}">
						<script>
							alert("신청할 보험이 존재하지 않습니다.");
							location.href='../home';
						</script>
					</c:if>
				</tbody>
			</table>
			<div class="text-center">
				<a href="../home"><button type="button" class="btn btn-secondary">목록</button></a>
			</div>
	</div>
</body>
</html>