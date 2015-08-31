package cl.kvz.bbva.ccp.core.model;

import java.io.Serializable;

public class ResultadoTransaccion implements Serializable {

	private static final long serialVersionUID = 5236162938225701630L;
	private String codigoResultado;
	private String mensaje;
	private String redirect;

	
	/**
	 * 
	 */
	public ResultadoTransaccion()
	{
		this.codigoResultado = "" ;
		this.mensaje = "" ;
		this.redirect = "" ;
	}
	
	/**
	 * @param codigoResultado
	 * @param mensaje
	 * @param redirect
	 */
	public ResultadoTransaccion(String codigoResultado, String mensaje, String redirect) 
	{
		super();
		this.codigoResultado = codigoResultado;
		this.mensaje = mensaje;
		this.redirect = redirect;
	}

	public String getCodigoResultado() {
		return codigoResultado;
	}

	public void setCodigoResultado(String codigoResultado) {
		this.codigoResultado = codigoResultado;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getRedirect() {
		return redirect;
	}

	public void setRedirect(String redirect) {
		this.redirect = redirect;
	}


	
}
