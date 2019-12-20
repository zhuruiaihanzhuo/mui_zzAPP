<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<title>欢迎登录后台管理界面平台</title>
<link href="resource/css/style.css" rel="stylesheet" type="text/css" />
<script language="JavaScript" src="resource/js/jquery.js"></script>
<script src="resource/js/cloud.js" type="text/javascript"></script>
<script language="javascript">
	$(function(){
    $('.loginbox').css({'position':'absolute','left':($(window).width()-692)/2});
	$(window).resize(function(){  
    $('.loginbox').css({'position':'absolute','left':($(window).width()-692)/2});
    })  ;
});  
</script> 
</head>

<body style="background-color:#1c77ac; background-image:url(resource/images/light.png); background-repeat:no-repeat; background-position:center top; overflow:hidden;">

<form method="post" onsubmit="return check()" action="login/Users_query.do">

    <div id="mainBody">
      <div id="cloud1" class="cloud"></div>
      <div id="cloud2" class="cloud"></div>
    </div>  


<div class="logintop">    
    <span>欢迎登录后台管理界面平台</span>    
    <ul>

    <li><a href="javascript:void(0)">帮助</a></li>
    <li><a href="javascript:void(0)">关于</a></li>
    </ul>    
    </div>
    
    <div class="loginbody">
    
    <span class="systemlogo"></span> 
       
    <div class="loginbox">
    
    <ul>
    <li><input id="username" name="username" type="text" class="loginuser"  /></li>
    <li><input id="password" name="password" type="password" class="loginpwd" /></li>
    <li><input name="" type="submit" class="loginbtn" value="登录"   /></li>
    </ul>
    
    
    </div>
    
    </div>
    
    
    

	
    </form>
    <script type="text/javascript">
    function check(){
    	if($("#username").val()!=null&& "" != $("#username").val() && $("#password").val() !=null&&
			 "" != $("#password").val()){
			  $.ajax({
		type: "post",
		 url:"login/Users_query2.do",
		data:{
		
		username: $("#username").val(),
		password : $("#password").val(),
		
		},
		success: function (data) {
			return true;
		},
		 error:function(){
	    alert("登录失败,账号或密码错误");
	    	 return false;
	    }
		 });
		
		 } else{
		alert("请填写账号或密码");
		  return false;
		 }
		
		
			 }
    
    
    
    </script>
</body>
</html>