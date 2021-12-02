package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAOFactory;
import model.Usuario;

/**
 * Servlet implementation class CrudUsuarioServlet
 */
@WebServlet(name = "crudusu", urlPatterns = { "/crudusu" })
public class CrudUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entro al Servlet CrudUsuario...");
		String opc = request.getParameter("opcion");
		switch(opc) {
			case "l": login(request, response); break;
			case "c": cerrarSession(request, response); break;
			default:
				break;
		}
	}
	
	private void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Ingreso al Servlet Login...");
		String mensaje = "";
		String url = "";
		
		String usuario = request.getParameter("txtUsuario"); 
		String clave = request.getParameter("txtClave");
		
		DAOFactory fabrica = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
		Usuario u = fabrica.getUsuarioDAO().validarAcceso(usuario, clave);
		
		if (u == null) {
			mensaje = "Usuario o clave incorrecto";
			url = "/login.jsp";
		} else {
			mensaje = u.getNombre();
			url = "/inicio.jsp";
		}
		
		//Salidas
		request.setAttribute("mensaje", mensaje);
		request.getSession().setAttribute("u", u);
		request.getRequestDispatcher(url).forward(request, response);
	}

	private void cerrarSession(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("Ingreso al Servlet Cerrar Sessión");
		System.out.println("Sesión a cerrar : " + request.getSession().getId());
		request.getSession().invalidate();
		response.sendRedirect("login.jsp");
	}

}
