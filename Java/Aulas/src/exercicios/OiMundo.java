package exemplos;

import java.util.Scanner;

public class ExemploSe {

	public static void main(String[] args) {

		int ir;
		double salario = 0;
		boolean  emergencial, fralde, imposto;
		String nome,masculino,F,O;;
		char G;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva seu nome:");
		nome = leia.nextLine();
		
		System.out.println("Escreva seu genero:");
		G = leia.nextLine().charAt(0);
		
		System.out.println("Seu salário:");
		salario = leia.nextDouble();
		
		
		if ((salario*12)<=60000) {
			emergencial = true;
			imposto = false;
			
			
			if(M == true) {
			 if(imposto == false) {
				System.out.println("Isento do IR");
			}else 
				System.out.println("Pagar IR");
				imposto = true;
				emergencial = false;		
		}
		
		
		
		

	}

}
