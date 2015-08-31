package cl.kvz.bbva.ccp.core.model;

import java.io.Serializable;


/**
 * 
 * @author Américo Faúndez
 *
 */
public class Usuario implements Serializable {
	
	private static final long serialVersionUID = -7371882115197681070L;

	private String idUsuario;
	private String usuario;
	private String pass;
	private String ip;
	private String email;
	private String perfil;
	
	
	
	/**
	 * 
	 */
	public Usuario()
	{
		this.idUsuario = "";
		this.usuario = "";
		this.pass = "";
		this.ip = "";
		this.email = "";
		this.perfil = "";
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
}
