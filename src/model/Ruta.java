package model;

public class Ruta {
	private int idRuta;
	private String descripcion;
	
	//Método toString() de la clase Ruta
	@Override
	public String toString() {
		return "Ruta [idRuta=" + idRuta + ", descripcion=" + descripcion + "]";
	}
	
	//Getters y Setters de la clase Ruta
	public int getIdRuta() {
		return idRuta;
	}
	public void setIdRuta(int idRuta) {
		this.idRuta = idRuta;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
