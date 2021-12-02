package dao;

import interfaces.CargoInterface;
import interfaces.ReporteInformacionInterface;
import interfaces.RutaInterface;
import interfaces.TipoInformeInterface;
import interfaces.UsuarioInterface;
import mantenimientos.GestionReporteInformacionMySQL;
import mantenimientos.GestionTipoInformeMySQL;
import mantenimientos.GestionUsuarioMySQL;

public class MySQLDAOFactory extends DAOFactory {

	@Override
	public CargoInterface getCargoDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReporteInformacionInterface getReporteInformacionDAO() {
		// TODO Auto-generated method stub
		return new GestionReporteInformacionMySQL();
	}

	@Override
	public RutaInterface getRutaDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoInformeInterface getTipoInformeDAO() {
		// TODO Auto-generated method stub
		return new GestionTipoInformeMySQL();
	}

	@Override
	public UsuarioInterface getUsuarioDAO() {
		// TODO Auto-generated method stub
		return new GestionUsuarioMySQL();
	}
}
