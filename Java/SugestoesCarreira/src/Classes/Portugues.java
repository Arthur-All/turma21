package Classes;

public class Portugues extends Materia {
	
	public Portugues(double nota, int faltas,char op) {
		super(nota, faltas,op);
	}

	@Override
	protected char engajamento() {
		if(super.getNota() >= 8.0 && super.getFaltas() <= 5) {
			return 'B'; 
		}
		else if (super.getNota() >= 6.0 && super.getFaltas() <= 10) {
			return 'M';
		}
		else {
			return 'R';
		}
	}
	
	@Override
	public void imprimirListaSugestoes() {
		if(engajamento() == 'B') {
			System.out.println("Seu engajamento está bom. Lista de sugestões a seguir nesta área: \n");
			System.out.println("1 - Jornalismo               (x)  "); 
			System.out.println("2 - Letras                   (X)");
            System.out.println("3 - Direito                  (X)");
            System.out.println("4 - Publicidade e Propaganda (X)");
            System.out.println("5 - Ciências Sociais         (X)");
                        
		}
		else if (engajamento() == 'M') {
			System.out.println("Seu engajamento está médio. Lista de sugestões a seguir nesta área: \n");
			System.out.println("1 - Jornalismo               ( )  "); 
			System.out.println("2 - Letras                   (X)");
            System.out.println("3 - Direito                  ( )");
            System.out.println("4 - Publicidade e Propaganda (X)");
            System.out.println("5 - Ciências Sociais         (X)");
		}
		else {
			System.out.println("Seu engajamento está ruim.\n");
			System.out.println("1 - Jornalismo               ( )  "); 
			System.out.println("2 - Letras                   ( )");
            System.out.println("3 - Direito                  ( )");
            System.out.println("4 - Publicidade e Propaganda ( )");
            System.out.println("5 - Ciências Sociais         ( )");
		}
	}
	
	@Override	
	public void opcao() {
			
			if(op == '1') {
			System.out.println("Imprime opcao..."+1);
			}else if(op=='2') {
				System.out.println("Imprime opcao..."+2);
			}else if(op=='3') {
				System.out.println("Imprime opcao..."+3);
			}else if(op=='4') {
				System.out.println("Imprime opcao..."+4);
			
		     }else {
		    	 System.out.println("Imprime opcao..."+5);
		     }
		
	}
	
	
}