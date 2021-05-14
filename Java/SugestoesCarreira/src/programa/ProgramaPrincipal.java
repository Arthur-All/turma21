package programa;

import java.util.Locale;
import java.util.Scanner;

import Classes.Biologia;
import Classes.Historia;
import Classes.Matematica;
import Classes.Materia;
import Classes.Portugues;
import Classes.Quimica;


public class ProgramaPrincipal {
	static char ep = ' ';
	static char ep2 = ' ';
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		System.out.println("+------------------------------PROGRAMA DE SUGESTÃO DE CARREIRA-------------------------------------+\n");
		System.out.println("                                      (0 - Para comecar)");
		
		
		
		ep = leia.next().charAt(0);
		
		if( ep == '0') {
		System.out.println("Aqui você encontrará sugestões de áreas à seguir profissionalmente considerando seu desempenho atual.");	
			char op = ' ';
			do {
				System.out.println();
				System.out.println("1 - Português");
			    System.out.println("2 - Matemática"); 
			    System.out.println("3 - Quimica");
			    System.out.println("4 - História");
			    System.out.println("5 - Biologia");
			    System.out.println("0 - Mais materias");
			    System.out.println("7 - Sair");
			    System.out.print("\nEscolha para qual matéria você deseja visualizar seu engajamento, ou sair do programa: ");
			    op = leia.next().charAt(0);
			    System.out.println();
			    
			    double nota = 0.0;
			    int faltas = 0;
			    if(op != '7') {
				    System.out.print("Insira a nota: ");
					nota = leia.nextDouble();
					System.out.print("Insira as faltas: ");
					faltas = leia.nextInt();
			    }
			
		
		
		
		    
		    System.out.println();
		    switch (op) {
		    	case '1':
		    		Portugues por = new Portugues (nota,faltas,op);
		    		por.imprimirListaSugestoes();
		    		
		    		break;
		    	case '2':
		    		Matematica mat = new Matematica(nota, faltas,op);
		    		mat.imprimirListaSugestoes();
		    		break;
		    	case '3':
		    		Quimica qui = new Quimica(nota,faltas,op);
		    		qui.imprimirListaSugestoes();
		    		break;
		    	case '4':
		    		Historia his = new Historia(nota,faltas,op);
		    		his.imprimirListaSugestoes();
		    		break;
		    	case '5':
		    		Biologia bio = new Biologia(nota,faltas,op);
		    		bio.imprimirListaSugestoes();
		    		break;
		    	case '6':
	
		    		break;
		    	case '7':
		    		
		    		break;
		    	default:
		    		
		    		break;
		    		
		    }
		   
		    System.out.println("\nVoce se interessou por alguma profissao? ");
		    System.out.print("     (S) para sim e (N) para nao: ");
		    
		    ep2 = leia.next().charAt(0);
		    System.out.println();
		    if(ep2 == 's') {
		    	
		    	char op2 = ' ';
		    	System.out.println("\nEscolha ah profissao desejada ");
		    	System.out.print("      De (1) ah (5): ");
		    	op2  = leia.next().charAt(0);
		    	System.out.println();
		    	Materia bla;//polimorfismo foda para caralhooo!!
		    	if(op == '1' ) {
		    		bla= new Portugues(nota,faltas,op2);
		    	}else if (op=='2') {
		    		bla=new Matematica(nota,faltas,op2);
		    	}else if (op=='3') {
		    		bla=new Quimica(nota,faltas,op2);
		    	}else if (op=='4') {
		    		bla=new Historia(nota,faltas,op2);
		    	}else { 
		    		bla=new Biologia(nota,faltas,op2);
		    	}
		    	bla.opcao();	
		    	//qui.opcao(op2);
		    	System.out.println();
		    	
		    
		    }
		    
		    
		} 
			while (op != '7');
		
		System.out.println("FIM DE PROGRAMA.");
		
		leia.close();
		}
	}
}
