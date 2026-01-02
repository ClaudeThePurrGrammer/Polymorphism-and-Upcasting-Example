package Esempi_Polimorfismo;

import java.util.Random;

public class Dado {
	
	int[] Facce ;
	static int dim = 0 ; 
	
	public Dado(int type) 
	{
		
		try
		{
			switch(type)
			{
				case 1 : 
						dim = 6 ;
						break ; 
						
				case 2 : 
						dim = 12 ; 
						break ; 
			}
			
			 Facce = new int[dim] ;
				for(int i = 0 ; i < 6 ; i++)
					Facce[i] = i+1;
		}
		catch(Exception e )
		{
			System.out.println("Errore Impossibile Completare"); 
			
		}
	}
	
	
	String Lancio()
	{
		Random result = new Random() ; 
		return ConvertToString(result.nextInt(Dado.dim));
	}


	 String ConvertToString(int nextInt) {
		String number = new String() ; 
		switch(nextInt)
		{
			case 1 : number = "Uno" ; break;
			case 2 : number = "Due" ; break;
			case 3 : number = "Tre" ; break;
			case 4 : number = "Quattro" ; break;
			case 5 : number = "Cinque" ; break;
			case 6 : number = "Sei" ; break;
			case 7 : number = "Sette" ; break;
			case 8 : number = "Otto" ; break;
			case 9 : number = "Nove" ; break;
			case 10: number = "Dieci" ; break;
			case 11: number = "Undici" ; break;
			case 12: number = "Dodici" ; break;
			
		
		}
		return number;
	 }
}
