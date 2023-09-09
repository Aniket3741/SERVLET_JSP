package tags;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;  

public class MyTagHandlers extends TagSupport{   
	
	public int doStartTag() throws JspException {  
   
      
    
    try {
		// task..tag
    	JspWriter out=pageContext.getOut(); //returns the instance of JspWriter 
		out.println("<h1>This is my custom tag from tag handler </h1>");
	}
    
	catch(Exception e) {
		e.printStackTrace();
	}
	
	return SKIP_BODY;
}
}  