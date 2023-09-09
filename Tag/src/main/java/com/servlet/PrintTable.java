package com.servlet;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

@WebServlet("/PrintTable")
public class PrintTable extends TagSupport
{
	public int number;
	// setter
	
	public void setNumber(int number) {
		this.number=number;
	}
	
	@Override
	public int doStringTag() throws JspException{
		
		try {
			JspWriter out = pageContext.getOut();
			
			// print Table
			out.print("<br>");
			for(int i =0; i<=10; i++) {
				out.println((i*number)+"<br>");
			}
		}catch(Exception e){
			return SKIP_BODY;
		}
	}
}
