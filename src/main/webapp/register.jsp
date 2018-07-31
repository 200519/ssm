<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="/include/taglib.tag" %>

<html>
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   <title>register</title>
</head>
<body>
	<h2>注册页面</h2>
	<form action="${ctx }/index/register" method="post">
		
		<div>用户：<input id="username" name="username" value=""></div>
		
		<div>输入密码：<input id="password" name="password" type="password" value="" ></div>
		
		<div>确认密码：<input id="password2" name="password2" type="password" value="" ></div>
		
		<div>真实姓名：<input id="name" name="name" value="" ></div>
		
		<div>年龄：<input id="age" name="age" value="0" ></div>
		
		<button name="submitBtn" id="submitBtn">确定</button>
	</form>
	
	<a href="${ctx}/login.jsp" id="returnBtn">返回</a>
</body>
</html>