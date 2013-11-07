<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link rel="stylesheet" type="text/css" href="../css/index.css">
	<link href='http://fonts.googleapis.com/css?family=Lato' rel='stylesheet' type='text/css'>
	<script src="../javascript/prototype.js" type="text/javascript"></script>
	<script src="../javascript/scriptaculous.js" type="text/javascript"></script>
</head>
<body>
	<form id="myForm" action="exampleServlet.do" method="post" onsubmit="return validateForm();">
		<input name="email" id="email" placeholder="name@email.com">  <input type="submit" value="Go" id="go" >
	</form>
	<script type="text/javascript">
	function validateForm () {
		var x=document.forms["myForm"]["email"].value;
		var atpos=x.indexOf("@");
		var dotpos=x.lastIndexOf(".");
		if (atpos<1 || dotpos<atpos+2 || dotpos+2>=x.length)
		{
			$('email').shake();
			$('go').shake();
			return false;
		}
	}
	</script>
</body>


</html>