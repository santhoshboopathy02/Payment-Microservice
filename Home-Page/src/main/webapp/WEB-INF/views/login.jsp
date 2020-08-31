<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>

*{
    margin: 0;
    padding: 0;
    font-family: 'Open Sans', sans-serif;
}

body{
    background: url(https://learnyst.s3.amazonaws.com/assets/schools/2410/resources/images/a_fblwkv.png) no-repeat center;
    background-attachment: fixed;
    background-size: cover;
}

.container{
    width: 500px;
    height: 400px;
    margin: 0px auto;
    margin-top: 100px;
    text-align: center;
    background-color: rgba(95, 158, 160, 0.43);
}

.container img{
    width: 120px;
    height: 120px;
    margin-top:-50px;
    margin-bottom: 50px;
}

input[type="text"],input[type="password"]{
    width: 250px;
    height: 30px;
    margin-bottom: 30px;
    padding-left: 30px;
    font-size: 17px;
}

.input_box::before{
    content:url(https://res.cloudinary.com/dejzo3x6l/image/upload/v1462601843/login%20page%20design/user.png);
    position: absolute;
    padding: 3.2px;
    background-color: rgba(219, 116, 40, 0.33);
}

.input_box:nth-child(3)::before{
    content:url(https://res.cloudinary.com/dejzo3x6l/image/upload/v1462601842/login%20page%20design/lock.png);
}
.submit_btn{
    background-color:rgb(214, 119, 49);
    font-size: 20px;
    padding:10px 30px;
    border: none;
    letter-spacing: 2px;
    transition: background-color .2s;
    margin-bottom: 10px;
}
.submit_btn:hover{
    background-color:rgb(247, 136, 55);
    cursor: pointer;
}

a.for_pass{
    color: #d1cfcf;
}
a.for_pass:hover{
    color:white;
}



    </style>
</head>
<body>
    
<div class="container">
        <form method="POST" action="/auth">
        
        <!--   https://cdn.icon-icons.com/icons2/1378/PNG/512/avatardefault_92824.png -->

            <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/7/7e/Circle-icons-profile.svg/768px-Circle-icons-profile.svg.png" alt="Profile-pic">
           
			<div class="input_box">
                <input type="text" name="username" placeholder="User Name">
            </div>
            <div class="input_box">
                <input type="password" name="password" placeholder="Password">
            </div>
            <input type="submit" value="Login" class="submit_btn">
            <br><a href="#" class="for_pass">Forgot Password</a>
        </form>
 </div>


</body>
</html>