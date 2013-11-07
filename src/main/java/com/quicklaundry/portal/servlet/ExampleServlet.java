package com.quicklaundry.portal.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExampleServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
			String email = request.getParameter("email");
			System.out.print(email);
//			response.sendRedirect("/pages/signupComplete.xhtml");
	}

}
