package lista3;

import java.util.Locale;
import java.util.Scanner;

public class IdadeSo_3 {

	public static void main(String[] args) 
	{	
		/*
		 * 3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		 *	21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		 *	idade for =-99. (WHILE)
		 */
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	
		
		int idade=0,n=0,v=0,menor=-99;
		
		System.out.println("\n+--- Para finalizar o programa digite (-99) ---+\n");
		System.out.println("\n::--------------------------------------------------------::\n");
		while(idade>menor) 
		{
			System.out.print("+----------------Digite a sua idade: ");
			idade=sc.nextInt();

			if(idade <= 21)
			{
				n++;
			}else if(idade>=50 )
				{
					v++;
				}
		}
		System.out.println("\n+----------------------------------------+");
		System.out.printf("\nQuantidade de pessoa com menos de 21 anos eh de: %d",n);
		System.out.printf("\nQuantidade de pessoa com mais de 50 anos eh de: %d",v);
		System.out.println("\n");
		System.out.println("+----------------------------------------+");
		
	}

}
