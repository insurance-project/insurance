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

function setting() {
	var f = document.StandardSetting; 
	if (f.CustomerMinAge.value == "") {
		alert("최소 가입 가능 나이를 입력해주세요");
		return false;
  	}
	if (f.CustomerMaxAge.value == "") {
		alert("최대 가입 가능 나이를 입력해주세요");
		return false;
  	}
	if (confirm("설정 완료하시겠습니까?")==true) {
		alert("설정되었습니다");
		return true;
	} else {
		return false;
	}
}