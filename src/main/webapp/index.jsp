<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="/include/taglib.tag" %>

<html>
	<head>
    	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>主页</title>
    </head>
<body>
<h2>测试小DOME~主页</h2>

<div><a href="${ctx }/personController/showPerson">查看Person列表</a></div>
<button name="退出" onclick="logout()">退出</button>

<script type="text/javascript">
	function logout(){
		window.location.href="${ctx}/logout";
	}
</script>
</body>
</html>
