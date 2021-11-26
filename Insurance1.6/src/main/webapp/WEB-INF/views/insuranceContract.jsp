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
<title>insurance contract</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

	<div class="container w-50 mt-5">
		<p class="fs-2 text-center">보험 계약 - 고객 리스트</p>
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
				    <c:forEach items="${customerList}" var="customerList" varStatus="status">
						<tr class="odd">
							<td><c:out value="${status.count}"/></td>
							<td><a href="joinInsurance?no=${customerList.getCustomerID()}">
								<c:out value="${customerList.getCustomerName()}" /></a>
							</td>
							<td><c:out value="${customerList.getCustomerAge()}" /></td>
							<td><c:out value="${customerList.getCustomerGender()}" /></td>
							<td><c:out value="${customerList.getCustomerJob()}" /></td>
							<td><c:out value="${customerList.getPhoneNumber()}" /></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<div class="text-center">
				<a href="home"><button type="button" class="btn btn-secondary">목록</button></a>
			</div>
	</div>
</body>
</html>