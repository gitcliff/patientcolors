<DOCTYPE html>
<html>
<head>
 <title>patient colors information</title>
 
</head>

<body>
<form action="/openmrs-standalone/module/patientcolors/patientcolors.form" method="post">
<fieldset>
<legend><b>Enter patient details</b></legend>
Select patientName:
<select name = "patient_id">
<c:forEach var="patient" items"${patients}">
<option value="${patient.patientId}">${patient.personName}</option>
</c:forEach>
</select>
Select PatientColor:
<select name="color">    
        <option value="yellow" style="background-color:yellow;">yellow</option>  
        <option value="white" style="background-color:blue;">Blue</option>  
        <option value="black" style="background-color:black;">Black</option>  
        <option value="green" style="background-color:green;">Green</option>  
        <option value="red" style="background-color:red;">Red</option>  
        <option value="red" style="background-color:maroon;">Maroon</option>  
        <option value="red" style="background-color:gray;">Gray</option>  
        <option value="red" style="background-color:purple;">Purple</option>  
        <option value="red" style="background-color:white;">White</option> 
        <option value="red" style="background-color:silver;">Silver</option>
        option value="red" style="background-color:brown;">brown</option>  
 </select><br/>
  <button type="Submit">Submit</button>
  </fieldset>
</form>

</body>





</html>