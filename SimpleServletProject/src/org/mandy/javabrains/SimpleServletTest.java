package org.mandy.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleServletTest
 */
@WebServlet(description = "First servlet program", urlPatterns = { "/SimpleServletTestURL" })
public class SimpleServletTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello from doGet method of Servlet !");
		PrintWriter out = response.getWriter();
		out.print("<b3>Hello " + request.getParameter("userName") + " </b3>");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello from doPost method of Servlet !");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		out.print("<b3>Hello " + userName + " </b3>");
		String surName = request.getParameter("surName");
		out.print("<br>Your full name is  " + userName + " " +surName);
		String profession = request.getParameter("profession");
		out.print("<br>You are a  " + profession + " by profession");
		
		String[] workingLocation = request.getParameterValues("workingLocation");
		String totalWorkLocations = "";
		for(String workLoc : workingLocation)
			totalWorkLocations += " " + workLoc;
		out.print("<br>You were working  in " + totalWorkLocations);
		
	}
}