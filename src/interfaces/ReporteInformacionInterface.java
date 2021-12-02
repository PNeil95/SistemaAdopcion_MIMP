package interfaces;

import java.util.ArrayList;

import model.ReporteInformacion;
import model.TipoInforme;

public interface ReporteInformacionInterface {
	//Crear Reporte de Informacion
	public int registrar(ReporteInformacion r);
	
	//Listar Reporte de Información
	public ArrayList<ReporteInformacion> listar();
	
	//Listar Reporte de Informacion por ID
	public ReporteInformacion buscar(int idReporte);
	
	//Listar Reporte de Informacion por tipo de informe
	public ArrayList<ReporteInformacion> listadoxTipo(int tipoInforme);
	
	//Actualizar Reporte de Informacion
	public int actualizar(ReporteInformacion r);
	
	//Eliminar Reporte de Informacion
	public int eliminar(ReporteInformacion r);
	
	//Listado de tipos de informe (para combobox)
	public ArrayList<TipoInforme> listadoDeTipos();
}
