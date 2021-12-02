package dao;

import interfaces.CargoInterface;
import interfaces.ReporteInformacionInterface;
import interfaces.RutaInterface;
import interfaces.TipoInformeInterface;
import interfaces.UsuarioInterface;

//Clase que fabrica las implementaciones
public abstract class DAOFactory {
	//Constantes de las BD que se pueden utilizar
	public static final int MYSQL = 1;
	public static final int SQL = 2;
	
	//Acceso a las Interfaces
	public abstract CargoInterface getCargoDAO();
	public abstract ReporteInformacionInterface getReporteInformacionDAO();
	public abstract RutaInterface getRutaDAO();
	public abstract TipoInformeInterface getTipoInformeDAO();
	public abstract UsuarioInterface getUsuarioDAO();
	
	//Instancia de la fábrica -> Según BD
	public static DAOFactory getDAOFactory(int qBD){
		switch(qBD){
			case MYSQL: 
				return new MySQLDAOFactory();
			case SQL:
				return new SQLDAOFactory();
			default: 
				return null;
		}
	}
	
}

