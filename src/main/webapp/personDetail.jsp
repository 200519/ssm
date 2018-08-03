<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="/include/taglib.tag" %>

<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>person Detail</title>
    </head>
    <body>
        <div>姓名：${person.name }</div>
        <div>年龄：${person.age }岁</div>
        <div>用户名：${person.user.username }</div>
    </body>
</html>