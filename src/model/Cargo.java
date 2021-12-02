package model;

public class Cargo {
	private int idCargo;
	private String descripcion;
	
	//Método toString() de la clase Cargo
	@Override
	public String toString() {
		return "Cargo [idCargo=" + idCargo + ", descripcion=" + descripcion + "]";
	}
	
	//Getters y Setters de la clase Cargo
	public int getIdCargo() {
		return idCargo;
	}
	public void setIdCargo(int idCargo) {
		this.idCargo = idCargo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
