package Prog;

import java.util.Scanner;

import Class.Funcionario;

public class Done {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Funcionario rob = new Funcionario("Robinho", "xx1", 10, 20);
		
		System.out.printf("Digite o nome:"   );
		String nome = sc.next();
		System.out.print("Digite HorasTrab: ");
		double horasTrabalhadas = sc.nextDouble();
		System.out.print("Digite ValorHoras: ");
		double valorHoras = sc.nextDouble();
		
		
		
		
		
		System.out.println(nome);
		
		
		System.out.println(rob.salario());
	}


}
