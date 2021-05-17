package lista5;

import java.util.Scanner;

public class Tarefa_04 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		double matriz1[][] = new double[2][2]; //linha - coluna
		double matriz2[][] = new double[2][2];
		double matrizSoma[][] = new double[2][2];
		double matrizSubtrai[][] = new double[2][2];
		double auxConstante=0.00;
		char op=' ';
		
		for (int linha=0; linha<2; linha++) {
			for (int coluna=0; coluna<2; coluna++) {
				matriz1[linha][coluna]=20;
				System.out.printf("Valor da matriz1 na posicao %d - %d : %.0f\n",linha,coluna,matriz1[linha][coluna]);
				
				matriz2[linha][coluna]=10;
				System.out.printf("Valor da matriz2 na posicao %d - %d : %.0f\n",linha,coluna,matriz2[linha][coluna]);
				
				
			}
			System.out.println();
		}
		do {
			System.out.println("(1) somar as duas matrizes");
			System.out.println("(2) subtrair a primeira matriz da segunda");
			System.out.println("(3) adicionar uma constante as duas matrizes");
			System.out.println("(4) imprimir as matrizes");
			
			
			
			System.out.println("Digite o numero da sua escolha :");
			op = leia.next().charAt(0);
			switch (op)
			{
				case '1':
				{
				for (int linha=0;linha<2; linha++) {
				  for (int coluna = 0; coluna<2; coluna++) {
					matrizSoma[linha][coluna]=matriz1[linha][coluna]+matriz2[linha][coluna];
					System.out.printf("Soma de m1 + m2 na posição %d - %d = %.0f + %.0f --> %.0f\n",linha,coluna,matriz1[linha][coluna],matriz2[linha][coluna],matrizSoma[linha][coluna]);
						}
					}
				}
				break;
				case '2':
				{
					for (int linha=0;linha<2; linha++) {
						for (int coluna = 0; coluna<2; coluna++) {
							matrizSubtrai[linha][coluna]=matriz1[linha][coluna]-matriz2[linha][coluna];
							System.out.printf("A subração de m1 - m2 na posição %d - %d = %.0f - %.0f --> %.0f\n",linha,coluna,matriz1[linha][coluna],matriz2[linha][coluna],matrizSubtrai[linha][coluna]);
						}
					}
				}
				break;
				case '3':
				{
					System.out.print("Digite o valor da constante: ");
					final double VALOR = leia.nextDouble();
					for (int linha=0;linha<2; linha++) 
					{
						for (int coluna = 0; coluna<2; coluna++) 
						{
							matriz1[linha][coluna]+=VALOR;
							matriz2[linha][coluna]+=VALOR;
						}
					}
					
					
				}
				break;
				case '4':
				{
					System.out.println("Martris 1");
					for (int linha=0;linha<2; linha++) 
					{
						for (int coluna = 0; coluna<2; coluna++) 
						{
							System.out.printf("%.0f\t",matriz1[linha][coluna]);
						}
						System.out.println();
					}
					System.out.println("Mastriz 2");
					for (int linha=0;linha<2; linha++) 
					{
						for (int coluna = 0; coluna<2; coluna++) 
						{
							System.out.printf("%.0f\t",matriz2[linha][coluna]);
						}
						System.out.println();
					}
					System.out.println("Matriz soma");
					for (int linha=0;linha<2; linha++) 
					{
						for (int coluna = 0; coluna<2; coluna++) 
						{
							System.out.printf("%.0f\t",matrizSoma[linha][coluna]);
						}
						System.out.println();
					}
					System.out.println("Matriz Sub");
					for (int linha=0;linha<2; linha++) 
					{
						for (int coluna = 0; coluna<2; coluna++) 
						{
							System.out.printf("%.0f\t",matrizSubtrai[linha][coluna]);
						}
						System.out.println();
					}
				}
				break;
				default :
				break;	
				
			}
			
			
		} while (op!='4');
		
		
	}

}
