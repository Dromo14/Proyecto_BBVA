package cl.kvz.bbva.ccp.core.dao.interfaces;

import java.util.Map;

import cl.kvz.bbva.ccp.core.model.Usuario;

/**
 * 
 * @author Américo Faúndez
 *
 */
public interface IUsuarioDao {

	public Map<String, Object> findById(Usuario usuario) throws Exception;
	public Map<String, Object> save(Usuario usuario);
	public Map<String, Object> delete(Usuario usuario);
	public Map<String, Object> update(Usuario usuario);
}
