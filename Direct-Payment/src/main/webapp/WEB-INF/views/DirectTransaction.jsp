<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Direct-Payment</title>
</head>
<body>
<h1>DIRECT-PAYMENT</h1>
	
		
		
		<form method="POST" action="save-transaction">
		
	  		 <label for="custid">Customer Id:</label>
	 		 <input type="text" id="custid" name="custid"><br><br>
	 		 <label for="sourceaccount">Source Account Number:</label>
	 		 <input type="text" id="sourceaccount" name="sourceaccount"><br><br>
	 		 <label for="targetaccount">Target Account Number:</label>
	 		 <input type="text" id="targetaccount" name="targetaccount"><br><br>
	 		 <label for="amountinr">Amount(INR):</label>
	 		 <input type="text" id="amountinr" name="amountinr"><br><br>
	 		 
	 		 <input type="submit" value="Pay">
		</form>
		
		
		
</body>
</html>

--%>




<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Direct-Payment</title>
  <style>

body{
	text-align: center;
	background-image: url(https://learnyst.s3.amazonaws.com/assets/schools/2410/resources/images/1_iaye1_3m3x7x_oq0w3u.png?v=nfb2rq);
	color:wheat
}
h1{
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
	border: 1px solid black;
}

label{
	font-size: 20px;
	padding: 10px;
}

select{
	width: 220px;
	height: 38px;
	border-radius: 5px;
	outline: none;
	font-size: 20px;
	margin-bottom: 10px;
	padding-right: 40px;
	border: 1px solid black;
}
.button{
transition: ease 3;
}


  </style>
</head>
<body>
	<h1>DIRECT PAYMENT</h1>
	<form method="POST" action="save-transaction">
		
	  		 <label for="custid">Customer Id:</label>
	 		 <input type="text" id="custid" name="custid"><br><br>
	 		 <label for="sourceaccount">Source Account Number:</label>
	 		 <input type="text" id="sourceaccount" name="sourceaccount"><br><br>
	 		 <label for="targetaccount">Target Account Number:</label>
	 		 <input type="text" id="targetaccount" name="targetaccount"><br><br>
	 		 <label for="amountinr">Amount(INR):</label>
	 		 <input type="text" id="amountinr" name="amountinr"><br><br>
	 		 
	 		<label for="email">E-mail:</label>
	 		 <input type="text" id="email" name="email"><br><br>
	 		 
	 		 <input  class="button" style="cursor: pointer;background-color: rgb(245, 179, 207); "   type="submit" value="Pay">
		</form> 
	
</body>
</html>