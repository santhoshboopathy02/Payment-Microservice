<%--  

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Payment-Successful</title>
</head>
<body>
		<h1>Payment Successful!!!</h1>
		
		<h3>Your Transaction Number Is </h3>
		
		 <form action="/homepage/home" method="get">
               <button >Go To Home</button>                
         </form>
</body>
</html>  


--%>






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
       
        <h1>Your status is SUCCESS </h1>
        
        <h3>your transaction number is ${transactionnumber}</h3>
      
        
      
        <form action="/homepage/home" method="get"><br>
            <button>Go To HomePage</button>
        </form>
        
        </div>
    </div>
</body>
</html>



