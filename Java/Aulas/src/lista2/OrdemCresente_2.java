package lista2;

import java.util.Scanner;

public class OrdemCresente_2 {

	public static void main(String[] args) {
		
		/*
		 * 2- Faça um programa que entre com três números e coloque em ordem crescente.
		 */
		
		Scanner leia = new Scanner(System.in);
		
		int a=0,b=0,c=0;
		
		System.out.print("\nDigite o valor do numero 1: ");
		a=leia.nextInt();
		System.out.print("\nDigite o valor do numero 2: ");
		b=leia.nextInt();
		System.out.print("\nDigite o valor do numero 3: ");
		c=leia.nextInt();
		
		if (a>b&&a>c&&b>c)
		{
			System.out.println("A ordem decresente eh: "+a+"/"+b+"/"+c);
		}
		else if(a>b && a>c && c>b)
		{
			System.out.println("A ordem decresente eh: "+a+"/"+c+"/"+b);
		}
		else if(b>a && b>c && a>c)
		{
			System.out.println("A ordem decresente eh: "+b+"/"+a+"/"+c);
		}
		else if(b>a && b>c && c>a)
		{
			System.out.println("A ordem decresente eh: "+b+"/"+c+"/"+a);
		}
		else if(c>a && c>b && a>b)
		{
			System.out.println("A ordem decresente eh: "+c+"/"+a+"/"+b);
		}
		else if(c>a && c>b && b>a)
		{
			System.out.println("A ordem decresente eh: "+c+"/"+b+"/"+a);
		}
	
	
	
	}

}
