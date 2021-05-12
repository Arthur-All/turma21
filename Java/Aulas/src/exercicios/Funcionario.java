package exercicios;

import java.util.Scanner;

public class Funcionario 
{
	Scanner sc  = new Scanner (System.in);
	
	private String matricula;
	protected double horasTrabalhadas;
	protected double valorHoras;
	private String nome;
	private int  salario=10;
	private int salarioM;
	


	public Funcionario(Scanner sc, String matricula, int horasTrabalhadas, double valorHoras, String nome, int salario,
			int salarioM) {
		super();
		this.sc = sc;
		this.matricula = matricula;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHoras = valorHoras;
		this.nome = nome;
		this.salario = salario;
		this.salarioM = salarioM;
		
	
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorHoras() {
		return valorHoras;
	}

	public void setValorHoras(double valorHoras) {
		this.valorHoras = valorHoras;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public int getSalarioM() {
		return salarioM;
	}

	public void setSalarioM(int salarioM) {
		this.salarioM = salarioM;
	}
	
	
	
	
	public double salario() {
		
		return (horasTrabalhadas*valorHoras);
		
	
		
	}
	
	
	
	
}
