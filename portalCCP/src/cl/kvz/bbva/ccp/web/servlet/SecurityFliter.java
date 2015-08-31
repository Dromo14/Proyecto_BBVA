package cl.kvz.bbva.ccp.web.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cl.kvz.bbva.ccp.util.Constants;

/**
 * Servlet Filter implementation class SecurityFliter
 * @author Américo Faúndez
 */
@WebFilter("/SecurityFliter")
public class SecurityFliter implements Filter {

    /**
     * Default constructor. 
     */
    public SecurityFliter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest requestObject =  (HttpServletRequest) request;
		HttpServletResponse responseObject = (HttpServletResponse) response;
		HttpSession session = requestObject.getSession();
		
		if( session.getAttribute( Constants.SESSION_USER ) != null && 
				requestObject.getRequestURI().contains("login"))
		{
			chain.doFilter( request, response );
		}
		else
		{
			responseObject.sendRedirect( requestObject.getContextPath() + "/index.html" );
		}		
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
