<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<%@page import="com.arquitecturajava.json.*" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	String json = "{\"nombre\":\"Juan\"}";
	LeerJsonPersona lector = new LeerJsonPersona();
	Persona persona = lector.getPersona(json);
	out.println("Nombre leido: " + persona.getNombre());
	%>

</body>
</html>