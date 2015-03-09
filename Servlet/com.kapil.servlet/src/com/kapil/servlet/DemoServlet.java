package com.kapil.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * This class demonstrates a sample example of Http Servlet 
 * @author kapil
 *
 */
public class DemoServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * initializing Servlet
	 */
	public void init() throws ServletException {
		
		// Servlet initialization code
		super.init();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// set the response content type of servlet
		response.setContentType("text/html");
		
		PrintWriter outln = response.getWriter();
		outln.println("<hi> hello Kapil !! </h1>");
	}
	
	public void destroy() {
		
		// resource releasing
		super.destroy();
	}

}
