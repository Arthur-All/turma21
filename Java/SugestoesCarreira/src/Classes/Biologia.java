package Classes;

public class Biologia extends Materia{

	public Biologia(double nota, int faltas,char op) {
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
			System.out.println("Seu engajamento est� bom. Lista de sugest�es a seguir nesta �rea: \n");
			System.out.println("1 - Nutri��o                    (x) ");
			System.out.println("2 - Educa��o Fisica             (x)");
			System.out.println("3 - Medicina                    (x)");
			System.out.println("4 - Professor de Biologia       (x)");
			System.out.println("5 - Biologia Marinha            (x)");
		}
		else if (engajamento() == 'M') {
			System.out.println("Seu engajamento est� m�dio. Lista de sugest�es a seguir nesta �rea: \n");
			System.out.println("Seu engajamento est� bom. Lista de sugest�es a seguir nesta �rea: ");
			System.out.println("1 - Nutri��o                    (x) ");
			System.out.println("2 - Educa��o Fisica             (x)");
			System.out.println("3 - Medicina                    (x)");
			System.out.println("4 - Professor de Biologia       (x)");
			System.out.println("5 - Biologia Marinha            (x)");
		}
		else {
			System.out.println("Seu engajamento est� bom. Lista de sugest�es a seguir nesta �rea: \n");
			System.out.println("1 - Nutri��o                    (x) ");
			System.out.println("2 - Educa��o Fisica             (x)");
			System.out.println("3 - Medicina                    (x)");
			System.out.println("4 - Professor de Biologia       (x)");
			System.out.println("5 - Biologia Marinha            (x)");
		}
		
		
		
		/*
		 * LISTA DE BIOLOGIA 
Nutri��o
- Medicina voltada pra �rea de uma alimenta��o mais saud�vel. 
Educa��o f�sica 
- Profissional que trabalha as habiladades com o corpo e exerc�cios f�sicos.
Medicina 
- Profissionais que diagosticam e cuidam da sa�de da popula��o. 
Professor de biologia
- Professional que leciona em escolas ou universidades.
Biologia marinha
- Profissionais que estudam os organismos que vivem no ecossistema salgado.
		 */
	}
	
	
	@Override	
	public void opcao() {
			
			if(op == '1') {
			System.out.println("Nutri��o: \n"
					+ "- Medicina voltada pra �rea de uma alimenta��o mais saud�vel. "+1);
			}else if(op=='2') {
				System.out.println("Educa��o f�sica: \n"
						+ "- Profissional que trabalha as habiladades com o corpo e exerc�cios f�sicos."+2);
			}else if(op=='3') {
				System.out.println("Medicina:  \n"
						+ "- Profissionais que diagosticam e cuidam da sa�de da popula��o."+3);
			}else if(op=='4') {
				System.out.println("Professor de biologia\r\n"
						+ "- Professional que leciona em escolas ou universidades."+4);
			
		     }else {
		    	 System.out.println("Biologia marinha: \n"
		    	 		+ "- Profissionais que estudam os organismos que vivem no ecossistema salgado."+5);
		     }
		
	}
}
