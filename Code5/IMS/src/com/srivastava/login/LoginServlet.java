package com.srivastava.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.srivastava.db.DB;
import com.srivastava.dto.MasterDTO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	private String doCombo() throws ClassNotFoundException, SQLException{
		String design = "<select>";
	DB db = new DB();
	String li= "";
	ArrayList<MasterDTO> masterList = db.getRoles();
	for(MasterDTO masterDTO : masterList){
		System.out.println("Inside Loop "+masterDTO.getName());
		li += "<option>"+masterDTO.getName()+"</option>";
	}
	design = design + li +"</select>";
   
	return design;


	}
	private String doDesign(boolean ...flag){
		String design = "";
		String message = "";
		if(flag!=null && flag.length>0){
			if(flag[0]==true){
				message = "Invalid Userid or Password";
			}
		}
		try{
		 design = "<!DOCTYPE html><html lang='en'><head>"
				+ "<meta charset='utf-8'><meta http-equiv='X-UA-Compatible' "
				+ "content='IE=edge'><meta name='viewport' "
				+ "content='width=device-width, initial-scale=1'>"
				+ "<meta name='description' content=''>"
				+ "<meta name='author' content=''>"
				+ "<link rel='icon' href='../../favicon.ico'><title>"
				+ "Signin Template for Bootstrap</title><link"
				+ " href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css' "
				+ "rel='stylesheet'><link href='css/signin.css' rel='stylesheet'>"
				+" <script src=https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js></script> "
				+ "</head><body><div class='container'>"
				+" <h1> "+message +"</h1>"
				+ "<form action='login' method='post'  class='form-signin'><h2 class='form-signin-heading'>"
				+ "Please sign in</h2><label for='inputEmail' class='sr-only'>"
				+ "Email address</label><input name='email' type='email' id='inputEmail' class='form-control' placeholder='Email address' required autofocus>"
				+ "<label for='inputPassword' class='sr-only'>Password</label>"
				+ "<input type='password' name='pwd' id='inputPassword' class='form-control' placeholder='Password' required>"
				+ "<label for='role' class='sr-only'>Choose Your Role</label>"+this.doCombo()
				+ "<button class='btn btn-lg btn-primary btn-block' type='submit'>Sign in</button></form></div></body></html>";
		}
		catch(Exception ee){
			System.out.println("Problem in Design "+ee);
		}
		return design;
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println(this.doDesign());
		out.close();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userid = request.getParameter("email");
		String password =request.getParameter("pwd");
		
		if(userid.equals(password)){
			response.sendRedirect("welcome");
		}
		else
		{
			PrintWriter out=response.getWriter();
			out.println(this.doDesign(true));
		}
	}

}
