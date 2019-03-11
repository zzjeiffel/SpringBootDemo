<!-- 头部的编码声明是必须的 -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
</head>
<body>
<c:forEach var="user" items="${userList}">
    <tr>
        <td>${user.userName}</td>
        <td>${user.password}</td>
        <td>${user.nickName}</td>
    </tr>
</c:forEach>
</body>
</html>
