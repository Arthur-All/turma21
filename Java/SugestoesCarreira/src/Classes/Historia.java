package Classes;

public class Historia extends Materia {

	public Historia(double nota, int faltas,char op) {
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
			System.out.println("1 - Jornalismo       (x)");
			System.out.println("2 - Paleontologia    ( )");
			System.out.println("3 - Arqueologia      ( )");
			System.out.println("4 - Turismo          (x)");
			System.out.println("5 - Ci�ncia Sociais  ( )");
		}
		else if (engajamento() == 'M') {
			System.out.println("Seu engajamento est� m�dio. Lista de sugest�es a seguir nesta �rea: \n");
			System.out.println("1 - Jornalismo       ( )");
			System.out.println("2 - Paleontologia    (x)");
			System.out.println("3 - Arqueologia      (x)");
			System.out.println("4 - Turismo          ( )");
			System.out.println("5 - Ci�ncia Sociais  (x)");
		}
		else {
			System.out.println("Seu engajamento est� ruim.\n");
			System.out.println("1 - Jornalismo       ( )");
			System.out.println("2 - Turismo          ( )");
			System.out.println("3 - Arqueologia      ( )");
			System.out.println("4 - Paleontologia    ( )");
			System.out.println("5 - Ci�ncia Sociais  ( )");
		}
	}
	
	@Override	
	public void opcao() {
			
			if(op == '1') {
			System.out.println(" ARQUEOLOGIA:\n"
					+ " A arqueologia � a ci�ncia social que estuda o passado das civiliza��es humanas por meio dos vest�gios materiais deixados por elas, \r\n"
					+ " sendo muito importante para a sociedade, pois resgata a hist�ria e a cultura dos antepassados. Ela come�ou ainda no s�culo XV com o h�bito \r\n"
					+ " de colecionar rel�quias e antiguidades e, com o tempo, foi se tornando mais profissional e indispens�vel."+1);
			}else if(op=='2') {
				System.out.println("  PALEONTOLOGIA:\n"
						+ "O instrumento principal de estudos de um paleont�logo s�o os f�sseis, que s�o restos e vest�gios de animais, plantas e outros seres vivos, \r\n"
						+ "preservados em rochas, assim como ossos, rastros e pegadas que podem ser identificados em campos de escava��o e locais a c�u aberto. \r\n"
						+ "H� demanda para aqueles que querem reconstituir o passado e passar os seus conhecimentos adiante para as novas gera��es."+2);
			}else if(op=='3') {
				System.out.println("  JORNALISMO:\n"
						+ "O jornalista � o profissional respons�vel pela apura��o, investiga��o e apresenta��o de informa��es de interesse p�blico em forma de \r\n"
						+ "not�cias, reportagens, artigos ou entrevistas."+3);
			}else if(op=='4') {
				System.out.println("  CI�NCIAS SOCIAIS: \n"
						+ "Seu foco � na an�lise de movimentos e de conflitos sociais e na forma��o de opini�es e constru��o de identidades por meio da pesquisa \r\n"
						+ "sobre h�bitos, costumes e as rela��es entre as pessoas tanto em grupos de interesses quanto na sociedade como um todo. Para isso, o  \r\n"
						+ "profissional elabora um conjunto de metodologias para analisar a coletividade e interpretar seus problemas culturais e pol�ticos."+4);
			
		     }else {
		    	 System.out.println("  TURISMO: \n"
		    	 		+ "// O turism�logo � respons�vel por analisar e estudar o turismo em sua regi�o para planejar, organizar e gerenciar produtos e atividades \r\n"
		    	 		+ "// tur�sticas de todos os tipos. �reas em que se pode atuar, �Ag�ncia de Viagens, Ecoturismo, Hotelaria, Turismo de Neg�cios e etc�."+5);
		     }
		
	}
	

}

// ARQUEOLOGIA
// A arqueologia � a ci�ncia social que estuda o passado das civiliza��es humanas por meio dos vest�gios materiais deixados por elas, 
// sendo muito importante para a sociedade, pois resgata a hist�ria e a cultura dos antepassados. Ela come�ou ainda no s�culo XV com o h�bito 
// de colecionar rel�quias e antiguidades e, com o tempo, foi se tornando mais profissional e indispens�vel.


// PALEONTOLOGIA
// O instrumento principal de estudos de um paleont�logo s�o os f�sseis, que s�o restos e vest�gios de animais, plantas e outros seres vivos, 
// preservados em rochas, assim como ossos, rastros e pegadas que podem ser identificados em campos de escava��o e locais a c�u aberto. 
// H� demanda para aqueles que querem reconstituir o passado e passar os seus conhecimentos adiante para as novas gera��es.

// JORNALISMO
// O jornalista � o profissional respons�vel pela apura��o, investiga��o e apresenta��o de informa��es de interesse p�blico em forma de 
// not�cias, reportagens, artigos ou entrevistas.

// CI�NCIAS SOCIAIS
// Seu foco � na an�lise de movimentos e de conflitos sociais e na forma��o de opini�es e constru��o de identidades por meio da pesquisa 
// sobre h�bitos, costumes e as rela��es entre as pessoas tanto em grupos de interesses quanto na sociedade como um todo. Para isso, o  
// profissional elabora um conjunto de metodologias para analisar a coletividade e interpretar seus problemas culturais e pol�ticos.

// TURISMO
// O turism�logo � respons�vel por analisar e estudar o turismo em sua regi�o para planejar, organizar e gerenciar produtos e atividades 
// tur�sticas de todos os tipos. �reas em que se pode atuar, �Ag�ncia de Viagens, Ecoturismo, Hotelaria, Turismo de Neg�cios e etc�.
