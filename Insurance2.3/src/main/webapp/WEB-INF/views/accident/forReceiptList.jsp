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
<title>customer list for accident receipt</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

	<div class="container w-50 mt-5">
		<p class="fs-2 text-center">사고 접수 - 고객 리스트</p>
		<p class="small text-center">접수 신청할 고객을 선택하세요.</p>
			<table class="table table-bordered">
				<thead>
				    <tr>
				      <th scope="col">번호</th>
				      <th scope="col">고객 이름</th>
				      <th scope="col">나이</th>
				      <th scope="col">성별</th>
				      <th scope="col">직업</th>
				      <th scope="col">휴대폰 번호</th>
				    </tr>
				  </thead>
				  <tbody>
				    <c:forEach items="${forReceiptList}" var="forReceiptList" varStatus="status">
						<tr class="odd">
							<td><c:out value="${status.count}"/></td>
							<td><a href="contractList?no=${forReceiptList.getCustomerID()}">
								<c:out value="${forReceiptList.getCustomerName()}" /></a>
							</td>
							<td><c:out value="${forReceiptList.getCustomerAge()}" />세</td>
							<c:if test="${forReceiptList.getCustomerGender()=='Men'}">
								<td>남자</td>
							</c:if>
							<c:if test="${forReceiptList.getCustomerGender()=='Women'}">
								<td>여자</td>
							</c:if>
							<td><c:out value="${forReceiptList.getCustomerJob()}" /></td>
							<td><c:out value="${forReceiptList.getPhoneNumber()}" /></td>
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