package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Times {

	public static void main(String[] args)

	{
		/*
		 * G-GANHOU (3), P-PERDEU(0), OU E-EMPATOU(1) VETOR TIMES VETOR PONTOS 3 RODADAS
		 * 
		 * LISTAGEM NOME DE CADA TIME - PONTOS ATUAIS
		 * 
		 */

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);

		String times[] = { "São Paulo", "Palmeiras", "Corinthians", "Santos" };
		int pontos[] = new int[4];
		char resposta;

		for (int rodada = 0; rodada < 4; rodada++) {
			System.out.println("==== RODADA " + (rodada + 1) + " ====\n");
			for (int i = 0; i < 4; i++) {
				System.out.println(times[i] + " ganhou? [g - ganhou | e - empatou | p - perdeu]");
				resposta = teclado.next().charAt(0);
				if (resposta == 'g') {
					pontos[i] += 3;
				} else if (resposta == 'e') {
					pontos[i] += 1;
				} else {
					pontos[i] += 0;
				}
			}
		}

		for (int i = 0; i < 4; i++) {
			System.out.println("\n" + times[i] + " - " + pontos[i]);
		}

	}

}
