package cl.kvz.bbva.ccp.core.facade;

import cl.kvz.bbva.ccp.core.logic.UsuarioLogic;
import cl.kvz.bbva.ccp.core.model.Usuario;

/**
 * 
 * @author Américo Faúndez
 *
 */
public class UsuarioFacade {

	private UsuarioLogic usuarioLogic;
	
	public void auntenticarUsuario(Usuario usuario) throws Exception
	{
		this.usuarioLogic.auntenticarUsuario(usuario);
	}

	public void setUsuarioLogic(UsuarioLogic usuarioLogic) {
		this.usuarioLogic = usuarioLogic;
	}


}
