package programas;

import java.util.Scanner;

import classes.Basico;
import classes.Estudante;

public class ProgramaTeste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o nome  do aluno");
		String nome = sc.next().toUpperCase();
		
		System.out.println("Digiete o nomero da matricula: ");
		int matricula = sc.nextInt();
		System.out.println("Digite Cpf");
		String cpf = sc.next();
		System.out.println("Digite o dia de aniversario: ");
		int dia = sc.nextInt();
		System.out.println("Digite a nota inicial");
		double nota= sc.nextDouble();
		
		Basico aluno1 = new Basico(matricula,cpf,dia);
		aluno1.setNome(nome);
		aluno1.adicionarNoota(nota);
		System.out.printf("Pontos atuais do aluno %s = %.0f",aluno1.getNome(),aluno1.getPontos());
	}

}
