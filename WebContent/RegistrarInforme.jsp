<%@page import="model.TipoInforme"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@page import="dao.DAOFactory"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.TipoInforme"%>
<%--@page import="model.Categoria" --%>    

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/estilos.css" rel="stylesheet">
<!-- CSS only -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	
	


<!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <title>Registrar de datos</title>
</head>
<body>
<body>
    <div class="container">
    <br>
    <header>
			style="background-color: red; padding: 10px; margin-bottom: 10px;">
			<h1 style="text-align: center; color: white;">Ministerio de la
				Mujer y Poblaciones Vulnerables</h1>
				<p>
				Ud se ha identificado como : <strong>${u.nombre }
					</strong>
			</p>

		</header>
    <nav style="margin-top:2%;width: 25%; float: left; justify-content: center;">
				<ul>
<ul>
					<a type="button" class="btn btn-secondary btn-lg btn-block" href="inicio.jsp">inicio</a>
					
					<a type="button" class="btn btn-secondary btn-lg btn-block" href="RegistrarInforme.jsp">Registro</a>
					<a type="button" class="btn btn-secondary btn-lg btn-block" href="informe?opcion=l">Informes</a>
					<a type="button" class="btn btn-secondary btn-lg btn-block" href="crudusu?opcion=c">Cerrar sesión</a>
				</ul>
			</nav>
			
			
        <div class="row">
            <div class="col">               
                <div class="shadow-lg p-3 mb-5 mt-4 bg-body rounded">                                    
                    <div class="p-3 mb-2 bg-primary bg-gradient fw-bold text-white">Registrar de datos</div>
                    <form class="row g-3 needs-validation" novalidate  action="informe">
                      
                        <div class="col-md-6 position-relative">
                            <label for="apellido" class="form-label">Nombre del Responsable</label>
                            <input type="text" class="form-control" id="apellido" required name="txtResponsable"  value="${p.nombreResponsable}">
                            <!-- Mensajes para validación   -->
                            <div class="valid-tooltip">¡Campo válido!</div>
                            <div class="invalid-tooltip">Debe completar los datos.</div>
                        </div>
                        <div class="col-md-6 position-relative">
                            <label for="nombre" class="form-label">Fecha de Registro</label>
                            <input type="date" class="form-control" id="txtUltimaActualizacion" required name="txtFechaR"  value="${p.fechaReporte}">
                            <!-- Mensajes para validación   -->
                            <div class="valid-tooltip">¡Campo válido!</div>
                            <div class="invalid-tooltip">Debe completar los datos.</div>
                        </div>
                        <div class="col-md-6 position-relative">
                            <label for="nombre" class="form-label">Fecha de Acualización</label>
                            <input type="date" class="form-control" id="txtUltimaActualizacion" required name="txtFechaA" value="${p.fechaUltimaActualizacion}">
                            <!-- Mensajes para validación   -->
                            <div class="valid-tooltip">¡Campo válido!</div>
                            <div class="invalid-tooltip">Debe completar los datos.</div>
                        </div>
                        <div class="col-md-6 position-relative">
                            <label for="apellido" class="form-label">Contacto</label>
                            <input type="text" class="form-control" id="apellido" required name="txtContacto"  value="${p.contacto}">
                            <!-- Mensajes para validación   -->
                            <div class="valid-tooltip">¡Campo válido!</div>
                            <div class="invalid-tooltip">Debe completar los datos.</div>
                        </div>
                        <div class="col-md-6 position-relative">
                            <label for="apellido" class="form-label">Número Internacional</label>
                            <input type="text" class="form-control" id="apellido" required  name="txtNumInternacional" value="${p.numInternacional}">
                            <!-- Mensajes para validación   -->
                            <div class="valid-tooltip">¡Campo válido!</div>
                            <div class="invalid-tooltip">Debe completar los datos.</div>
                        </div>
                        <div class="col-md-6 position-relative">
                            <label for="apellido" class="form-label">Número Local</label>
                            <input type="text" class="form-control" id="apellido" required name="txtNumLocal"  value="${p.numLocal}">
                            <!-- Mensajes para validación   -->
                            <div class="valid-tooltip">¡Campo válido!</div>
                            <div class="invalid-tooltip">Debe completar los datos.</div>
                        </div>
                        <div class="col-md-6 position-relative">
                            <label for="apellido" class="form-label">Dirección Internacional</label>
                            <input type="text" class="form-control" id="apellido" required  name="txtDireccion" value="${p.dirInternacional}">
                            <!-- Mensajes para validación   -->
                            <div class="valid-tooltip">¡Campo válido!</div>
                            <div class="invalid-tooltip">Debe completar los datos.</div>
                        </div>
						<div class="col-md-6 position-relative">
                            <label for="pais" class="form-label">Tipo de Informe</label>
                            <select class="form-select" id="cboOrganismo" required   name="cboInforme">
                                <option selected disabled value="">Seleccione...</option>
                                 <%//obtener el listado de categorias
										DAOFactory fabrica = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
										ArrayList<TipoInforme> lista= fabrica.getTipoInformeDAO().listadodeInformes();
										//enviar el listado a la pagina
										request.setAttribute("lstinformes", lista);
										
										//enviar el listado al combo-->JSTL
									%>
									
									<c:forEach items="${lstinformes }" var="c">
										<%--seleccionar categoria enviado desde el listado --%>
										<c:if test="${c.idTipoInforme == p.idTipoInforme}">
											<option value="${c.idTipoInforme }" selected="selected">${c.descripcion}</option>		
										</c:if>
										<c:if test="${c.idTipoInforme != p.idTipoInforme}">
											<option value="${c.idTipoInforme }" >${c.descripcion}</option>		
										</c:if>
																		 
									</c:forEach>
					
                            </select>
                            <!-- Mensajes para validación   -->
                            <div class="valid-tooltip">¡Campo válido!</div>
                            <div class="invalid-tooltip">Debe completar los datos.</div>
                        </div> 

                        
                        
                        <div class="col-md-6 position-relative">
                            <label for="apellido" class="form-label">Código de usuario</label>
                            <input type="text" class="form-control" id="apellido" required name="txtUsuario" readonly="readonly"  value="${u.idCargo}">
                            <!-- Mensajes para validación   -->
                            <div class="valid-tooltip">¡Campo válido!</div>
                            <div class="invalid-tooltip">Debe completar los datos.</div>
                        </div>
                        
						<div class="col-12">
						<button class="btn btn-danger fw-bold float" type="submit" name="opcion" value="r">Registrar</button>
						<a class="btn btn-danger fw-bold float" type="submit" name="opcion" value="r">Actualizar</a>

                        <a class="btn btn-secondary fw-bold float" href="inicio.jsp">Volver</a>
                        </div>
                    </form>
                    ${mensaje }
                </div>
            </div>
        </div>
    </div>


    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

    <script>        
(function () {
  'use strict'

  
  var forms = document.querySelectorAll('.needs-validation')

 
  Array.prototype.slice.call(forms)
    .forEach(function (form) {
      form.addEventListener('submit', function (event) {
        if (!form.checkValidity()) {
          event.preventDefault()
          event.stopPropagation()
        }
        form.classList.add('was-validated')
      }, false)
    })
})()
    </script>    
  </body>


</body>
</html>