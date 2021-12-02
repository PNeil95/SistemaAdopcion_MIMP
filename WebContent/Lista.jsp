<%--@page import="beans.UsuarioDTO"--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	
	
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>	
<%
// validar si ha logueado
%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reporte de Datos</title>
<link href="css/estilos.css" rel="stylesheet">

<!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

<!--    Datatables  -->
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/bs4/dt-1.10.20/datatables.min.css"/>  


<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


</head>
<body
	style="background-image: url('img/fondo.png'); background-size: cover; background-repeat: no-repeat;">

	<div id="contenedor" style="background-color: #85929e">
		<header
			style="background-color: red; padding: 10px; margin-bottom: 10px;">
			<h1 style="text-align: center; color: white;">Ministerio de la
				Mujer y Poblaciones Vulnerables</h1>
				<p>
				Ud se ha identificado como : <strong>${u.nombre }
					</strong>
			</p>

		</header>

		<main
			style="background-size: 100% 100%; margin-top: 10px; margin-right: 5px">
			<nav style="width: 25%; float: left; justify-content: center;">
				<ul>
					<a type="button" class="btn btn-secondary btn-lg btn-block" href="inicio.jsp">inicio</a>
					
					<a type="button" class="btn btn-secondary btn-lg btn-block" href="RegistrarInforme.jsp">Registro</a>
					<a type="button" class="btn btn-secondary btn-lg btn-block" href="informe?opcion=l">Informes</a>
					<a type="button" class="btn btn-secondary btn-lg btn-block" href="crudusu?opcion=c">Cerrar sesión</a>
				</ul>
			</nav>
			<section style="width: 65%; float: left; margin-left: 40px;">

				<div class="container">
					<table id="myTable" class="table table-striped table-bordered" style="width:100%; background: white;">
<thead>
						<tr style="background: #6c757d; color:white;">
							<th>Id</th>
							<th>Nombre</th>
							<th>Fecha de Ingreso</th>
							<th>Fecha de Actualizacion</th>
							<th>Estado</th>
							
							<th>
							Actualizar</th>
							

						</tr>
						 </thead>
						<tbody>
							<c:forEach items="${lstReporte }" var="r">
								<tr class="grilla_campo">
									<td>${r.getIdReporteInformacion()  }</td>
									<td>${r.getNombreResponsable() }</td>
									<td>${r.getFechaReporte() }</td>
									<td>${r.getFechaUltimaActualizacion() }</td>
									<td>${r.getEstado() }</td>
									
						<td><a href="informe?opcion=b&cod=${r.getIdReporteInformacion() }">
											<img alt="" src="img/editar.png" >
									</a></td>
				
									
									
															
							</tr>
							</c:forEach>
						</tbody>


					</table>
				</div>
			</section>
		</main>
		<footer> </footer>
	</div>
	
	
<!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.4.1.js"></script>

    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
      
      
<!--    Datatables-->
    <script type="text/javascript" src="https://cdn.datatables.net/v/bs4/dt-1.10.20/datatables.min.js"></script>  
      
    
      
<script>
//Idiomas con el 1er método   
$(document).ready(function() {
    $('#myTable').DataTable({ 
        "language": {
           "url": "https://cdn.datatables.net/plug-ins/1.10.20/i18n/Spanish.json"
        }
        
        });
});
 //Idiomas con el 2do método   
/* $(document).ready(function() {
  $('#myTable').DataTable({
    "language": {
                "sProcessing":     "Procesando...",
                "sLengthMenu":     "Mostrar _MENU_ registros",
                "sZeroRecords":    "No se encontraron resultados",
                "sEmptyTable":     "Ningún dato disponible en esta tabla =(",
                "sInfo":           "Mostrando registros del _START_ al _END_ de un total de _TOTAL_ registros",
                "sInfoEmpty":      "Mostrando registros del 0 al 0 de un total de 0 registros",
                "sInfoFiltered":   "(filtrado de un total de _MAX_ registros)",
                "sInfoPostFix":    "",
                "sSearch":         "Buscar:",
                "sUrl":            "",
                "sInfoThousands":  ",",
                "sLoadingRecords": "Cargando...",
                "oPaginate": {
                    "sFirst":    "Primero",
                    "sLast":     "Último",
                    "sNext":     "Siguiente",
                    "sPrevious": "Anterior"
                },
                "oAria": {
                    "sSortAscending":  ": Activar para ordenar la columna de manera ascendente",
                    "sSortDescending": ": Activar para ordenar la columna de manera descendente"
                },
                "buttons": {
                    "copy": "Copiar",
                    "colvis": "Visibilidad"
                }
         }
  });
}); */
</script>
     
</body>





</html>