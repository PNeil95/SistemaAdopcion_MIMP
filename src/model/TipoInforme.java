package model;

public class TipoInforme {
	private int idTipoInforme;
	private String descripcion;
	
	
	
	
	
	//Método toString() de la clase TipoInforme
	@Override
	public String toString() {
		return "TipoInforme [idTipoInforme=" + idTipoInforme + ", descripcion=" + descripcion + "]";
	}

	//Getters y Setters de la clase TipoInforme
	public int getIdTipoInforme() {
		return idTipoInforme;
	}


	public void setIdTipoInforme(int idTipoInforme) {
		this.idTipoInforme = idTipoInforme;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
