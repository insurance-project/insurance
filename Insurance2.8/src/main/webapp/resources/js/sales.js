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

function cusInfo() {
	var f = document.CustomerInfo; 
	if (f.CustomerName.value == "") {
		alert("이름을 입력해주세요");
		return false;
  	}
	if (f.Age.value == "") {
		alert("나이를 입력해주세요");
		return false;
  	}
	if (f.Job.value == "") {
		alert("직업을 입력해주세요");
		return false;
  	}
	if (f.PhoneNum.value == "") {
		alert("휴대폰 번호를 입력해주세요");
		return false;
  	}
	if (f.ResidentNum.value == "") {
		alert("주민등록번호를 입력해주세요");
		return false;
  	}
	if (confirm("저장하시겠습니까?")==true) {
		alert("저장되었습니다");
		return true;
	} else {
		return false;
	}
}

function join() {
	var chk_radio = document.getElementsByName('Join');
		var sel_type = null;
		for(var i=0; i<chk_radio.length; i++){
			if(chk_radio[i].checked == true){ 
				sel_type = chk_radio[i].value;
			}
		}

		if(sel_type == null){
                alert("보험을 선택해주세요"); 
			return false;
		}
}

