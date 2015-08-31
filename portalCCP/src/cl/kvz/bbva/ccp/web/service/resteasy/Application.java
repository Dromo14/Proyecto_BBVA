package cl.kvz.bbva.ccp.web.service.resteasy;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


/**
 * 
 * @author Américo Faúndez
 *
 */
public class Application extends javax.ws.rs.core.Application {
	
	private Set<Class<?>> classes = new HashSet<Class<?>>();
	 
	public Application() 
	{
		classes.add( UsuarioRest.class );
		classes.add( GeneraPDF.class );
	}
 
	@Override
	public Set<Class<?>> getClasses() 
	{
		return classes;
	}
 
	@SuppressWarnings("unchecked")
	@Override
	public Set<Object> getSingletons() 
	{
		return Collections.EMPTY_SET;
	}

}
