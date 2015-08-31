package cl.kvz.bbva.ccp.core.dao;

import java.util.HashMap;
import java.util.Map;

import cl.kvz.bbva.ccp.core.dao.interfaces.IUsuarioDao;
import cl.kvz.bbva.ccp.core.model.Usuario;

public class UsuarioDao implements IUsuarioDao {

	@Override
	public Map<String, Object> findById(Usuario usuario) throws Exception {
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("e_user", usuario.getUsuario());
		map.put("e_pass", usuario.getPass());
		try {
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw e;
		}
		
		return map;
	}

	@Override
	public Map<String, Object> save(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> delete(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> update(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}


}
