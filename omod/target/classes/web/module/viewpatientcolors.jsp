<%@ include file="/WEB-INF/template/include.jsp"%>
<%@ include file="/WEB-INF/template/header.jsp"%>

<table border="1">
<head>
<tr>
<th>COLOR_ID</th>
<th>PATIENT_ID</th>
<th>COLOR</th>
</tr>
</head>
<body>
<font color='green'>${msg}</front>
<tr>
<td> <c:out value = "${patientcolorss.patientcolorsId}"/></td>
<td><c:out value = "${patientcolorss.patientId}"/></td>
<td><c:out value = "${patientcolorss.name}" /></td>
</tr>
</body>
</table>

<a href="/openmrs-standalone/module/patientcolors/patientcolors.form"><b>BACK</b></a> 
<%@ include file="/WEB-INF/template/footer.jsp"%>
