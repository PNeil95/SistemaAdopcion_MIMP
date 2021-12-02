<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sistema de Renovación para Adopción</title>
<!-- bootstrap cdn -->
	<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"/>
	<!-- font awesome cdn -->
	<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"/>
	<!-- style.css -->
	<link rel="stylesheet" type="text/css" href="css/inicio.css"/>
	<!-- jquery cdn -->
	<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.js"></script>
</head>
<body>

	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12 navbar">
				<a href="inicio.jsp" class="logo navbar-brand text-white offset-md-2"></a>
				<ul class="nav">
					<li class="nav-item active"><a href="inicio.jsp" class="nav-link">Inicio</a></li>
					<li class="nav-item "><a href="RegistrarInforme.jsp" class="nav-link">Registrar</a></li>
					<li class="nav-item "><a href="informe?opcion=l" class="nav-link">Informe</a></li>
					<li class="nav-item"><a href="crudusu?opcion=c" class="nav-link">Cerrar sesión</a></li>
					<!-- <li class="nav-item"><a href="#" class="nav-link">Portfolio</a></li> -->
					<!-- <li class="nav-item"><a href="#" class="nav-link">Contact Us</a></li> -->
				</ul>
			</div>

			<!-- slider banner	 -->

			<div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
			  <ol class="carousel-indicators">
			    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
			    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
			    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
			  </ol>
			  <div class="carousel-inner">
			    <div class="carousel-item active">
			    	<div class="info">
			      		<h1>Solicitud de renovación de convenios y de autorización a organismos acreditados para prestar colaboración en procesos de adopción internacional</h1>
			      	</div>
			    </div>
			    <div class="carousel-item">
			    	<div class="info">
			    		<img src="img/registroOrganismo.png">
			      	</div>
			    </div>
			    <div class="carousel-item">
			    	<div class="info">
			    		<img src="img/adopcion.jpg">
			      	</div>
			    </div>
			  </div>
			  <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
			    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
			    <span class="sr-only">Previous</span>
			  </a>
			  <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
			    <span class="carousel-control-next-icon" aria-hidden="true"></span>
			    <span class="sr-only">Next</span>
			  </a>
			</div>
		</div>
	</div>



	<!-- scripts -->
	<!-- bootstrap javascript cdn -->
	<script type="text/javascript" src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</body>

</html>