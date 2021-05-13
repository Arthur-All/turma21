package programa;

import java.util.Locale;
import java.util.Scanner;

import Classes.Matematica;
import Classes.Quimica;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		System.out.println("PROGRAMA DE SUGESTÃO DE CARREIRA");
		System.out.println("Aqui você encontrará sugestões de áreas à seguir profissionalmente considerando seu desempenho atual.");
		
		System.out.print("Insira a nota para Matematica: ");
		double nota = leia.nextDouble();
		System.out.print("Insira as faltas para Matematica: ");
		int faltas = leia.nextInt();
		
		Matematica mat = new Matematica(nota, faltas);
		mat.imprimirListaSugestoes();
		
		System.out.print("Insira a nota em Quimica: ");
		double nota = leia.nextDouble();
		System.out.print("Insira as faltas em Quimica: ");
		int faltas = leia.nextInt();
		
		Quimica qui = new Quimica(nota, faltas);
		qui.imprimirListaSugestoes();
		
		leia.close();
	}
}