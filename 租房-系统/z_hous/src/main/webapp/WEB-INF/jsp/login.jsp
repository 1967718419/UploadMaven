<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>房屋租赁系统</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/styles.css">
</head>
<body style="background: url(imgs/3.jpg);background-size:cover;">
<div class="wrapper">

	<div class="container">
		<h1>房屋租赁网站</h1>
		<form class="form" id="loginform" action="logincheck" method="post">
			<div><input type="text" name="username" placeholder="用户名" ></div>
			<div><input type="password" id="password" name="password" placeholder="密码" ></div>
			<div><input type="text" id="verify_input"   placeholder="请输入验证码" ></div>
			<div >
        	<a href="javascript:void(0);" title="点击更换验证码">
            <img id="imgVerify" src="${pageContext.request.contextPath}/getcode?" alt="更换验证码" height="36" width="170" onclick="getVerify(this);">
        </a>
    </div>
			<div>
		<label class="radio inline">
      	  	<input id="admin" type="radio" name="type" value="admin"/> 房东
		</label>
		<label class="radio inline">
			<input id="zuke" type="radio" name="type" value="zuke" checked/> 租客
		</label>
		&nbsp;&nbsp;&nbsp;&nbsp;<a href="register">没有账号？点我</a>
		</div>
			<button type="submit">登录</button>
		</form>
	</div>
</div>

<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-2.1.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.validate.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/localization/messages_zh.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/md5.js"></script>
<script type="text/javascript">
function getVerify() {
    // $("#imgCode").on("click", function() {
    $("#imgVerify").attr("src", '${pageContext.request.contextPath}/getcode?' + Math.random());//jquery方式
    // });
}

	 $().ready(function() {
		 
		 $('button').click(function(){
				var a = $('#password').val();
				var b = hex_md5(a);
				$('#password').val(b);
			 });
		 
        // 在键盘按下并释放及提交后验证提交表单
        $("#loginform").validate({
            rules : {
                username : {
                    required : true,
                    rangelength:[2,8]
                },
               
                password : {
                    required : true,
                    rangelength:[2,32]
                },
            },
            messages : {
                username : {
                    required : "请输入用户名",
                    rangelength:"用户名长度必须在2-8个字符之间"
                },
                password : {
                    required : "请输入密码",
                    rangelength:"密码长度必须在2-32个字符之间"
                },
            }
        });
    })

var error="${error}";
if(error=="error"){
alert("帐户名或密码错误");
}
</script>
</body>
</html>