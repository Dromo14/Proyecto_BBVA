package cl.kvz.bbva.ccp.web.servlet;

import java.io.IOException;
import java.net.URL;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

/**
 * Servlet implementation class InitApp
 */
@WebServlet("/InitApp")
public class InitApp extends HttpServlet {
	
	private transient static final Logger LOGGER = Logger.getLogger(InitApp.class);
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InitApp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		String archivoProperties = config.getInitParameter("log4j-file");
		this.configure(archivoProperties);
	}
	
    private void configure(String archivoProperties) 
    {
		try 
		{
			if(!archivoProperties.startsWith("/"))
			{
				
				ClassLoader loader = Thread.currentThread().getContextClassLoader();
				URL url = loader.getResource(archivoProperties);
				DOMConfigurator.configure(url);
				this.loggerTest();
				
			}
			else 
			{
				System.out.println("ELSEEEEE ");
				DOMConfigurator.configure(archivoProperties);
			}
			
			
		} 
		catch ( Exception exception ) 
		{
			LOGGER.error( "ERROR AL INICIALIZAR LA CONFIGURACION", exception );
			return;
		}
	}

    private void loggerTest()
    {
    	LOGGER.info("TEST LOG NIVEL INFO");
    	LOGGER.warn("TEST LOG NIVEL WARN");
    	LOGGER.error("TEST LOG NIVEL ERROR");
    }
    
    
	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
