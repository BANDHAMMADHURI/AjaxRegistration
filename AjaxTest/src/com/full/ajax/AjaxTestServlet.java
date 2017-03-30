package com.full.ajax;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AjaxTestServlet extends HttpServlet {
 

protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
 
response.setContentType("text/html;charset=UTF-8");
PrintWriter out = response.getWriter();
 

out.println("Registered Succesfully");
out.println("your detals are");
String name,sex;
int age;
name=request.getParameter("name");
age=Integer.parseInt(request.getParameter("age"));
sex=request.getParameter("sex");
out.println(" Name :"+name);
out.println("Age :"+age);
out.println("Sex : "+sex);
 
}
}