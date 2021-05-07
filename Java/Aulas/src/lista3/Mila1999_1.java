package lista3;

import java.util.Scanner;

public class Mila1999_1 {

	public static void main(String[] args) 
	{
		
	/*
	 * 1- Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)
	 */
		
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		for(x=1000;x<=1999;x++) {
			System.out.printf("\n %d",x);
	
		}
		x=(x%11);
		System.out.printf("\n %d",x);
		

	}

}
