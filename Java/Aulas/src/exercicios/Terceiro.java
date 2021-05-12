package exercicios;

import java.util.Scanner;

public class Terceiro extends Funcionario{
	
	private double adicilnal;

	
		
		
	
	
	public Terceiro(Scanner sc, String matricula, int horasTrabalhadas, double valorHoras, String nome, int salario,
			int salarioM, double adicilnal) {
		super(sc, matricula, horasTrabalhadas, valorHoras, nome, salario, salarioM);
		this.adicilnal = adicilnal;
	}






	public double getAdicilnal() {
		return adicilnal;
	}






	public void setAdicilnal(double adicilnal) {
		this.adicilnal = adicilnal;
	}






	@Override
public double salario() {
		
		return (horasTrabalhadas*valorHoras)+adicilnal;
		
	
		
	}
		



}




















