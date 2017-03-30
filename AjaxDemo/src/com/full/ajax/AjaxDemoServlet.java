package com.full.ajax;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class AjaxDemoServlet extends HttpServlet { 
	PrintWriter out;
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/application/json");
		String json = req.getParameter("stringParameter");
		out=resp.getWriter();
		out.println("Registered Successfully");
		out.println("Your details are\n");
		out.println(json);
		}
}
