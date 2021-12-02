package mantenimientos;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import interfaces.TipoInformeInterface;
import model.TipoInforme;
import utils.MySQLConexion8;

public class GestionTipoInformeMySQL implements TipoInformeInterface {
	@Override
	public ArrayList<TipoInforme> listadodeInformes() {
			ArrayList<TipoInforme> lista = null;
			Connection con = null;
			PreparedStatement pst = null;
			ResultSet rs = null;
			try {
				con = MySQLConexion8.getConexion();
				String sql = "select*from TipoInforme";
				pst = con.prepareStatement(sql);
				rs = pst.executeQuery();
				lista = new ArrayList<TipoInforme>();
				while (rs.next()) {
					TipoInforme c = new TipoInforme();
					c.setIdTipoInforme(rs.getInt(1));
					c.setDescripcion(rs.getString(2));
					lista.add(c);
				}
			} catch (Exception e) {
				System.err.println("Error en listado de Cursos" + e.getMessage());
			} finally {
				MySQLConexion8.closeConexion(con);// cerrar la coneccion
			}
			return lista;
		
	}
}
