<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8" />
   
    <meta charset="utf-8" />
    <link rel="apple-touch-icon" sizes="76x76" href="../resources/apple-icon.png">
    <link rel="icon" type="image/png" href="../resources/favicon.ico">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <title>Rajasthan IT Day</title>
    <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />
    <!--     Fonts and icons     -->
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700,200" rel="stylesheet" />
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css" />
    <!-- CSS Files -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
    <link href="../resources/light-bootstrap-dashboard.css?v=2.0.1" rel="stylesheet" />
    <!-- CSS Just for demo purpose, don't include it in your project -->
    <link href="../resources/demo.css" rel="stylesheet" />
	<script defer src="https://use.fontawesome.com/releases/v5.0.8/js/all.js" integrity="sha384-SlE991lGASHoBfWbelyBPLsUlwY1GwNDJo3jSJO04KZ33K2bwfV9YBauFfnzvynJ" crossorigin="anonymous"></script>

</head>


<body>
    <div class="wrapper">
        <div class="sidebar" data-image="../resources/sidebar-5.jpg">
            <!--
        Tip 1: You can change the color of the sidebar using: data-color="purple | blue | green | orange | red"

        Tip 2: you can also add an image using data-image tag
    -->
            <div class="sidebar-wrapper">
                <div class="logo">
                    <a href="#" class="simple-text">
                        ${message.name}
                    </a>
                </div>
                <ul class="nav">
                   <li class="nav-item active">
                        <a class="nav-link" href="../dashboard">
                            <i class="fas fa-columns" style="margin-right:10px;font-size:25px;"></i>
                            <p>Dashboard</p>
                        </a>
                    </li>
                    <li>
                        <a class="nav-link" href="../user">
                           <i class="fas fa-user-circle" style="margin-right:10px;font-size:25px;"></i>
                            <p>User Profile</p>
                        </a>
                    </li>
                    <li>
                        <a class="nav-link" href="../weather">
                           <i class="fas fa-sun" style="margin-right:10px;font-size:25px;"></i>
                            <p>Weather Information</p>
                        </a>
                    </li> 
					<li>
                        <a class="nav-link" href="../bid">
                           <i class="fas fa-handshake" style="margin-right:10px;font-size:25px;"></i>
                            <p>Create bid</p>
                        </a>
                    </li>
                    <li class="">
                        <a class="nav-link" href="../rent">
                           <i class="fas fa-code-branch" style="margin-right:10px;font-size:25px;"></i>
                            <p>Rent</p>
                        </a>
                    </li>
                    <li>
                        <a class="nav-link" href="collab">
                           <i class="fas fa-users" style="margin-right:10px;font-size:25px;"></i>
                            <p>Land Collaboration</p>
                        </a>
                    </li>
					<li class="">
                        <a class="nav-link" href="rent">
                           <i class="fas fa-code-branch" style="margin-right:10px;font-size:25px;"></i>
                            <p>Rent</p>
                        </a>
                    </li>
                    <li>
                        <a class="nav-link" href="buy">
                           <i class="fas fa-shopping-cart" style="margin-right:10px;font-size:25px;"></i>
                            <p>Buy Products</p>
                        </a>
                    </li>
                    <!--<li>
                        <a class="nav-link" href="./typography.html">
                            <i class="nc-icon nc-paper-2"></i>
                            <p>Typography</p>
                        </a>
                    </li> 
                    <li>
                        <a class="nav-link" href="./icons.html">
                            <i class="nc-icon nc-atom"></i>
                            <p>Icons</p>
                        </a>
                    </li>
                    <li>
                        <a class="nav-link" href="./maps.html">
                            <i class="nc-icon nc-pin-3"></i>
                            <p>Maps</p>
                        </a>
                    </li>
                    <li>
                        <a class="nav-link" href="./notifications.html">
                            <i class="nc-icon nc-bell-55"></i>
                            <p>Notifications</p>
                        </a>
                    </li>-->
                    
                </ul>
            </div>
        </div>
        <div class="main-panel">
            <!-- Navbar -->
            <nav class="navbar navbar-expand-lg " color-on-scroll="500">
                <div class=" container-fluid  ">
                    <a class="navbar-brand" href="#"> Dashboard </a>
                    <button href="" class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" aria-controls="navigation-index" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-bar burger-lines"></span>
                        <span class="navbar-toggler-bar burger-lines"></span>
                        <span class="navbar-toggler-bar burger-lines"></span>
                    </button>
                    <div class="collapse navbar-collapse justify-content-end" id="navigation">
                        <ul class="nav navbar-nav mr-auto">
                            <li class="nav-item">
                                <a href="#" class="nav-link" data-toggle="dropdown">
                                    <!--<i class="nc-icon nc-palette"></i>-->
                                    <span class="d-lg-none">Dashboard</span>
                                </a>
                            </li>
                            <li class="dropdown nav-item">
                                <a href="#" class="dropdown-toggle nav-link" data-toggle="dropdown">
                                   <i class="fas fa-bell"></i>
                                    <span class="notification">5</span>
                                    <span class="d-lg-none">Notification</span>
                                </a>
                                <ul class="dropdown-menu">
                                    <a class="dropdown-item" href="#">Notification 1</a>
                                    <a class="dropdown-item" href="#">Notification 2</a>
                                    <a class="dropdown-item" href="#">Notification 3</a>
                                    <a class="dropdown-item" href="#">Notification 4</a>
                                    <a class="dropdown-item" href="#">Another notification</a>
                                </ul>
                            </li>
                            <!--<li class="nav-item">
                                <a href="#" class="nav-link">
                                    <i class="nc-icon nc-zoom-split"></i>
                                    <span class="d-lg-block">&nbsp;Search</span>
                                </a>
                            </li>-->
                        </ul>
                        <ul class="navbar-nav ml-auto">
                            
                            <!--<li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    <span class="no-icon">Dropdown</span>
                                </a>
                                <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                                    <a class="dropdown-item" href="#">Action</a>
                                    <a class="dropdown-item" href="#">Another action</a>
                                    <a class="dropdown-item" href="#">Something</a>
                                    <a class="dropdown-item" href="#">Something else here</a>
                                    <div class="divider"></div>
                                    <a class="dropdown-item" href="#">Separated link</a>
                                </div>
                            </li>-->
                            <li class="nav-item">
                                <a class="nav-link" href="#">
                                    <span class="no-icon">Log out</span>
                                </a>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
            <!-- End Navbar -->
            <div class="content">
                <div class="container-fluid">
				
					<div id="google_translate_element"></div>
				
				<script type="text/javascript">
function googleTranslateElementInit() {
  new google.translate.TranslateElement({pageLanguage: 'en'}, 'google_translate_element');
}
</script>

<script src="http://translate.google.com/translate_a/element.js?cb=googleTranslateElementInit"></script>
				
				
				
                    <div class="row">
                        
						
                        <div class="col-md-12">
                            <div class="card ">
                                <div class="card-header ">
										 
								  <h4 class="card-title"> Bid Details</h4>
                                   <!-- <p class="card-category">24 Hours performance</p>-->
                                </div>
                                <div class="card-body ">
                                   <!-- <div id="chartHours" class="ct-chart"></div>-->
								   
								   <div class="row">
                                           <div class="col-md-5 pr-1">
                                                <div class="form-group">
                                                    <label>Created By</label>
                                                    <input type="text" class="form-control" placeholder="Created By" value="${message.item.soldByname }" disabled>
                                                </div>
                                            </div>
                                        </div>
								   
								   
								   
								   
								   <div class="row">
                                            <!--<div class="col-md-5 pr-1">
                                                <div class="form-group">
                                                    <label>Company (disabled)</label>
                                                    <input type="text" class="form-control" disabled="" placeholder="Company" value="Creative Code Inc.">
                                                </div>
                                            </div>-->
                                            <div class="col-md-12 pr-1">
                                                <div class="form-group">
                                                    <label>Item Name</label>
                                                    <input type="text" class="form-control" placeholder="Name of item" value="${message.item.name_item }" disabled>
                                                </div>
                                            </div>
                                           <!-- <div class="col-md-6 pl-1">
                                                <div class="form-group">
                                                    <label for="exampleInputEmail1">Email address</label>
                                                    <input type="email" class="form-control" placeholder="Email">
                                                </div>
                                            </div>-->
                                        </div>
                                        <div class="row">
                                            <div class="col-md-12 pr-1">
                                                <div class="form-group">
                                                    <label>Description</label>
                                                    <input type="text" class="form-control" placeholder="Item Description" value="${message.item.description}" disabled>
                                                </div>
                                            </div>
                                            <!--<div class="col-md-6 pl-1">
                                                <div class="form-group">
                                                    <label>Last Name</label>
                                                    <input type="text" class="form-control" placeholder="Last Name" value="Andrew">
                                                </div>
                                            </div>-->
                                        </div>
                                        <!--<div class="row">
                                            <div class="col-md-12">
                                                <div class="form-group">
                                                    <label>Address</label>
                                                    <input type="text" class="form-control" placeholder="Address" value="">
                                                </div>
                                            </div>
                                        </div> -->
                                        <div class="row">
                                            <div class="col-md-4 pr-1">
                                                <div class="form-group">
                                                    <label>Price</label>
                                                    <input type="number" class="form-control" placeholder="Price" value="${message.item.price}" disabled>
                                                </div>
                                            </div>
                                            <div class="col-md-4 px-1">
                                                <div class="form-group">
                                                    <label>Quantity</label>
                                                    <input type="number" class="form-control" placeholder="Quantity" value="${message.item.quantity}" disabled>
                                                </div>
                                            </div>
											<div class="col-md-4 px-1">
                                                <div class="form-group">
                                                    <label>Type of Bid</label>
                                                    <input type="text" class="form-control" placeholder="Type of Bid" value="${message.item.type}" disabled>
                                                </div>
                                            </div>
											
                                        </div>
								   
					
                                </div>
								
								 <div class="row">
                                           <br><br>
											
                                        </div>
								
								<!-- list of bidders -->
								
								<div class="row">
								
									<div class="col-md-12 pr-1">
                                         <div class="table-responsive">          
  <table class="table">
    <thead>
      <tr>
		 
		<th style="visibility:hidden;">User ID</th>
        <th>#</th>
		<th>Name</th>
        <th>Price</th>
        <th>Status</th>
		<th>Action</th>
        
      </tr>
    </thead>
    <tbody>
    
      <c:forEach var = "item" items="${message.list}">
      <tr>
        <td style="visibility:hidden;"></td>
        <td></td>
		<td>${item.userName}</td>
        <td>${item.price}</td>
		<td>${item.status}</td>
		<td><button type="button" class="btn btn-info">Select</button></td>
      </tr>
      </c:forEach>
    </tbody>
  </table>
  </div>	       
  					</div>				
                         </div>
								
								
								
								
                                <div class="card-footer ">
                                   <!-- <div class="legend">
                                        <i class="fa fa-circle text-info"></i> Open
                                        <i class="fa fa-circle text-danger"></i> Click
                                        <i class="fa fa-circle text-warning"></i> Click Second Time
                                    </div>
                                    <hr>
                                    <div class="stats">
                                        <i class="fa fa-history"></i> Updated 3 minutes ago
                                    </div>-->
                                </div>
                            </div>
                        </div>
                    </div>
                   
                </div>
            </div>
            <footer class="footer">
                <div class="container">
                    <nav>
                        <!--<ul class="footer-menu">
                            <li>
                                <a href="#">
                                    Home
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    Company
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    Portfolio
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    Blog
                                </a>
                            </li>
                        </ul>-->
                       
                    </nav>
                </div>
            </footer>
        </div>
    </div>
  
</body>
<!--   Core JS Files   -->
<script src="../resources/jquery.3.2.1.min.js" type="text/javascript"></script>
<script src="../resources/popper.min.js" type="text/javascript"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" type="text/javascript"></script>
<!--  Plugin for Switches, full documentation here: http://www.jque.re/plugins/version3/bootstrap.switch/ -->
<script src="../resources/bootstrap-switch.js"></script>
<!--  Google Maps Plugin    -->
<!--<script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE"></script>-->
<!--  Chartist Plugin  -->
<!--<script src="../resources/chartist.min.js"></script> -->
<!--  Notifications Plugin    -->
<script src="../resources/bootstrap-notify.js"></script>
<!-- Control Center for Light Bootstrap Dashboard: scripts for the example pages etc -->
<script src="../resources/light-bootstrap-dashboard.js?v=2.0.1" type="text/javascript"></script>
<!-- Light Bootstrap Dashboard DEMO methods, don't include it in your project! -->
<script src="../resources/demo.js"></script>
<script type="text/javascript">
    $(document).ready(function() {
        demo.initDashboardPageCharts();
        demo.showNotification();
    });
</script>
</html>