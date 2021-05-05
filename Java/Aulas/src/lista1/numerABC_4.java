package lista1;
import java.util.Scanner;
public class numerABC_4 
{
	public static void main(String[] args) 
	{
		/*
		 * 4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
		 *	calcule a seguinte expressão:
		 * 
		 */
		
		Scanner leia = new Scanner(System.in);
		
		double a=0.0,b=0.0,c=0.0;
		
		System.out.println("Numero que vai ser (A)");
		a =leia.nextDouble();
		System.out.println("Numero que vai ser (B)");
		b =leia.nextDouble();
		System.out.println("Numero que vai ser (C)");
		c =leia.nextDouble();
		
		double r = ((a+b) * (a+b));
		double s = ((b+c) * (b+c));
		double d = ((r+s)/2);
	
		System.out.println("expressao calculada deu: "+d);
	}
	
	

}
