package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAOFactory;
import model.ReporteInformacion;
import model.Usuario;


/**
 * Servlet implementation class InformeServlet
 */
@WebServlet(name = "informe", urlPatterns = { "/informe" })
public class InformeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Entro al Servlet informe");
		String opc = request.getParameter("opcion");
		switch(opc) {
			case "l": listado(request, response); break;
			case "b": buscar(request,response);break;
			case "r": registrar(request,response);break;
			case "a": actualizar(request,response);break;
			default:
				break;
		}
	}

	private void actualizar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Ingreso al Servlet Registrar Informe");
		//variables
		String mensaje=""; 
		String url; 
		
		int IdInforme=Integer.parseInt(request.getParameter("txtIdInforme"));
		String nombre = request.getParameter("txtResponsable");
		String FechaR = request.getParameter("txtFechaR");
		String FechaA = request.getParameter("txtFechaA");
		String Contacto = request.getParameter("txtContacto");
		String NumInternacional = request.getParameter("txtNumInternacional");
		String NumLocal = request.getParameter("txtNumLocal");
		String Direccion = request.getParameter("txtDireccion");
		int Informe = Integer.parseInt(request.getParameter("cboInforme"));
		int Usuario = Integer.parseInt(request.getParameter("txtUsuario") );
		String estado = request.getParameter("txtEstado");
		
		ReporteInformacion r = new model.ReporteInformacion(IdInforme, nombre, FechaR, FechaA, Contacto, NumInternacional, NumLocal, Direccion, Informe, Usuario, estado);  
		

		DAOFactory gr = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
		
		int ok = gr.getReporteInformacionDAO().actualizar(r);
		
		if(ok==0) {
			mensaje="Error al Actualizar";
			url="/ActualizarInforme.jsp";
					
		}else {
			mensaje="Actualizacion correcta";
			url="/inicio.jsp";
		}
		

		request.setAttribute("actualizar", mensaje);

		request.getRequestDispatcher(url).forward(request, response);
		System.out.println("Termino el Servlet");
		
	}

	private void registrar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Ingreso al Servlet Registrar Informe");
		//variables
		String mensaje=""; 
		String url; 

		String nombre = request.getParameter("txtResponsable");
		String FechaR = request.getParameter("txtFechaR");
		String FechaA = request.getParameter("txtFechaA");
		String Contacto = request.getParameter("txtContacto");
		String NumInternacional = request.getParameter("txtNumInternacional");
		String NumLocal = request.getParameter("txtNumLocal");
		String Direccion = request.getParameter("txtDireccion");
		int Informe = Integer.parseInt(request.getParameter("cboInforme"));
		int Usuario = Integer.parseInt(request.getParameter("txtUsuario") );

		
		ReporteInformacion r = new model.ReporteInformacion(nombre, FechaR, FechaA, Contacto, NumInternacional, NumLocal, Direccion, Informe, Usuario);
		

		DAOFactory gr = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
		
		int ok = gr.getReporteInformacionDAO().registrar(r);
		
		if(ok==0) {
			mensaje="Error al Registrar";
			url="/RegistrarInforme.jsp";
					
		}else {
			mensaje="Registro OK";
			url="/inicio.jsp";
		}
		

		request.setAttribute("mensaje", mensaje);

		request.getRequestDispatcher(url).forward(request, response);
		System.out.println("Termino el Servlet");
		
	}

	private void buscar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("--Ingreso a buscar--");
		
		//Leer el codigo a buscar ->href del listado
		int codigo=  Integer.parseInt(request.getParameter("cod"))    ;

		DAOFactory fabrica = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
		ReporteInformacion p = fabrica.getReporteInformacionDAO().buscar(codigo);
		
		request.setAttribute("p", p);
		request.getRequestDispatcher("/ActualizarInforme.jsp").forward(request, response);
		
		
		
	}

	private void listado(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("--Ingreso a Listado--");
		

		DAOFactory fabrica= DAOFactory.getDAOFactory(DAOFactory.MYSQL);
		ArrayList<ReporteInformacion> lista = fabrica.getReporteInformacionDAO().listar();
		
		request.setAttribute("lstReporte", lista);
		request.getRequestDispatcher("/Lista.jsp").forward(request, response);
		
	}

}
