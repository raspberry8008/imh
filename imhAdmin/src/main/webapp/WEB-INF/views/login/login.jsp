<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
<!DOCTYPE html>
<html>
<%@ include file="../include/head.jsp" %>
<%@ include file="../include/plugin_js.jsp" %>


<script>
  //카카오로그인
  function kakaoLogin() {
	  

    $.ajax({
        url: '/login/getKakaoAuthUrl',
        type: 'get',
        async: false,
        dataType: 'text',
        success: function (res) {
            location.href = res;
        }
    });

  }

  $(document).ready(function() {

      var kakaoInfo = '${kakaoInfo}';

      if(kakaoInfo != ""){
          var data = JSON.parse(kakaoInfo);

          alert("카카오로그인 성공 \n accessToken : " + data['accessToken']);
          alert(
          "user : \n" + "email : "
          + data['email']
          +"\n profile_image : "
          + data['profile_image']
          + "\n nickname : " 
          + data['nickname']);
      }
  });  

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
                                    <form action="/login/login" method="post">
                                        <div class="form-group">
                                        <P>아이디</P>
                                            <input type="text" class="form-control form-control-user"
                                                id="exampleInputEmail" name="adminId" 
                                                placeholder="아이디">
                                        </div>
                                        <div class="form-group">
                                        <P>비밀번호</P>
                                            <input type="password" class="form-control form-control-user"
                                                id="exampleInputPassword" name="adminPw" placeholder="비밀번호">
                                        </div>
                                        <button class="w-100 btn btn-success" type="submit">로그인</button>                
                                    </form>
                                        <hr>
                                    <div class="d-flex justify-content-center">
                                    <a href="javascript:void(0)" class="btn btn-warning text-dark m-1" onclick="kakaoLogin();" type="button">
                                    <i class="bi bi-chat-fill"> </i> 카카오톡 로그인</a>
                                    <a href="javascript:void(0)" class="btn btn-outline-light text-secondary m-1" onclick="kakaoLogin();" type="button">
                                   <strong class="text-success">N</strong>  네이버 로그인</a>
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