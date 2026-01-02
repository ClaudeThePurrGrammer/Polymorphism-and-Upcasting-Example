package Esempi_Polimorfismo;
import java.util.Scanner;

public class Es_Polimorfismo {
	
	public static void main(String[] args)
	{
		Dado d = new Dado(Choice());
		System.out.println("Lancio Del Dado");
		System.out.printf("Esito : %s \n" , Gioco.Azione(d));
		
		DadoGrande dg = new DadoGrande(0);
		System.out.println("Lancio Del Dado Grande");
		System.out.printf("Esito : %s \n" , Gioco.Azione(dg));
		
	}

	private static int Choice() 
	{
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Scegli il Dado : ");
		System.out.println("1) Sei Facce");
		System.out.println("2) Dodici Facce");
		System.out.printf("Input: ");
		int choice = tastiera.nextInt();
		tastiera.close();
		return choice;
	}
	
	
	

}
