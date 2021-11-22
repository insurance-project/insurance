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
<title>insurance design</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
	<h2>
	보험 설계하기
	</h2>
<form action="design.do" name="Design" method="POST" id="form">
	   	보험 이름 : <input type="text" name="InsuraceName"><br/>
	    보험 종류 : <input type="text" name="Kind"><br/>
	    보험료 : <input type="text" name="Premium"><br/>
	    보장기간 : <input type="text" name="Warranty"><br/>
	    보상금 : <input type="text" name="Reward"><br/>
	    premiumRate : <input type="text" name="PremiumRate"><br/>   
	    보상율 : <input type="text" name="RewardRate"><br/>    
	    손익 예측 : <input type="text" name="predict" value="${predict}"><br/>  
		<input type="submit" value="설계 완료" name="SubmitBtn">
		<input type="submit" value="손익 예측" name="PredictBtn">
		<a href="home"><input type="button" value="이전"></a>
		
	</form>	
</body>
</html>