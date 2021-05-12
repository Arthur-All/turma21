package lista4;


import java.util.Scanner;

public class Tarefa_1 {

	public static void main(String[] args)
	{
		/*
		 * 1- Faça um programa que possua um vetor denominado A que armazene 6 números inteiros.
 			O programa deve executar os seguintes passos:
			(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
			(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições

			A[0], A[1] e A[5] do vetor e mostre na tela esta soma.

			(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100.
			(d) Mostre na tela cada valor do vetor A, um em cada linha.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int a [] = {1, 0, 5, -2, -5, 7};
		int soma=0,valor=0,zerador;
		for(int numero : a )
		{
			System.out.println("\nNumeros: "+numero);
		}
		
		System.out.println("+---------------------------------+\n");
		for(int i=0;i<a.length;i++)
		{
			soma = (a[0]+a[1]+a[5]);
		}
		System.out.printf("\nA soma entre os valores das posições eh: %d\n ",soma);
		
		for(int i=0;i<a.length;i++)
		{
			
			valor=(a[4]+100);
		}
		
		System.out.println("+---------------------------------+\n");
		
		for(int  x : a)
		{
		 System.out.printf("\nValores modificado do vetor A: %d\n",x);
		}
		
	}	

}
