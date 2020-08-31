<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Payment-Type</title>
 <style>
	body{
	text-align: center;
	background-image: url(https://learnyst.s3.amazonaws.com/assets/schools/2410/resources/images/1_iaye1_3m3x7x_oq0w3u.png?v=nfb2rq);
	color:wheat
}
div{
	padding-top: 180px;
    margin-bottom: 80px;
}
button{
    background-color: rgb(204, 130, 238);
    margin-bottom: 30px;
    width: 250px;
    height: 60px;
    color: white;
    border-radius: 20px;
    outline: none;
    border: 1px solid rgb(213, 130, 238);
    font-size: 18px;
    cursor: pointer;
}
button:hover{
    background-color:rgb(255, 192, 239);
    border: rgb(255, 192, 239);
    color: black;
}



 </style> 
  
 
</head>
<body>
       <div>
        <form action="/statuspage/statustype" method="get">
            <button >Direct-Payment</button>                
       </form>
       <form action="/statuspage/status1type" method="get">
           <button >Cross-Border-Payment</button>          
       </form>
       </div>
      
       
</body>
</html>