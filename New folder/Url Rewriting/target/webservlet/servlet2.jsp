<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>

<body>
    <h1>Servlet2 Page</h1>
    <hr>
    <a href="index.jsp">| Home |</a>       
    <hr>
    fullname            : ${fullname}<br>
    servlet1InitParam   : ${servlet1InitParam}<br>
    servlet2InitParam   : ${servlet2InitParam}
</body>

</html>