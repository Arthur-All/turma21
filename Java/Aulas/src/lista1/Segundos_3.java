package lista1;

import java.util.Scanner;

public class Segundos_3 {
	
	public static void main(String[] args) 
	{
		/*
		 * 3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
		 * expressa em segundos e mostre-o expresso em horas, minutos e segundos.
		 */
		
		Scanner leia = new Scanner(System.in);
		
		int tempH = 0, tempM = 0, tempS = 0; //Horas, Minutos, Segundos;
		
		System.out.print("\nDigite tempo em (Segudos) que o evento duro: ");
		 tempS = leia.nextInt();
		
		tempH = (tempS/3600);
		tempM = ((tempS%3600)/60);
		tempS = ((tempS%3600)%60);
		
		System.out.println("\nO tempo convertido em Segundos para Horas � de: "+tempH);
		System.out.println("O tempo convertido em Segundos para Minutos � de: "+tempM);
		System.out.println("O tempo em Segundos � de: "+tempS);
	}							
	
}
