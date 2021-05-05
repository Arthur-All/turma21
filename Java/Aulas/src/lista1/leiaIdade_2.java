package lista1;

import java.util.Scanner;

public class leiaIdade_2 {

	public static void main(String[] args) 
	{
		
		
		/*
		 * 2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
				expressa em anos, meses e dias.
		 */
		
		Scanner leia = new Scanner(System.in);
		int quantosDias,mes,dia,anos;
		
		System.out.println("\nQuantos Dias de vida você tem? ");
		quantosDias = leia.nextInt();
		
		anos = (quantosDias/365);
		mes = ((quantosDias%365)/30);
		dia = ((quantosDias%365)%30);
		
		System.out.print("\nAnos(S): "+anos);
		System.out.print("\nMes(eS): "+mes);
		System.out.print("\nDia(S): "+dia);
	}

}
