package mantenimientos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import interfaces.UsuarioInterface;
import model.Usuario;
import utils.MySQLConexion8;

public class GestionUsuarioMySQL implements UsuarioInterface {

	@Override
	public Usuario validarAcceso(String usuario, String password) {
		Usuario u = null;
		
		//Plantilla BD -> API JDBC - java.sql
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			con = MySQLConexion8.getConexion();
			String sql = "SELECT * FROM Usuario WHERE Usuario = ? and Contrasena = ?";
			pst = con.prepareStatement(sql);
			pst.setString(1, usuario);
			pst.setString(2, password);
			
			rs = pst.executeQuery();
			
			if (rs.next()) {
				u = new Usuario();
				u.setIdUsuario(rs.getInt(1));
				u.setUsuario(rs.getString(2));
				u.setPassword(rs.getString(3));
				u.setNombre(rs.getString(4));
				u.setIdCargo(rs.getInt(5));
			}
		} catch (Exception e) {
			System.err.println("Error al validar Acceso: " + e.getMessage());
		} finally {
			MySQLConexion8.closeConexion(con);
		}
		
		return u;
	}

}
