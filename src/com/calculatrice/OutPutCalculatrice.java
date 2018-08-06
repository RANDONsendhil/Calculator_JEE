package com.calculatrice;

public class OutPutCalculatrice {
 
	double resultat;
	
	public OutPutCalculatrice(){
		
	}
	
	public String  calculer(double x, double y, String operateur ){
		String outPut = " ";
		switch(operateur){
		case "+": resultat = x+y;break;
		case "-": resultat = x-y;break;
		case "*": resultat = x*y;break;
		case "/": resultat = x/y;break;
		}
		 
		return outPut+"VOICI LE RESULTAT :  "+x +" "+operateur+" "+y+" = "+ resultat;
	}

	 

}

 
