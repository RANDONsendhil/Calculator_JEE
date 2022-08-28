package myApp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.calculatrice.OutPutCalculatrice;
/**Added to Git */
@WebServlet("/TPOpenClassR")
public class ServletCal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ServletCal() {
        super();
        
    }

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/calculatrice.jsp").forward(request, response);
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
		 OutPutCalculatrice cal = new OutPutCalculatrice();
		 
		 	String operateur = request.getParameter("Operator");
			String x = request.getParameter("x");
			String y = request.getParameter("y");
			
			request.setAttribute("Operator", operateur);
			request.setAttribute("x", x);
			request.setAttribute("y", y);
			
			if(x.equals("")){
				
				String xErreur = " ";
				 request.setAttribute("xErreur", xErreur);	
				
			}if(y.equals("")){
				
				String yErreur = " ";
				 request.setAttribute("yErreur", yErreur);	
				
			}else{
			
			//	
			 try{
				 
				 double valeurX = Double.parseDouble(x);
				 double Valeury = Double.parseDouble(y);
				  
				String envoiReponse =  cal.calculer(valeurX,Valeury,operateur);
				  
				request.setAttribute("envoiReponse", envoiReponse);
			  
				 }catch(NumberFormatException e){
					 String nFE = " ";
					 request.setAttribute("e", nFE); 
					 	 
				 } 
							}
			this.getServletContext().getRequestDispatcher("/WEB-INF/calculatrice.jsp").forward(request, response);
		 
		
		 
		
	}

}
