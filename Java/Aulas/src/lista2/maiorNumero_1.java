package lista2;

import java.util.Scanner;

public class maiorNumero_1 {

	public static void main(String[] args) {
		
		/*
		 * 1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		 */

		Scanner leia = new Scanner(System.in);
		
		int x,y,maior;
		
		System.out.print("\nDigite o valor do numero 1: ");
		x=leia.nextInt();
		System.out.print("\nDigite o valor do numero 2: ");
		y=leia.nextInt();
		
		if(x>y)
		{
			maior =x;
		}
		else
		{
			maior = y;
		}
		
			System.out.println("O numero maior eh: "+maior);
	}

}
