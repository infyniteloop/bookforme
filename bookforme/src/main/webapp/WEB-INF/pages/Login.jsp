<%@page import="com.fasterxml.jackson.annotation.JsonInclude.Include"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css"/>
<spring:url var="js" value="/resources/js"/>	
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Book For Me - ${title} </title>

    <!-- Bootstrap core CSS -->
    <link href="${css}/bootstrap.min.css" rel="stylesheet">

    <!-- Add custom CSS here -->
    <link href="${css}/myapp.css" rel="stylesheet">

</head>

<body>


	<!-- Navigation Bar -->
	<%@include file="./shared/navbar.jsp" %>

	<!-- /.container -->
	
	<div class="container">

        <div class="row">
			<%@include file="./shared/sidebar.jsp" %>
			
			<c:if test="${title == 'home'}">
			<%@include file="home.jsp" %>
			</c:if>
			
			
	
        </div>

    </div>
  
	
	
	
	
  	<!-- Footer Section  -->
  	<%@include file="./shared/footer.jsp" %>
  	
  	
  	
    <!-- /.container -->

    <!-- JavaScript -->
    <script src="${js}/jquery.js"></script>
    <script src="${js}/bootstrap.min.js"></script>

</body>

</html>
