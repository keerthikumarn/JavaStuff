<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List of Teams</title>
</head>
<body>
	<h1>List of teams</h1>
	<p>Here you can see the list of the teams, edit them, remove or
		update.</p>
	<table border="1px" cellpadding="0" cellspacing="0">
		<thead>
			<tr>
				<th width="10%">Id</th>
				<th width="15%">Name</th>
				<th width="10%">Rating</th>
				<th width="10%">Actions</th>
			</tr>
		</thead>
		<tbody>

			<c:forEach var="team" items="${listOfTeams}">
				<tr>
					<td>${team.id}</td>
					<td>${team.name}</td>
					<td>${team.rating}</td>
					<td>
					<a href="<c:url value='/team/edit/${team.id}' />" >Edit</a>
					<a href="<c:url value='/team/delete/${team.id}' />" >Delete</a>
					<%-- <a href="${pageContext.request.contextPath}/team/edit/${team.id}.html">Edit</a><br />
					<a href="${pageContext.request.contextPath}/team/delete/${team.id}.html">Delete</a><br /> --%>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<p>
		<a href="${pageContext.request.contextPath}/index.html">Home page</a>
	</p>
</body>
</html>