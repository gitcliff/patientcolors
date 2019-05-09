<DOCTYPE html>


<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<html>
<head>
 <title>patient colors information</title>
 
</head>

<body>
<form method="POST" modelAttribute="patientcolorss" action = "/openmrs-standalone/module/patientcolors/patientcolors.form">
<fieldset>
<legend><b>Enter patient details</b></legend>
Select patientName:
<select name="patientId">
<c:forEach items="${patients}" var="patient">
<option value="${patient.patientId}">${patient.personName}</option>
</c:forEach>
</select> 
Select PatientColor:
<select name="name">    
        <option value="yellow" style="background-color:yellow;">yellow</option>  
        <option value="blue" style="background-color:blue;">Blue</option>  
        <option value="black" style="background-color:black;">Black</option>  
        <option value="green" style="background-color:green;">Green</option>  
        <option value="Red" style="background-color:red;">Red</option>  
        <option value="Maroon" style="background-color:maroon;">Maroon</option>  
        <option value="Gray" style="background-color:gray;">Gray</option>  
        <option value="purple" style="background-color:purple;">Purple</option>  
        <option value="white" style="background-color:white;">White</option> 
        <option value="silver" style="background-color:silver;">Silver</option>
        option value="brown" style="background-color:brown;">brown</option>  
 </select><br/>
  <button type="Submit">Submit</button>
  </fieldset>
</form>

</body>





</html>
