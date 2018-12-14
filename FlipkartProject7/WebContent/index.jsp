<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">

	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
 	 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  	 <link rel="stylesheet" href="Misc.css">
  	  <link rel="stylesheet" href="footer.jsp">

	  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
 	 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
<title> FlipKart </title>
<style>

</style>
</head>
<body>


   <div class="fixed-header">
        <div class="container">
     
            <nav>
            
    <div class="row">
  <div class="col-sm-2" > <img src="" width="40" height="30"/> </div>
<div class="col-sm-6">
  <form class="example" action="/action_page.php"> <input type="text"  class="form-control"  placeholder="Serach For Product, Brand and more" id="usr" name="search"> <button type="submit"><i class="fa fa-search"></i></button>
</form>
   

  </div>
  <div class="col-sm-2" class="btn btn-primary"  data-toggle="modal"     data-target="#myModal"  > <a href="Mail.jsp" </a> Login &amp; Signin 
 
  </div>
   <div class="col-sm-1">
   <div class="dropdown">
	  
	More<i class="fa fa-caret-down"></i>
	  
	  <div class="dropdown-content">
	    <a class="fa fa-briefcase" style="margin-left: 10px;   color:blue" href="#">&nbsp;&nbsp;&nbsp; Link 1  </a>
	    <a  href="#">Link 2</a>
	    <a class="fa fa-download" style="margin-left: 10px;   color:blue"href="#"> &nbsp;&nbsp;&nbsp; Link 3</a>
	  	</div>
		</div>
   </div>
    <div class= "fa fa-shopping-cart " style="font-size:19px"  "col-sm-1"> &nbsp;Cart</div>
</div>
            </nav>
          
        </div>
    </div>
  <div class="container-fluid">
  <div class="row">
  <div class="col-sm-1">
  <div class="dropdown">
	  
	   Electronics <i class="fa fa-caret-down"></i>
	  
	  <div class="dropdown-content">
	    <a href="#">Link 1</a>
	    <a href="#">Link 2</a>
	    <a href="#">Link 3</a>
	  	</div>
  </div>
    </div>
  <div class="col-sm-2">
  <div class="dropdown">
	  
	   TV &amp; Appliances <i class="fa fa-caret-down"></i>
	  
	  <div class="dropdown-content">
	    <a href="#">Link 1</a>
	    <a href="#">Link 2</a>
	    <a href="#">Link 3</a>
	  	</div>
  </div>
   </div>
    <div class="col-sm-1">
  <div class="dropdown">
	  
	 Men <i class="fa fa-caret-down"></i>
	  
	  <div class="dropdown-content">
	    <a href="#">Link 1</a>
	    <a href="#">Link 2</a>
	    <a href="#">Link 3</a>
	  	</div>
  </div>
   </div>
     

  <div class="col-sm-1">
  <div class="dropdown">
	  
	  Women<i class="fa fa-caret-down"></i>
	  
	  <div class="dropdown-content">
	    <a href="#">Link 1</a>
	    <a href="#">Link 2</a>
	    <a href="#">Link 3</a>
	  	</div>
		</div>
 
</div>
  <div class="col-sm-2">
  <div class="dropdown">
	  
	 Baby &amp; Kids<i class="fa fa-caret-down"></i>
	  
	  <div class="dropdown-content">
	    <a href="#">Link 1</a>
	    <a href="#">Link 2</a>
	    <a href="#">Link 3</a>
	  	</div>
		</div>
 
</div>
 <div class="col-sm-2">
  <div class="dropdown">
	  
	 Home &amp; Furniture<i class="fa fa-caret-down"></i>
	  
	  <div class="dropdown-content">
	    <a href="#">Link 1</a>
	    <a href="#">Link 2</a>
	    <a href="#">Link 3</a>
	  	</div>
		</div>
 
</div>
 <div class="col-sm-2">
  <div class="dropdown">
	  
	 Sports, Books &amp; More 
	 <i class="fa fa-caret-down"></i>
	  
	  <div class="dropdown-content">
	    <a href="#">Link 1</a>
	    <a href="#">Link 2</a>
	    <a href="#">Link 3</a>
	  	</div>
		</div>
 
</div>
 <div class="col-sm-1">Offer zone </div>
 </div>
</div>
<div class="col-container">
<div   class="col" style="background:grey">
  
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">
      <div class="item active">
        <img src="C:\Users\Aakash\eclipse-workspace\FLipKartProj8\WebContent\la.jpg" alt="Los Angeles" style="width:100%;">
      </div>

      <div class="item">
        <img src="C:\Users\Aakash\eclipse-workspace\FLipKartProj8\WebContent\chicago.jpg" alt="Chicago" style="width:100%;">
      </div>
    
      <div class="item">
        <img src="C:\Users\Aakash\eclipse-workspace\FLipKartProj8\WebContent\ny.jpg" alt="New york" style="width:100%;">
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
</div>
<div class="footer">
</div>

<form action ="hello" method="get">



</form>

</body>
</html>