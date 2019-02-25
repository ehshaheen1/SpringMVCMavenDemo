<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<body>
<div>
	<div>
	<h2>CRM - Customer Relationship Manager</h2>
	</div>
</div>
	<div>
	<form:form action="saveCustomer" modelAttribute="cust" method="POST">
	   <h2>Save customer</h2>
	   <table>
	   <tbody>
	   <tr>
	   <td><label>First Name :</label></td>
	   <td><form:input path="firstName" /></td>
	   </tr>
	   <tr>
	   <td><label>Last Name :</label></td>
	   <td><form:input path="lastName" /></td>
	   </tr>
	   <tr>
	   <td><label>Email:</label></td>
	   <td><form:input path="email" /></td>
	   </tr>
	    <tr>
	   <td><label>Submit:</label></td>
	   <td><input type="submit" value="Save"/></td>
	   </tr>
	   
	   </tbody>
	   </table>
	   </form:form>
	   
	</div>


</body>
</html>