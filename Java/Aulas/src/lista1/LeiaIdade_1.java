package lista1;

import java.util.Scanner;

public class LeiaIdade_1 {

	public static void main(String[] args) 
	{
		
		Scanner leia = new Scanner(System.in);
		
		/*
		 * 1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
			dias e mostre-a expressa apenas em dias.
		 */
		
		
		int diasVida,mes,dia,anos;
		
		System.out.print("\nEm qual Ano você nasceu? ");
		anos = leia.nextInt();
		
		System.out.print("\nEm qual Mes você nasceu? ");
		mes = leia.nextInt();
		
		System.out.print("\nEm qual Dia você nasceu? ");
		dia = leia.nextInt();
		
		diasVida = ((anos*365)+(mes*30)+(dia*1));
		
		System.out.println("\nParabens voce tem: "+diasVida+" dias de vida.");

	}

}
