
	
function join_chk() {

    var regId= RegExp(/^[A-Za-z]{1}\w{6,}$/);
    var regPwd= RegExp(/^(?=.*[A-Za-z])(?=.*\d)(?=.*[@$!%*#?&])[A-Za-z\d@$!%*#?&]{6,12}$/);   
    var regName= RegExp(/^[가-힣]+$/);
    var regBirth= RegExp(/[0-9]{8}$/);   
    var regPhone= RegExp(/[0-9]{11}$/);   
    var regEmail= RegExp(/^[a-zA-Z0-9+-\_.]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$/);   
    

	if ($('#inputId').val() == '') {
		$('#inputId').focus();
		$('#id_check').text("아이디를 입력해주세요.");
		$('#id_check').css('color', 'red');
		return false;
	} else if (!regId.test($("#inputId").val())) {
		$('#inputId').focus();
		$('#id_check').text("아이디는 영문소문자와 숫자 6 자리 이상 입력해주세요.");
		$('#id_check').css('color', 'red');
		return false;
	} else {
		$('#id_check').text("");
	}
	
	
	if ($('#inputPwd').val() == '') {
		$('#inputPwd').focus();
		$('#pwd_check').text("비밀번호를 입력해주세요.");
		$('#pwd_check').css('color', 'red');
		return false;
	} else if (!regPwd.test($("#inputPwd").val())) {
		$('#inputPwd').focus();
		$('#pwd_check').text("비밀번호는 영문, 숫자, 특수문자 조합 6~12자리 사이로 입력해주세요.");
		$('#pwd_check').css('color', 'red');
		return false;
	} else {
		$('#pwd_check').text("");
	}
	
	if ($('#inputPwdck').val() == '') {
		$('#inputPwdck').focus();
		$('#pwdck_check').text("비밀번호를 확인해주세요.");
		$('#pwdck_check').css('color', 'red');
		return false;
	} else if ($("#inputPwdck").val() != ($("#inputPwd").val())) {
			$('#pwdck_check').text("비밀번호가 일치하지 않습니다.");
			$('#pwdck_check').css('color', 'red');
			$("#inputPwdck").val("");
			$("#inputPwdck").focus();
			return false;	
	} else {
		$('#pwdck_check').text("");
	}


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
    var regPwd= RegExp(/^(?=.*[A-Za-z])(?=.*\d)(?=.*[@$!%*#?&])[A-Za-z\d@$!%*#?&]{6,12}$/);   
    var regName= RegExp(/^[가-힣]+$/);
    var regBirth= RegExp(/[0-9]{8}$/);   
    var regPhone= RegExp(/[0-9]{11}$/);   
    var regEmail= RegExp(/^[a-zA-Z0-9+-\_.]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$/);   

	if ($('#inputId').val() == '') {
		$('#inputId').focus();
		$('#id_check').text("아이디를 입력해주세요.");
		$('#id_check').css('color', 'red');
		return false;
	} else if (!regId.test($("#inputId").val())) {
		$('#inputId').focus();
		$('#id_check').text("아이디는 영문소문자와 숫자 6 자리 이상 입력해주세요.");
		$('#id_check').css('color', 'red');
		return false;
	} else {
		$('#id_check').text("");
	}
	
	
	if ($('#inputPwd').val() == '') {
		$('#inputPwd').focus();
		$('#pwd_check').text("비밀번호를 입력해주세요.");
		$('#pwd_check').css('color', 'red');
		return false;
	} else if (!regPwd.test($("#inputPwd").val())) {
		$('#inputPwd').focus();
		$('#pwd_check').text("비밀번호는 영문, 숫자, 특수문자 조합 6~12자리 사이로 입력해주세요.");
		$('#pwd_check').css('color', 'red');
		return false;
	} else {
		$('#pwd_check').text("");
	}
	
	if ($('#inputPwdck').val() == '') {
		$('#inputPwdck').focus();
		$('#pwdck_check').text("비밀번호를 확인해주세요.");
		$('#pwdck_check').css('color', 'red');
		return false;
	} else if ($("#inputPwdck").val() != ($("#inputPwd").val())) {
			$('#pwdck_check').text("비밀번호가 일치하지 않습니다.");
			$('#pwdck_check').css('color', 'red');
			$("#inputPwdck").val("");
			$("#inputPwdck").focus();
			return false;	
	} else {
		$('#pwdck_check').text("");
	}


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


function id_chk() {
	
	var adminId =  $("#inputId").val();
	var regIdTest= (/^[A-Za-z]{1}\w{6,}$/).test(adminId);

	if (!regIdTest) {
		$('#inputId').focus();
		$('#id_check').text("아이디는 영문소문자와 숫자 6 자리 이상 입력해주세요.");
		$('#id_check').css('color', 'red');
		return false;
	} else {
		$.ajax({
            type : 'post',
            data : {"adminId" : adminId},
            url : '/admin/idCheck',
            dataType : 'json',
            success : function(data) {
				var result = Object.values(data);
				
				if (result == 'txt1') {
						$("#inputId").focus();
						$("#id_check").text("이미 사용중이거나 탈퇴한 아이디 입니다.");
						$("#id_check").css("color", "red");
					} else {
						$('#inputPwd').focus();						
						$("#id_check").text("멋진 아이디네요!");
						$("#id_check").css("color", "blue");
					}
					
				}, error : function() {
						console.log("실패");
				}
			});
	
	}
}

function eno_chk() {
	
	var adminEno =  $("#inputEno").val();

	$.ajax({
		type: 'post',
		data: { "adminEno": adminEno },
		url: '/admin/enoCheck',
		dataType: 'json',
		success: function(data) {
			var result = Object.values(data);

			if (result == 'txt1') {
				$("#inputEno").focus();
				$("#adminEno_check").text("사용중인 사원번호 입니다.");
				$("#adminEno_check").css("color", "red");
			} else {
				$('#inputName').focus();
				$("#adminEno_check").text("");
			}

		}, error: function() {
			console.log("실패");
		}
	});	
	
}

