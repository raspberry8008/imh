<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
<!DOCTYPE html>
<html>
<%@ include file="../include/head.jsp" %>
<%@ include file="../include/plugin_js.jsp" %>
<script>
function checkz() {

    //아이디 공백확인 
    if($("#adminid").val() == ""){
 	  $('#id_check').text("아이디를 입력해주세요.");
 	  $('#id_check').css('color', 'red');
      $("#adminid").focus();
      return false;
    }

    //비밀번호 공백확인
    if($("#adminPwd").val() == ""){ 
    $('#pwd_check').text("비밀번호를 입력해주세요.");
    $('#pwd_check').css('color', 'red');
    $("#adminPwd").focus();
    return false;
   }
    document.getElementById('sendForm').submit();
} 

</script>

<body class="bg-gradient-success">
    <div class="container">

        <!-- Outer Row -->
        <div class="row justify-content-center">

            <div class="col-xl-10 col-lg-12 col-md-9">

                <div class="card o-hidden border-0 shadow-lg my-5">
                    <div class="card-body p-0">
                        <!-- Nested Row within Card Body -->
                        <div class="row">
                            <div class="col-lg-6 d-none d-lg-block bg-login-image"></div>
                            <div class="col-lg-6">
                                <div class="p-5">
                                    <div class="text-center">
                                        <h1 class="h2 text-gray-700 mb-4" >IMH ADMIN</h1>
                                        <p>For the things we have to learn before we can do them, we learn by doing them.</p>
                                    </div>
                                    <hr>
                                    <form action="/admin/login" id="sendForm" method="post">
                                        <div class="form-group">
                                        <P>아이디</P>
                                            <input type="text" class="form-control form-control-user"
                                                id="adminId" name="adminId" 
                                                placeholder="아이디">
                                                <div class="check_font" id="id_check"></div>
                                        </div>
                                        <div class="form-group">
                                        <P>비밀번호</P>
                                            <input type="password" class="form-control form-control-user"
                                                id="adminPwd" name="adminPwd" placeholder="비밀번호">
                                                <div class="check_font" id="pwd_check" ></div>
                                        </div>
                                        <div class="alert alert-light" role="alert">${message}</div>
                                        
                                        <button class="w-100 btn btn-success" onclick='checkz()' >로그인</button>                
                                    </form>
                                        <hr>
                                    <div class="d-flex justify-content-center">
                                    root/1234
                                    </div>
								</div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
 
</html>