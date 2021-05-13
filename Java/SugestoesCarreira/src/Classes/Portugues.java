package Classes;

public class Portugues extends Materia {
	
	public Portugues(double nota, int faltas) {
		super(nota, faltas);
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
			System.out.println("Seu engajamento est� bom. Lista de sugest�es a seguir nesta �rea: ");
			System.out.println("Jornalismo               (X)"); 
			System.out.println("Letras                   (X)");
            System.out.println("Direito                  (X)");
            System.out.println("Publicidade e Propaganda (X)");
            System.out.println("Ci�ncias Sociais         (X)");
                        
		}
		else if (engajamento() == 'M') {
			System.out.println("Seu engajamento est� m�dio. Lista de sugest�es a seguir nesta �rea: ");
			System.out.println("Jornalismo               ( )"); 
			System.out.println("Letras                   (X)");
            System.out.println("Direito                  ( )");
            System.out.println("Publicidade e Propaganda (X)");
            System.out.println("Ci�ncias Sociais         (X)");
		}
		else {
			System.out.println("Seu engajamento est� ruim.");
			System.out.println("Jornalismo               ( )"); 
			System.out.println("Letras                   ( )");
            System.out.println("Direito                  ( )");
            System.out.println("Publicidade e Propaganda ( )");
            System.out.println("Ci�ncias Sociais         ( )");
		}
	}
}