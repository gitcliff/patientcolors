<%@ include file="/WEB-INF/template/include.jsp"%>

<%@ include file="/WEB-INF/template/header.jsp"%>

<table boarder="1">
<thead>
<tr>
<th>patient_id</th>
<th>patient_name</th>
<th>color_name</th>
</tr>
</thead>

<tbody>
<c:forEach var="patient" items="${patients}">
<tr>
<td> <c:out value = "${patient.patientId}" /></td>
<td><c:out value = "${patient.personName}" /></td>
</tr>
</c:forEach>
</tbody>
</table>

<%@ include file="/WEB-INF/template/footer.jsp"%>
