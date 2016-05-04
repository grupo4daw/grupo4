/**
 * 
 * @author SALVADOR ZAPATA CASALES
 * 
 * DATE : 28/04/2016 - 17:15
 *
 */

import java.util.Scanner;


public class ej4 {
	
	private Scanner teclado;
	
     private int [] vec;
     
     
     public void cargar (){
    	 
    	 teclado = new Scanner(System.in);
    	 
    	 vec = new int [10];
    	 
    	 for (int i = 0;i<10;i++){
    		 
    		 System.out.println("Dime un valor");
    		 
    		 vec[i] = teclado.nextInt();
    		 
    	 }
    	 
    	 
    	 
     }
	
	  public void ordenar(){
		  
		  int orden =1;
		  
		  for (int i = 0; i<9; i++){
			  
			if ( vec[i] > vec[i+1]){
				
				orden =0 ;
			}
			
			  
			}
		  if (orden == 1){
				
				System.out.println("Esta ordenado");
				
			}
			else{ System.out.println("No esta ordenado");
		 
	    }
			
		  
		  
	  }
	
	
	
	public static void main ( String [] args){
		
		ej4 mein = new ej4();
		
		mein.cargar();
		mein.ordenar();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
