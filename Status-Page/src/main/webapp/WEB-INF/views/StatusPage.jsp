<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>-->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Status-Page</title>
<link href="/css/bootstrap.css"      rel="stylesheet">
<link href="/css/status.css"      rel="stylesheet">

<style>


body{
    line-height: 1.4;
    font-family: Arial, Helvetica, sans-serif;
    color: #333333;
}

button{
    padding: 12px;
    cursor: pointer;
    background-color: rgba(88, 0, 100, 0.966);
    border: none;
    outline: none;
    font-size: 16px;
    color: #fff;
    border-radius: 5px;

}


button:hover{
    background-color: violet;

}

.center{
    background-color: rgba(52, 0, 100, 0.884);
    height: 100vh;
    width: 100vw;
    display: flex;
    justify-content: center;
    align-items: center;
    
}

.center-box{
    background-color: #F7F7FA;
    border-radius: 12px;
    width: 300px;
    padding: 50px;

}


.centered-box button{
    width: 100%;
}

</style>


</head>
<body>

		
    <div class="center">
        <div class="center-box">
	      
	   <h1>Direct-Payment</h1>
		        <h3>Your status is Success</h3>
		       <h4> Customer ID= ${dstatus.custid}  </h4> 
		        <h4>Source Account Number= ${dstatus.sourceaccount}</h4>
		        <h4>Target Account Number=${dstatus.targetaccount}</h4>
		        <h4>Amount(INR)=${dstatus.amountinr}</h4>
		        <h4>Transaction Number= ${dstatus.transactionnumber}</h4>
		        <h4>Time= ${dstatus.timestamp} </h4>
	    
	       <form action="/homepage/home" method="get"><br>
	            <button>Go To HomePage</button>
	        </form>  
        
        </div>
    </div>
</body>
</html>



