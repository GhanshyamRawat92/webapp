package org.test.servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/helloServlet")
public class HelloServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			System.out.println("fuck off");
		String name = req.getParameter("yourName");
		PrintWriter writer = resp.getWriter();
		writer.println("<h1>Hello " + name + "</h1>");
		writer.close();
		} catch (Exception ex){
			ex.printStackTrace();
		}
	}

}
