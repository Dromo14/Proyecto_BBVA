package cl.kvz.bbva.ccp.web.service.resteasy;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;

import org.apache.log4j.Logger;
import org.jboss.resteasy.annotations.cache.NoCache;

import cl.kvz.bbva.ccp.core.facade.UsuarioFacade;
import cl.kvz.bbva.ccp.core.model.ResultadoTransaccion;
import cl.kvz.bbva.ccp.core.model.Usuario;
import cl.kvz.bbva.ccp.util.Constants;



/**
 * 
 * @author Américo Faúndez
 *
 */
@Path("/usuario")
public class UsuarioRest {

	@Context 
	private HttpServletRequest httpRequest;	
	private transient static final Logger LOGGER = Logger.getLogger( UsuarioRest.class );
	private UsuarioFacade usuarioFacade;
	
	@POST
	@Path("/login")
	@Produces("application/json")
	@NoCache
	public String getLogin( @FormParam("user") String user, 
			   				@FormParam("pass") String pass )
	{	
		ResultadoTransaccion rt = new ResultadoTransaccion();
		Usuario usuario = new Usuario();
		usuario.setUsuario(user);
		usuario.setPass(pass);
		LOGGER.info("USER : " + usuario.getUsuario() + "  {test LOGGER}");
		try {
			usuarioFacade.auntenticarUsuario(usuario);
			httpRequest.getSession().setAttribute(Constants.SESSION_USER, usuario);

			rt.setCodigoResultado(Constants.CODIGOSUCCES);
			rt.setMensaje(Constants.RETURN_SUCCESS);
		} catch (Exception e) {
			rt.setCodigoResultado(Constants.COD_ERR_LOGIN);
			rt.setMensaje(Constants.RETURN_MSJ_ERR_LOGIN);
		}
		
		return rt.toString();
		
	}
	
	@POST
	@Path("/logout")
	@Produces("application/json")
	@NoCache
	public String getLogout()
	{	
		ResultadoTransaccion rt = new ResultadoTransaccion();
		httpRequest.getSession().invalidate();
		rt.setCodigoResultado(Constants.CODIGOSUCCES);
		rt.setMensaje(Constants.RETURN_SUCCESS);
		
		return rt.toString();
		
	}	
	
}
