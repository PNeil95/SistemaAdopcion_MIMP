package mantenimientos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import interfaces.ReporteInformacionInterface;
import model.ReporteInformacion;
import model.TipoInforme;
import utils.MySQLConexion8;

public class GestionReporteInformacionMySQL implements ReporteInformacionInterface {

	@Override
	public int registrar(ReporteInformacion r) {
		//BD plantilla
		int rs = 0;
		Connection con = null;
		PreparedStatement pst = null;
		try	{
			con = MySQLConexion8.getConexion();
			String sql = "INSERT INTO ReporteInformacion values (default, ?, ?, ?, ?, ?, ?, ?, ?, ?,default)";
			pst = con.prepareStatement(sql);
			pst.setString(1, r.getNombreResponsable());
			pst.setString(2, r.getFechaReporte());
			pst.setString(3, r.getFechaUltimaActualizacion());
			pst.setString(4, r.getContacto());
			pst.setString(5, r.getNumInternacional());
			pst.setString(6, r.getNumLocal());
			pst.setString(7, r.getDirInternacional());
			pst.setInt(8, r.getIdTipoInforme());
			pst.setInt(9, r.getIdUsuario());
			//Ejecutar PST
			rs = pst.executeUpdate();
		} catch(Exception e) {
			System.err.println("Error al registrar Reporte de Información: " + e.getMessage());
		} finally {
			MySQLConexion8.closeConexion(con);
		}
		return rs;
	}

	@Override
	public ArrayList<ReporteInformacion> listar() {
		ArrayList<ReporteInformacion> lista = null;
		//BD plantilla
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			con = MySQLConexion8.getConexion();
			String sql = "SELECT*FROM ReporteInformacion;";
			pst = con.prepareStatement(sql);
			//Ejecutar PST
			rs = pst.executeQuery();
			
			lista = new ArrayList<ReporteInformacion>();
			while(rs.next()) {
				ReporteInformacion r = new ReporteInformacion();
				r.setIdReporteInformacion(rs.getInt(1));
				r.setNombreResponsable(rs.getString(2));
				r.setFechaReporte(rs.getString(3));
				r.setFechaUltimaActualizacion(rs.getString(4));
				r.setContacto(rs.getString(5));
				r.setNumInternacional(rs.getString(6));
				r.setNumLocal(rs.getString(7));
				r.setDirInternacional(rs.getString(8));
				r.setIdTipoInforme(rs.getInt(9));
				r.setIdUsuario(rs.getInt(10));
				r.setEstado(rs.getString(11));
				
				lista.add(r);
			}
		} catch (Exception e) {
			System.err.println("Error al listar Reportes de Información: " + e.getMessage());
		} finally {
			MySQLConexion8.closeConexion(con);
		}
		return lista;
	}

	@Override
	public ReporteInformacion buscar(int idReporte) {
		ReporteInformacion ri = null;
		//BD plantilla
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			con = MySQLConexion8.getConexion();
			String sql = "SELECT * FROM ReporteInformacion WHERE IdReporteInformacion = ?;";
			pst = con.prepareStatement(sql);
			pst.setInt(1, idReporte);
			//Ejecutar PST
			rs = pst.executeQuery();
			
			while(rs.next()) {
				ri = new ReporteInformacion();
				ri.setIdReporteInformacion(rs.getInt(1));
				ri.setNombreResponsable(rs.getString(2));
				ri.setFechaReporte(rs.getString(3));
				ri.setFechaUltimaActualizacion(rs.getString(4));
				ri.setContacto(rs.getString(5));
				ri.setNumInternacional(rs.getString(6));
				ri.setNumLocal(rs.getString(7));
				ri.setDirInternacional(rs.getString(8));
				ri.setIdTipoInforme(rs.getInt(9));
				ri.setIdUsuario(rs.getInt(10));
				ri.setEstado(rs.getString(11));
			}
		} catch (Exception e) {
			System.err.println("Error al listar Reporte de Información por ID: " + e.getMessage());
		} finally {
			MySQLConexion8.closeConexion(con);
		}
		return ri;
	}

	@Override
	public ArrayList<ReporteInformacion> listadoxTipo(int tipoInforme) {
		ArrayList<ReporteInformacion> lista = null;
		//BD plantilla
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			con = MySQLConexion8.getConexion();
			String sql = "SELECT * FROM ReporteInformacion WHERE IdTipoInforme = ?;";
			pst = con.prepareStatement(sql);
			pst.setInt(1, tipoInforme);
			//Ejecutar PST
			rs = pst.executeQuery();
			
			lista = new ArrayList<ReporteInformacion>();
			while(rs.next()) {
				ReporteInformacion r = new ReporteInformacion();
				r.setIdReporteInformacion(rs.getInt(1));
				r.setNombreResponsable(rs.getString(2));
				r.setFechaReporte(rs.getString(3));
				r.setFechaUltimaActualizacion(rs.getString(4));
				r.setContacto(rs.getString(5));
				r.setNumInternacional(rs.getString(6));
				r.setNumLocal(rs.getString(7));
				r.setDirInternacional(rs.getString(8));
				r.setIdTipoInforme(rs.getInt(9));
				r.setIdUsuario(rs.getInt(10));
				lista.add(r);
			}
		} catch (Exception e) {
			System.err.println("Error al listar Reportes de Información: " + e.getMessage());
		} finally {
			MySQLConexion8.closeConexion(con);
		}
		return lista;
	}

	@Override
	public int actualizar(ReporteInformacion r) {
		int rs = 0;
		Connection con = null;
		PreparedStatement pst = null;
		try {
			con = MySQLConexion8.getConexion();
			String sql = "UPDATE ReporteInformacion SET NombreResponsable = ?, FechaReporte = ?, FechaUltimaActualizacion = ?, Contacto = ?, " + 
						"NumInternacional = ?, NumLocal = ?, DirInternacional = ?, IdTipoInforme = ?, IdUsuario = ?, estado=? WHERE IdReporteInformacion = ?";
			pst = con.prepareStatement(sql);
			pst.setString(1, r.getNombreResponsable());
			pst.setString(2, r.getFechaReporte());
			pst.setString(3, r.getFechaUltimaActualizacion());
			pst.setString(4, r.getContacto());
			pst.setString(5, r.getNumInternacional());
			pst.setString(6, r.getNumLocal());
			pst.setString(7, r.getDirInternacional());
			pst.setInt(8, r.getIdTipoInforme());
			pst.setInt(9, r.getIdUsuario());
			pst.setString(10, r.getEstado());
			pst.setInt(11, r.getIdReporteInformacion());
			
			rs = pst.executeUpdate();
			
			System.out.println("Update ejecutado");
			System.out.println("RS: " + rs);
		} catch (Exception e) {
			System.err.println("Error al Actualizar Reporte: " + e.getMessage());
		} finally {
			MySQLConexion8.closeConexion(con);
		}
		return rs;
	}

	@Override
	public int eliminar(ReporteInformacion r) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<TipoInforme> listadoDeTipos() {
		//Método para invocar los tipos de informes y colocarlos en el ComboBox
		ArrayList<TipoInforme> lista = null;
		//BD plantilla
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null; 
		try {
			con = MySQLConexion8.getConexion();
			String sql = "SELECT * FROM TipoInforme;";
			pst = con.prepareStatement(sql);

			//Ejecutar PST
			rs = pst.executeQuery();
			
			lista = new ArrayList<TipoInforme>();
			while(rs.next()) {
				TipoInforme ti = new TipoInforme();
				ti.setIdTipoInforme(rs.getInt(1));
				ti.setDescripcion(rs.getString(2));
				lista.add(ti);
			}
		} catch (Exception e) {
			System.err.println("Error al listar Tipos Reportes: " + e.getMessage());
		} finally {
			MySQLConexion8.closeConexion(con);
		}
		
		return lista;
	}

}
