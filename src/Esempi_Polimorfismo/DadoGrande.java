package Esempi_Polimorfismo;

import java.util.Random;

public class DadoGrande extends Dado 
{

	public DadoGrande(int type) {
		super(type);
		dim = 18 ; 
		Facce = new int[dim];
		for(int i = 0 ; i < dim ; i++)
			Facce[i] = i+1 ; 
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
			case 13: number = "Tredici" ; break;
			case 14: number = "Quattordici" ; break;
			case 15: number = "Quindici" ; break;
			case 16: number = "Sedici" ; break;
			case 17: number = "Diciassette" ; break;
			case 18: number = "Diciotto" ; break;
		}
		return number;
	}
	
}
