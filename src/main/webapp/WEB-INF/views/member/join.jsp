<%@page import="com.happytable.service.MemberService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../includes/header.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	<!--
    CONTACT US  start
    ============================= -->
	<section id="contact-us">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="block ">
						<h1 class="heading wow fadeInUp" data-wow-duration="500ms"
							data-wow-delay="300ms">
							<span>회원 가입</span>
						</h1>
						<h3 class="title wow fadeInLeft" data-wow-duration="500ms"
							data-wow-delay="300ms">
							Sign Up for <span>Email Alerts</span>
						</h3>
						<form role="form" action="/member/join" method="post" id="myForm">
							<div class="form-group wow fadeInDown" data-wow-duration="500ms"
								data-wow-delay="600ms">
								<div class="input-group mb-3"
									style="display: flex; justify-content: center; margin: 20px;">
									<input type="text" class="form-control" placeholder="이름"
										aria-label="이름" name="name" id="name" minlength="2"
										maxlength="10"
										style="display: inline-block; width: 400px; margin-right: 10px;"
										required> <input type="text" class="form-control"
										id="phone" placeholder="핸드폰 번호 10자리 or 11자리 (-제외입력)"
										aria-label="핸드폰 번호" name="phone"
										style="display: inline-block; width: 400px;" required
										minlength="10" maxlength="11">
								</div>
								<div class="input-group mb-3"
									style="display: flex; justify-content: center; margin: 20px;">
									<span id="emailMessage"></span> <input type="text"
										class="form-control" placeholder="이메일 주소" aria-label="이메일 주소"
										name="email" id="email" minlength="10" maxlength="100"
										style="display: inline-block; width: 400px; margin-right: 10px;"
										required> <input type="text" class="form-control"
										placeholder="닉네임(2~10글자)" aria-label="닉네임" name="nickName"
										id="nickName" style="display: inline-block; width: 400px;"
										required minlength="2" maxlength="10">
								</div>
								<div class="input-group mb-3"
									style="display: flex; justify-content: center; margin: 20px;">
									<input type="password" class="form-control"
										placeholder="비밀번호(6~16글자)" aria-label="비밀번호" name="pw" id="pw"
										style="display: inline-block; width: 400px; margin-right: 10px;"
										required minlength="6" maxlength="16"> <input
										type="password" class="form-control" id="cpw"
										placeholder="비밀번호 확인" aria-label="비밀번호 확인" name="cpw"
										style="display: inline-block; width: 400px;" required
										minlength="6" maxlength="16">

								</div>
								<div class="input-group mb-3"
									style="display: flex; justify-content: center; margin-right: 400px;">
									<input type="text" class="form-control" placeholder="생년월일(6자리)"
										aria-label="생년월일(6자리)" name="birth" id="birth"
										style="display: inline-block; width: 400px; margin-right: 10px;"
										required minlength="6" maxlength="6">
								</div>
								<div class="input-group mb-3"
									style="display: flex; justify-content: center; margin-left: 600px;">
									<button type="submit" id="subBtn"
										class="btn btn-primary btn-lg wow bounceIn"
										data-wow-duration="500ms" data-wow-delay="1300ms"
										style="margin-right: 10px;">회원 가입</button>
									<button type="reset"
										class="btn btn-default btn-lg wow bounceIn"
										data-wow-duration="500ms" data-wow-delay="1300ms">리셋</button>
								</div>
							</div>
						</form>
					</div>
ㄹ



				</div>
			</div>
			<!-- .col-md-12 close -->
		</div>
		<!-- .row close -->

		<!-- .container close -->
	</section>
	<!-- #contact-us close -->

	<script src="/resources/js/join.js"></script>
	<%@ include file="../includes/footer.jsp"%>
</body>
</html>