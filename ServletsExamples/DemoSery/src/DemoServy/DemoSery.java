package DemoServy;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DemoSery extends HttpServlet {
		public void doGet(HttpServletRequest req,HttpServletResponse res)  
		throws ServletException,IOException  
		{  
		res.setContentType("text/html");  
		PrintWriter pw=res.getWriter();  
		  
		String name=req.getParameter("name");//will return value  
		pw.println("Welcome "+name);  
		  
		pw.close();  
		}
		
}  



