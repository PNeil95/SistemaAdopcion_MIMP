package model;

public class ReporteInformacion {
	private int idReporteInformacion;
	private String nombreResponsable;
	private String fechaReporte;
	private String fechaUltimaActualizacion;
	private String contacto;
	private String numInternacional;
	private String numLocal;
	private String dirInternacional;
	private int idTipoInforme;
	private int idUsuario;
	private String Estado;
	
	
	
	
	
	public ReporteInformacion(int idReporteInformacion, String nombreResponsable, String fechaReporte,
			String fechaUltimaActualizacion, String contacto, String numInternacional, String numLocal,
			String dirInternacional, int idTipoInforme, int idUsuario, String estado) {
		super();
		this.idReporteInformacion = idReporteInformacion;
		this.nombreResponsable = nombreResponsable;
		this.fechaReporte = fechaReporte;
		this.fechaUltimaActualizacion = fechaUltimaActualizacion;
		this.contacto = contacto;
		this.numInternacional = numInternacional;
		this.numLocal = numLocal;
		this.dirInternacional = dirInternacional;
		this.idTipoInforme = idTipoInforme;
		this.idUsuario = idUsuario;
		Estado = estado;
	}




	public String getEstado() {
		return Estado;
	}




	public void setEstado(String estado) {
		Estado = estado;
	}




	
	
	
	

	public ReporteInformacion(String nombreResponsable, String fechaReporte, String fechaUltimaActualizacion,
			String contacto, String numInternacional, String numLocal, String dirInternacional, int idTipoInforme, 
			int idUsuario) {
	
		this.nombreResponsable = nombreResponsable;
		this.fechaReporte = fechaReporte;
		this.fechaUltimaActualizacion = fechaUltimaActualizacion;
		this.contacto = contacto;
		this.numInternacional = numInternacional;
		this.numLocal = numLocal;
		this.dirInternacional = dirInternacional;
		this.idTipoInforme = idTipoInforme;
		this.idUsuario = idUsuario;
		
	}

	public ReporteInformacion() {

	}

	//Método toString() de la clase Reporte Información
	@Override
	public String toString() {
		return "ReporteInformacion [idReporteInformacion=" + idReporteInformacion + ", nombreResponsable="
				+ nombreResponsable + ", fechaReporte=" + fechaReporte + ", fechaUltimaActualizacion="
				+ fechaUltimaActualizacion + ", contacto=" + contacto + ", correo=" +  ", numInternacional="
				+ numInternacional + ", numLocal=" + numLocal + ", dirInternacional=" + dirInternacional
				+ ", idTipoInforme=" + idTipoInforme + ", idUsuario=" + idUsuario + "]";
	}
	
	//Getters y Setters de la clase Reporte Información
	public int getIdReporteInformacion() {
		return idReporteInformacion;
	}
	public void setIdReporteInformacion(int idReporteInformacion) {
		this.idReporteInformacion = idReporteInformacion;
	}
	public String getNombreResponsable() {
		return nombreResponsable;
	}
	public void setNombreResponsable(String nombreResponsable) {
		this.nombreResponsable = nombreResponsable;
	}
	public String getFechaReporte() {
		return fechaReporte;
	}
	public void setFechaReporte(String fechaReporte) {
		this.fechaReporte = fechaReporte;
	}
	public String getFechaUltimaActualizacion() {
		return fechaUltimaActualizacion;
	}
	public void setFechaUltimaActualizacion(String fechaUltimaActualizacion) {
		this.fechaUltimaActualizacion = fechaUltimaActualizacion;
	}
	public String getContacto() {
		return contacto;
	}
	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public String getNumInternacional() {
		return numInternacional;
	}
	public void setNumInternacional(String numInternacional) {
		this.numInternacional = numInternacional;
	}
	public String getNumLocal() {
		return numLocal;
	}
	public void setNumLocal(String numLocal) {
		this.numLocal = numLocal;
	}
	public String getDirInternacional() {
		return dirInternacional;
	}
	public void setDirInternacional(String dirInternacional) {
		this.dirInternacional = dirInternacional;
	}
	public int getIdTipoInforme() {
		return idTipoInforme;
	}
	public void setIdTipoInforme(int idTipoInforme) {
		this.idTipoInforme = idTipoInforme;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	
}
