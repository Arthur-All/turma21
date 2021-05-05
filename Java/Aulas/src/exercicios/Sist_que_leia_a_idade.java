package exercicios;

import java.util.Scanner;

public class OiMundo 
{
	public static void main(String [] args)
	{
		Scanner  leia = new Scanner(System.in);
		
		String nome;
		int numero1 = 0;
		int numero2 = 0;
		double salario = 0;
		char op = 'S';
		
		
		System.out.println("Digite nome: ");
		nome = leia.next();
		
	//	System.out.println("oi mundo");
		//System.out.println("Arthur r.A");
		System.out.println("Soma:"+(numero1+numero2));
		
		System.out.println("Digite um numero: ");
		numero1 = leia.nextInt();
		
		System.out.println("Digite numero 2: ");
		numero2  = leia.nextInt();
		
		
		System.out.println("nome: "+nome);
		System.out.println(salario);
		
	
		
	}

}
