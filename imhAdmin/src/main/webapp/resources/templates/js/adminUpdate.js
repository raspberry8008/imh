
	
function join_chk() {
    var regName= RegExp(/^[가-힣]+$/);
    var regBirth= RegExp(/[0-9]{8}$/);   
    var regPhone= RegExp(/[0-9]{11}$/);   
    var regEmail= RegExp(/^[a-zA-Z0-9+-\_.]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$/);   

	if ($('#inputadminDno').val() == '') {
		$('#adminDno_check').text("부서를 선택해주세요.");
		$('#adminDno_check').css('color', 'red');
		return false;
	} else {
		$('#adminDno_check').text("");
	}
	
	if ($('#inputadminDno').val() == '') {
		$("#inputadminDno").focus();
		$('#adminDno_check').text("사원번호를 입력해주세요.");
		$('#adminDno_check').css('color', 'red');
		return false;
	} else {
		$('#adminDno_check').text("");
	}
	
	
	if ($('#inputName').val() == '') {
		$('#inputName').focus();
		$('#name_check').text("이름을 입력해주세요.");
		$('#name_check').css('color', 'red');
		return false;
	} else if (!regName.test($("#inputName").val())){
		$('#inputName').focus();
		$('#name_check').text("이름은 한글만 입력가능합니다.");
		$('#name_check').css('color', 'red');
		return false;
	} else {
		$('#name_check').text("");
	}
	
	if ($('#inputBirth').val() == '') {
		$('#inputBirth').focus();
		$('#birth_check').text("생년월일을 입력해주세요.");
		$('#birth_check').css('color', 'red');
		return false;
	} else if (!regBirth.test($("#inputBirth").val())){
		$('#inputBirth').focus();
		$('#birth_check').text("생년월일을 8자리로 입력해주세요.");
		$('#birth_check').css('color', 'red');
		return false;
	} else {
		$('#birth_check').text("");
	}
	
	if ($('#inputPhone').val() == '') {
		$('#inputPhone').focus();
		$('#phone_check').text("연락처를 입력해주세요.");
		$('#phone_check').css('color', 'red');
		return false;
	} else if (!regPhone.test($("#inputPhone").val())){
		$('#inputPhone').focus();
		$('#phone_check').text("연락처를 11자리로 입력해주세요.");
		$('#phone_check').css('color', 'red');
		return false;
	} else {
		$('#phone_check').text("");
	}
	
	if ($('#inputEmail').val() == '') {
		$('#inputEmail').focus();
		$('#email_check').text("이메일을 입력해주세요.");
		$('#email_check').css('color', 'red');
		return false;
	} else if (!regEmail.test($("#inputEmail").val())){
		$('#inputEmail').focus();
		$('#email_check').text("이메일 형식으로 입력해주세요.");
		$('#email_check').css('color', 'red');
		return false;
	} else {
		$('#email_check').text("");
	}


}


function join_ch() {

    var regId= RegExp(/^[A-Za-z]{1}\w{6,}$/);
    var regName= RegExp(/^[가-힣]+$/);
    var regBirth= RegExp(/[0-9]{8}$/);   
    var regPhone= RegExp(/[0-9]{11}$/);   
    var regEmail= RegExp(/^[a-zA-Z0-9+-\_.]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$/);   

	if ($('#inputadminDno').val() == '') {
		$('#adminDno_check').text("부서를 선택해주세요.");
		$('#adminDno_check').css('color', 'red');
		return false;
	} else {
		$('#adminDno_check').text("");
	}
	
	if ($('#inputadminDno').val() == '') {
		$("#inputadminDno").focus();
		$('#adminDno_check').text("사원번호를 입력해주세요.");
		$('#adminDno_check').css('color', 'red');
		return false;
	} else {
		$('#adminDno_check').text("");
	}
	
	
	if ($('#inputName').val() == '') {
		$('#inputName').focus();
		$('#name_check').text("이름을 입력해주세요.");
		$('#name_check').css('color', 'red');
		return false;
	} else if (!regName.test($("#inputName").val())){
		$('#inputName').focus();
		$('#name_check').text("이름은 한글만 입력가능합니다.");
		$('#name_check').css('color', 'red');
		return false;
	} else {
		$('#name_check').text("");
	}
	
	if ($('#inputBirth').val() == '') {
		$('#inputBirth').focus();
		$('#birth_check').text("생년월일을 입력해주세요.");
		$('#birth_check').css('color', 'red');
		return false;
	} else if (!regBirth.test($("#inputBirth").val())){
		$('#inputBirth').focus();
		$('#birth_check').text("생년월일을 8자리로 입력해주세요.");
		$('#birth_check').css('color', 'red');
		return false;
	} else {
		$('#birth_check').text("");
	}
	
	if ($('#inputPhone').val() == '') {
		$('#inputPhone').focus();
		$('#phone_check').text("연락처를 입력해주세요.");
		$('#phone_check').css('color', 'red');
		return false;
	} else if (!regPhone.test($("#inputPhone").val())){
		$('#inputPhone').focus();
		$('#phone_check').text("연락처를 11자리로 입력해주세요.");
		$('#phone_check').css('color', 'red');
		return false;
	} else {
		$('#phone_check').text("");
	}
	
	if ($('#inputEmail').val() == '') {
		$('#inputEmail').focus();
		$('#email_check').text("이메일을 입력해주세요.");
		$('#email_check').css('color', 'red');
		return false;
	} else if (!regEmail.test($("#inputEmail").val())){
		$('#inputEmail').focus();
		$('#email_check').text("이메일 형식으로 입력해주세요.");
		$('#email_check').css('color', 'red');
		return false;
	} else {
		$('#email_check').text("");
	}

	document.getElementById('sendForm').submit();
}

