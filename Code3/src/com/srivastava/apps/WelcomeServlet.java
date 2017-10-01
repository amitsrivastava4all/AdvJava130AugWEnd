package com.srivastava.apps;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
	int counter;
	
	
	public void init(){
		counter = 1;
		System.out.println("Call First Time Only "+counter);
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException , IOException{
		PrintWriter out = res.getWriter();
		Date date = new Date();
		out.println("<html><body>");
		out.println("<h1>Hello Servlet "+counter + "&nbsp;&nbsp;"+date+"</h1>");
		out.println("</body></html>");
		counter++;
		out.close();
	}
}
