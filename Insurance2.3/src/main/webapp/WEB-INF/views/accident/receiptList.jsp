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
<title>receipt list</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

	<div class="container w-50 mt-5">
		<p class="fs-3 text-center">사고 접수 리스트</p>
		<p class="small text-center">보상을 신청할 보험 선택하세요.</p>
			<table class="table table-bordered">
				<thead>
				    <tr>
				      <th scope="col">번호</th>
				      <th scope="col">고객 이름</th>
				      <th scope="col">보험 이름</th>
				      <th scope="col">사고 종류</th>
				      <th scope="col">사고 날짜</th>
				      <th scope="col">피해 금액</th>
				    </tr>
				  </thead>
				  <!-- receipt, contract join? -->
				  <tbody>
					 <c:forEach items="${receiptList}" var="receiptList" varStatus="status">
						<tr class="odd">
							<td><c:out value="${status.count}"/></td>
							<td><a href="payment?no=${receiptList.getAccidentID()}">
								<c:out value="${receiptList.getCustomerName()}" /></a>
							</td>
							<td><a href="payment?no=${receiptList.getAccidentID()}">
								<c:out value="${receiptList.getInsuranceName()}" /></a>
							</td>
							<c:if test="${receiptList.getAccidentKind()=='TrafficAccident'}">
								<td>교통사고</td>
							</c:if>
							<c:if test="${receiptList.getKind()=='Fire'}">
								<td>화재 사고</td>
							</c:if>
							<c:if test="${receiptList.getKind()=='Wound'}">
								<td>상해</td>
							</c:if>
							<c:if test="${receiptList.getKind()=='Disease'}">
								<td>질병</td>
							</c:if>
							<td><c:out value="${receiptList.getAccidentDate()}" /></td>
							<td><c:out value="${receiptList.getDamagePrice()}" />원</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<div class="text-center">
				<a href="../home"><button type="button" class="btn btn-secondary">목록</button></a>
			</div>
	</div>
</body>
</html>