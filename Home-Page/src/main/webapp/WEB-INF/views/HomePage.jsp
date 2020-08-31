<!-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%> -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home-Page</title>
<link href="/css/bootstrap.css"      rel="stylesheet">
<link href="/css/home.css"      rel="stylesheet">


<style>
body{
background-image: url(https://learnyst.s3.amazonaws.com/assets/schools/2410/resources/images/a_fblwkv.png);
 background-repeat: no-repeat;
 background-size: cover;
 /* background: linear-gradient(90deg, rgb(32, 0, 126) 0%, rgb(230, 30, 182) 100%);  */

}
main{
    text-align: center;
}
header{
    position: relative;
}
h1{
    color: white;
    padding-top: 110px;
    font-size: 90px;
}

button{
  padding:10px ;
  height: 60px; 
  width: 200px;
   border-radius: 5px; 
  border-bottom: 1px solid violet;
  margin-right: 28px;
  cursor: pointer;
  transform: scale(1);
  outline: none;
  font-size: 14px;
  font-weight: bold;
}

button:hover{
    background-color: wheat;
}
form{
    display: inline;
}




.mid{
  color: white;
  width: auto;
  padding-top: 200px;
  font-size: 18px;
  /* background-image: url(https://learnyst.s3.amazonaws.com/assets/schools/2410/resources/images/1_iaye1_3m3x7x_oq0w3u.png?v=nfb2rq); */
}

th,p{
    padding-right: 13px;
}

.center,p{
    display: inline;
    /* text-align: center; */
   
}



</style>


</head>
<body>

    <header>
    
     <img src="https://www.searchpng.com/wp-content/uploads/2018/11/phone-pe-1024x1024.png" style="width: 60px;
       			 height:60px; cursor: pointer; margin-left:0%;display:inline-block;" alt="">
       			 
    <form style="margin-left:78%; display:inline-block; margin-right:3%;" action="/homepage/logout">
        <button>LOG OUT</button>
    
        <img src="https://s3-ap-southeast-1.amazonaws.com/learnyst/assets/schools/learnyst/resources/icons/general/09.png" style=" cursor: pointer; width: 40px;
        height:40px; color:  white; float: right; ">
    
    
 
        
        </form>
    </header>

    <main>


        <h1>ABC Bank</h1>

                <div class="container" >
                 
                    <form action="/direct/payment" method="get">
                        <button >Direct-Payment</button>                
                    </form>
                    <form action="/cross/payment" method="get">
                        <button >Cross-Border-Payment</button>          
                    </form>
                    <form action="/statuspage/status" method="get">
                        <button name="action">Payment-Status</button>   
                    </form>

                </div>
    </main>
    <!-- <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br> -->
                

    <div  class="mid"> 
        <tbody>
           
                <th> <img style="margin-left: 250px;" src="https://learnyst.s3.amazonaws.com/assets/schools/2410/resources/images/1_0yxar.png" alt=""></th>
                <th> <img  style="margin-left: 250px;" src="https://learnyst.s3.amazonaws.com/assets/schools/2410/resources/images/2_5izqdh.png" alt=""><th>
        </tbody>
        <br><br><br>
           
      <div class="inline">

        <div class="center" >
            <p style="font-size: 40px; font-weight: bold;  margin-left: 200px;">Support</p><br>
            <p style="font-style: oblique; font-size: 20px; font-weight: lighter;  margin-left: 200px;" >We have a dedicated support team to answer!</p>
        </div>
            
        <!-- </th> -->
        <div class="center">
            <p  style="font-size: 40px; font-weight: bold;  margin-left: 250px;">Easy Transcations</p><br><br>
        <p style="font-style: oblique; font-size: 22px; font-weight: lighter;  margin-left: 680px;" >We have a dedicated support team to answer your questions. !</p>
        </div>
   
<br><br><br><br>

      </div>
    </div>
                
            
</body>

<div style="background:rgb(52, 0, 100);
height: 300px;
width: 100%; scale:(0.2); position: relative;  text-align: center; color: white; "  class="bottom">
<br><br>

<h2 style="font-size: 30px;">Contact us</h2>
<br>
<p>ABC gandhipuram ,100feet Coimbatore</p>

<br><br>

  GMAIL :  <a  style="list-style: none; color: white;" href="#"> abc@gmail.com </a><br><br><br>

<img   style="width: 50px; height: 50px; cursor: pointer; padding: 10px;" src="https://s3-ap-southeast-1.amazonaws.com/learnyst/assets/schools/learnyst/resources/icons/social/01.png" alt="">
<img  style="width: 50px; height: 50px; cursor: pointer;padding: 10px;" src="https://learnyst.s3.amazonaws.com/assets/schools/2410/resources/images/05_97kwte_kaprhg.png" alt="">
<img style="width: 50px; height: 50px; cursor: pointer;padding: 10px;" src="https://learnyst.s3.amazonaws.com/assets/schools/2410/resources/images/social_instagram_new_circle_512_2ty4yx.png" alt="">
</div>

</html>

