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
			System.out.println("Seu engajamento está bom. Lista de sugestões a seguir nesta área: \n");
			System.out.println("1 - Nutrição                    (x) ");
			System.out.println("2 - Educação Fisica             (x)");
			System.out.println("3 - Medicina                    (x)");
			System.out.println("4 - Professor de Biologia       (x)");
			System.out.println("5 - Biologia Marinha            (x)");
		}
		else if (engajamento() == 'M') {
			System.out.println("Seu engajamento está médio. Lista de sugestões a seguir nesta área: \n");
			System.out.println("Seu engajamento está bom. Lista de sugestões a seguir nesta área: ");
			System.out.println("1 - Nutrição                    (x) ");
			System.out.println("2 - Educação Fisica             (x)");
			System.out.println("3 - Medicina                    (x)");
			System.out.println("4 - Professor de Biologia       (x)");
			System.out.println("5 - Biologia Marinha            (x)");
		}
		else {
			System.out.println("Seu engajamento está bom. Lista de sugestões a seguir nesta área: \n");
			System.out.println("1 - Nutrição                    (x) ");
			System.out.println("2 - Educação Fisica             (x)");
			System.out.println("3 - Medicina                    (x)");
			System.out.println("4 - Professor de Biologia       (x)");
			System.out.println("5 - Biologia Marinha            (x)");
		}
		
		
		
		/*
		 * LISTA DE BIOLOGIA 
Nutrição
- Medicina voltada pra área de uma alimentação mais saudável. 
Educação física 
- Profissional que trabalha as habiladades com o corpo e exercícios físicos.
Medicina 
- Profissionais que diagosticam e cuidam da saúde da população. 
Professor de biologia
- Professional que leciona em escolas ou universidades.
Biologia marinha
- Profissionais que estudam os organismos que vivem no ecossistema salgado.
		 */
	}
	
	
	@Override	
	public void opcao() {
			
			if(op == '1') {
			System.out.println("Nutrição: \n"
					+ "- Medicina voltada pra área de uma alimentação mais saudável. "+1);
			}else if(op=='2') {
				System.out.println("Educação física: \n"
						+ "- Profissional que trabalha as habiladades com o corpo e exercícios físicos."+2);
			}else if(op=='3') {
				System.out.println("Medicina:  \n"
						+ "- Profissionais que diagosticam e cuidam da saúde da população."+3);
			}else if(op=='4') {
				System.out.println("Professor de biologia\r\n"
						+ "- Professional que leciona em escolas ou universidades."+4);
			
		     }else {
		    	 System.out.println("Biologia marinha: \n"
		    	 		+ "- Profissionais que estudam os organismos que vivem no ecossistema salgado."+5);
		     }
		
	}
}
