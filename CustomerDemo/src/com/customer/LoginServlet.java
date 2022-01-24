package com.customer;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	String username = request.getParameter("uid");
    	String password = request.getParameter("pass");
    	
    	PrintWriter p = response.getWriter();
		response.setContentType("text/html");
    	
    	
    	try {
    	      List<Customer> cusDetails = CustomerDBUtil.validate(username, password);
    	      request.setAttribute("cusDetails", cusDetails);
    	      
    	      if(cusDetails!=null) {
    	    	  
    	    	  RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
    	     	 dis.forward(request, response);
    	     	 
    	      }else {
    	    	p.println("<script type = 'text/javascript'>");
    			p.println("alert('Invalid login')");
    			p.println("loaction = 'login.jsp'");
    			p.println("</script>");
    	      }
    	      
    	 }
    	catch (Exception e) {
    		e.printStackTrace();
    	}
    	 
		
	}

}
