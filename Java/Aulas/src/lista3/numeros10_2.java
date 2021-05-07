package lista3;

import java.util.Locale;
import java.util.Scanner;

public class numeros10_2 {

	public static void main(String[] args) {
		/*
		 * 2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	
		int p=0,i=0,n,d=10,y=0; //= par,impar,0,numero

		for(int x = 10;x>=1;x--) 
		{
			System.out.printf("\nDigite %d numeros!",x);
			n = sc.nextInt();
			y=(n%2);
			
			if(y<0) 
			{
				System.out.printf("\\nO Nao possivel de calcular.");
				break;
			}else if(y==0)
				{
					p++;
				}else if(y==1)
					{
						i++;
					}
		
		}

		System.out.println("\n+----------------------------------------+");
		System.out.printf("\nQuantidade de numero Par: %d ",p);	
		System.out.printf("\nQuantidade de numero Impares: %d ",i);	
		System.out.println("\n");
		System.out.println("+----------------------------------------+");
		
			
	}

}
