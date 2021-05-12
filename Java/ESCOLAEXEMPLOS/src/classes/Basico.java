package classes;

public class Basico extends Estudante {
	
	private  int  diaAniversarioo;

	public Basico(int matricula, String cpf, int diaAniversarioo) {
		super(matricula, cpf);
		this.diaAniversarioo = diaAniversarioo;
	}

	public int getDiaAniversarioo() {
		return diaAniversarioo;
	}

	public void setDiaAniversarioo(int diaAniversarioo) {
		this.diaAniversarioo = diaAniversarioo;
	}
	
	public void booonusAniversario(int dia) {
		if(diaAniversarioo == dia) {
			super.adicionarNoota(super.getPontos()*0.1);
		}
		
		
	}
	
}
