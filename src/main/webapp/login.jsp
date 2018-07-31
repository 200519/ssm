<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="/include/taglib.tag" %>

<html>
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   <title>login</title>
</head>
<body>
	<h2>登陆页面</h2>
	
	<form action="" method="post">
	
	<div>用户：<input id="username" name="username" value=""></div>
	
	<div>密码：<input id="password" name="password" type="password" value="" ></div>
	
	<button name="submitBtn" id="submitBtn">确定</button>
	
	</form>
	<%-- <button name="registerBtn" id="registerBtn" onclick="window.location.href='${ctx}/register.jsp'">注册</button> --%>
	<a href="${ctx}/register.jsp">注册</a>
</body>
</html>