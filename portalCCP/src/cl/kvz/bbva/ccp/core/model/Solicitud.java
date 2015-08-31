package cl.kvz.bbva.ccp.core.model;

import java.io.Serializable;
import java.util.Date;
/**
 * 
 * @author Américo Faúndez
 *
 */
public class Solicitud implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String rut;
	private Date fechaAprobacion;
	private String nombres;
	private String apellidos;
	private String llave;
	
	public Solicitud(){
	}
	
	public Solicitud(String rut, Date fechaAprobacion, String nombres,
			String apellidos) {
		super();
		this.rut = rut;
		this.fechaAprobacion = fechaAprobacion;
		this.nombres = nombres;
		this.apellidos = apellidos;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public Date getFechaAprobacion() {
		return fechaAprobacion;
	}

	public void setFechaAprobacion(Date fechaAprobacion) {
		this.fechaAprobacion = fechaAprobacion;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getLlave() {
		return llave;
	}

	public void setLlave(String llave) {
		this.llave = llave;
	}
	

}
