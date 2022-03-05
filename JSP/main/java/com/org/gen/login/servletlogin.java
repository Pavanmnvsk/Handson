package com.org.gen.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servletlogin
 */
@WebServlet("/servletlogin")
public class servletlogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String name= request.getParameter("n");
		String password=request.getParameter("p");
		int age=Integer.parseInt(password);
		pw.println("User Name: "+name);
		pw.println("<br>");
		if(age>30)
		{
		pw.println("Age:" +password);
		}
		pw.close();
	}

}
