package lista2;

import java.util.Scanner;

public class IdadeCategoria_3 {

	public static void main(String[] args) {
		
		/*
		 * 3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
		categoria ela se encontra:
									10-14 infantil
 									15-17 juvenil
 									18-25 adulto
		 * 
		 * 
		 * 
		 */

		Scanner leia = new Scanner(System.in);
		int  categoria; //infantil,juvenil,adulto;
		
		System.out.print("\nEscreva a sua idade: ");
		categoria=leia.nextInt();
		
		if(categoria>=10&&categoria<=14)
		{
			System.out.print("\nCategoria Infantil.");
		}
		else if(categoria>=15&&categoria<=17)
		{
			System.out.print("\nCategoria juvenil.");
		}
		else if(categoria>=18&&categoria<=25)
		{
			System.out.print("\nCategoria adulto.");
		}
		else if(categoria<=9||categoria>=26)
		{
			System.out.print("\nCategoria não encontrada.");
		}
		
		
		

	}

}
