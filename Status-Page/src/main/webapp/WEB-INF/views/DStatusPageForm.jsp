<%--   <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Status</title>
</head>
<body>

	<form method="POST" action="statuscheck">
		
	  		 <label for="custid">Customer Id:</label>
	 		 <input type="text" id="custid" name="custid"><br><br>
	 		 
	 		 <label for="transactionnumber">Transaction Number:</label>
	 		 <input type="text" id="transactionnumber" name="transactionnumber"><br><br>
	 		 
	 		 <input type="submit" value="Check">
		</form>


</body>
</html> --%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Direct Payment Status</title>
<style>
	body{
	text-align: center;
	background-image: url(https://learnyst.s3.amazonaws.com/assets/schools/2410/resources/images/1_iaye1_3m3x7x_oq0w3u.png?v=nfb2rq);
	color:wheat
}
form{
	padding-top: 180px;
	margin-bottom: 40px;
}
input{
	width: 220px;
	height: 38px;
	border-radius: 5px;
	outline: none;
	font-size: 20px;
	margin-bottom: 10px;
	padding-right: 40px;
	border: 1px solid wheat;
}

label{
	font-size: 28px;
	padding: 10px;
}



  </style>
</head>
<body>

	<form method="POST" action="statuscheck">
		
	  		 <label for="custid">Customer Id:</label>
	 		 <input type="text" id="custid" name="custid"><br><br>
	 		 
	 		 <label for="transactionnumber">Transaction Number:</label>
	 		 <input type="text" id="transactionnumber" name="transactionnumber"><br><br>
	 		 
	 		 <input style="background-color: pink; cursor: pointer;" type="submit" value="Check">
		</form>


</body>
</html>