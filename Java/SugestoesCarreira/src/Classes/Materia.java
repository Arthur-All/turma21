package Classes;

public class Materia {
	
	protected char op ;
	private double nota;
	private int faltas;

	public Materia(double nota, int faltas,char op) {
		super();
		this.op = op;
		this.nota = nota;
		this.faltas = faltas;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}


	public char getOp() {
		return op;
	}

	public void setOp(char op) {
		this.op = op;
	}

	// Engajamento (quantas faltas voce teve em um periodo) - recomendar carreira
	// baseado em engajamento (filtro)
	protected char engajamento() {
		if (faltas <= 10) {
			return 'B'; // Ideia = retornar uma letra baseado na quantidade de faltas (por exemplo - B
						// de Bom)
			// Aparece tudo
		} else if (faltas <= 20) {
			return 'M';
			// Aparece +/-
		} else {
			return 'R';
			// Aparece nada
		}
	}

	public void imprimirListaSugestoes() {
		if (engajamento() == 'B') {
			System.out.println("Imprime lista baseada na mat�ria...");
		}
	}
	
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
