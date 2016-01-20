package com.csc.Login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javafx.stage.Stage;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

/**
 * Servlet implementation class LoginPage
 */
@WebServlet("/LoginPage")
public class LoginPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
     ServletContext myStage; 
     
    public LoginPage() {
    	super();
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		LoginConnect lc= new LoginConnect();
		PrintWriter pw= response.getWriter();
		String n=request.getParameter("username");
		String p=request.getParameter("password");
		//HttpSession session=request.getSession(false);
		boolean lb=lc.validate(n, p);
		/*if(session!=null)
			session.setAttribute("name", n);*/
		
		if(lb){
			//RequestDispatcher rd=request.getRequestDispatcher("Balle Balle");
			//rd.forward(request, response);
			pw.print("<p style=\"color:green\">Your are successfully logged in</p>");
			//session.setAttribute("userid", n);
			
		}
		else{
			pw.print("<p style=\"color:red\">Sorry username or password error</p>");
			//RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			//rd.include(request, response);
		}
		
	}

}
