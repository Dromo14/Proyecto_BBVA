package cl.kvz.bbva.ccp.web.service.resteasy;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;

import org.apache.log4j.Logger;
import org.jboss.resteasy.annotations.cache.NoCache;

import cl.kvz.bbva.ccp.core.model.ResultadoTransaccion;

/**
 * 
 * @author Américo Faúndez
 *
 */
@Path("/generapdf")
public class GeneraPDF {
	
	@Context 
	private HttpServletRequest httpRequest;	
	private transient static final Logger LOGGER = Logger.getLogger( GeneraPDF.class );
	
	@GET
	@Path("/unico")
	@Produces("application/json")
	@NoCache
	public String getPDF( )
	{	
		LOGGER.info("LLAMADO A SERVICIO REST UNICO ");
		ResultadoTransaccion rt = new ResultadoTransaccion();
		return rt.toString();
		
	}
	
}
