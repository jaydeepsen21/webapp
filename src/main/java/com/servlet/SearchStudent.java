package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.js.entity.Student;
import com.js.service.StudentService;

public class SearchStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		PrintWriter p=response.getWriter();
		
		String t1=request.getParameter("t1");
		int id=Integer.parseInt(t1);
	
		StudentService service=new StudentService();
		Student student=service.findById(id);
		
		 
		request.setAttribute("student", student);
		RequestDispatcher rd=request.getRequestDispatcher("Detail.jsp");
	  rd.forward(request,response);
	  
	  
	  
	
	}
}