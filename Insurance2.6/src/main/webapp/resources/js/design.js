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

function design() {
	var f = document.InsuranceDesign; 
	if (f.InsuraceName.value == "") {
		alert("이름을 입력해주세요");
		return false;
  	}
	if (f.Premium.value == "") {
		alert("보험료를 입력해주세요");
		return false;
  	}
	if (f.PremiumRate.value == "") {
		alert("보험 요율을 입력해주세요");
		return false;
  	}
	if (f.Warranty.value == "") {
		alert("보장기간을 입력해주세요");
		return false;
  	}
	if (f.Reward.value == "") {
		alert("보상금을 입력해주세요");
		return false;
  	}
	if (f.RewardRate.value == "") {
		alert("보상율을 입력해주세요");
		return false;
  	}
	return true;
}

function totalProfit() {
	var f = document.PredictProfit; 
	if (f.Profit.value == "") {
		alert("예상 보험료를 입력해주세요");
		return false;
  	}
	if (f.Subscribers.value == "") {
		alert("예상 가입자 수를 입력해주세요");
		return false;
  	}
	return true;
}

function predictProfit() {
	var f = document.PredictProfit; 
	if (f.TotalProfit.value == "") {
		alert("손익 분석을 완료해주세요");
		return false;
  	}
	alert("보험 설계가 완료되었습니다.");
	return true;
}

function modify() {
	var f = document.InsuranceModify; 
	if (f.InsuraceName.value == "") {
		alert("이름을 입력해주세요");
		return false;
  	}
	if (f.Premium.value == "") {
		alert("보험료를 입력해주세요");
		return false;
  	}
	if (f.PremiumRate.value == "") {
		alert("보험 요율을 입력해주세요");
		return false;
  	}
	if (f.Warranty.value == "") {
		alert("보장기간을 입력해주세요");
		return false;
  	}
	if (f.Reward.value == "") {
		alert("보상금을 입력해주세요");
		return false;
  	}
	if (f.RewardRate.value == "") {
		alert("보상율을 입력해주세요");
		return false;
  	}
	if (confirm("수정하시겠습니까?")==true) {
		alert("수정되었습니다");
		return true;
	} else {
		return false;
	}
}

function deleteBtn() {
	if (confirm("삭제하시겠습니까?")==true) {
		alert("삭제되었습니다");
		return true;
	} else {
		return false;
	}
		
}