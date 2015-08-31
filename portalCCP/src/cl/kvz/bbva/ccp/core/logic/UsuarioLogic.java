package cl.kvz.bbva.ccp.core.logic;

import java.util.Map;

import cl.kvz.bbva.ccp.core.dao.interfaces.IUsuarioDao;
import cl.kvz.bbva.ccp.core.model.Usuario;
/**
 * 
 * @author Américo Faúndez
 *
 */
public class UsuarioLogic {

	private IUsuarioDao usuarioDao;
	
	public void auntenticarUsuario(Usuario usuario) throws Exception
	{
		Map<String, Object> map = this.usuarioDao.findById(usuario);
		usuario.setIdUsuario( map.get("idUsuario").toString() );
		usuario.setEmail( map.get("email").toString() );
		usuario.setPerfil(map.get("perfil").toString());
	}

	public void setUsuarioDao(IUsuarioDao usuarioDao) {
		this.usuarioDao = usuarioDao;
	}
}
