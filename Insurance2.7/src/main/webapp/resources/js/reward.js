function checkNum(event) {
    if(event.keyCode < 48 || event.keyCode > 57) {
    	if (event.keyCode != 46) {
    		alert("숫자만 입력가능합니다");
			return false;
    	}
    }
}

function del(event) {
	var objTarget = event.srcElement || event.target;
	var _value = event.srcElement.value;
	if (/[ㄱ-ㅎㅏ-ㅡ가-힣]/g.test(_value)) {
		objTarget.value = null;
	}
}

function receipt() {
	var f = document.Receipt; 
	if (f.AccidentDate.value == "") {
		alert("사고 날짜를 입력해주세요");
		return false;
  	}
	if (f.DamagePrice.value == "") {
		alert("피해 금액을 입력해주세요");
		return false;
  	}
	
	if (confirm("저장하시겠습니까?")==true) {
		alert("저장되었습니다");
		return true;
	} else {
		return false;
	}
}

function checkPrice() {
	var f = document.Payment; 
	if (f.RewardDate.value == "") {
		alert("예상 지급 날짜를 입력해주세요");
		return false;
  	}
	if (f.RewardPrice.value == "") {
		alert("예상 보상 금액을 입력해주세요");
		return false;
  	}
	alert("체크완료");
	return true;
}

function payment() {
	var f = document.Payment; 
	if (f.Possibility.value == "") {
		alert("지급 가능 여부를 확인해주세요");
		return false;
  	}

	if (confirm("보상금을 지급하시겠습니까?")==true) {
		alert("지급 완료되었습니다");
		return true;
	} else {
		return false;
	}
}