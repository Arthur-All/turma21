package lista2;

import java.util.Scanner;

public class Par_ou_impar_quadrado_raiz_4 {

	public static void main(String[] args) {
		
		/*
		 * 4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
			n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
			�mpar exiba o n�mero elevado ao quadrado.
		 * 
		 */

		Scanner leia = new Scanner(System.in);
		int numero;
		
		System.out.print("Digite um numero: ");
		numero=leia.nextInt();
		
		if (numero == 0){
			System.out.println("Numero Neutro.");}
		
		else if(numero%2==0)
		{
			
			System.out.println("\nNumero eh par!!");
			
			numero = (numero*numero);
			
			System.out.println("\nO resultado deu: "+numero);
		}
		
			else 
			{
			System.out.println("\nNumero eh impar!!");
			
			numero = (numero/numero);
				
			System.out.println("\nO resultado deu: "+numero);
			}
		
		

	}

}
