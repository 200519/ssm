<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="/include/taglib.tag" %>

<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>person list</title>
    </head>
    <body>
        <table>
            <tr>
                <th>姓名</th>
                <th>年龄</th>
                <th>操作</th>
            </tr>
            <c:forEach items="${persons}" var="person">
                <tr>
                    <td>${person.name }</td>
                    <td>${person.age }</td>
                    <td><a href="${ctx}/personController/personDetail?id=${person.id}" target="view_window">查看</a></td>
                </tr>
            </c:forEach>
        </table>
        <a href="javascript:void();" onclick="window.history.go(-1);">返回</a>
    </body>
</html>