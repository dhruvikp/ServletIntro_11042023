package com.simplilearn.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetHandlerServlet
 */
@WebServlet("/getHandler")
public class GetHandlerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetHandlerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		String name = request.getParameter("name");
		
		PrintWriter pw = response.getWriter();
		pw.println("<html><body>");
		pw.println("This GET request served from servlet");
		pw.println("<p> Hello "+name);
		System.out.println("TEST...");
		pw.println("</body></html>");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		
		PrintWriter pw = response.getWriter();
		pw.println("<html><body>");
		pw.println("This POST request served from servlet");
		pw.println("<p> Name is :"+name);
		pw.println("<p> Address is :"+address);
		
		pw.println("</body></html>");
	}

}
