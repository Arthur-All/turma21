package POO;

public class Pessoa {
	
	private String primeiroNome;
	private String ultimoNome;
	private String nomeDoMeio;
	
	public Pessoa (String primero,String ultimo,String meio) {
		
		primeiroNome=primero;
		ultimoNome=ultimo;
		nomeDoMeio=meio;
		}
	
	public String getNomeComp() {
		
		String nomeCompleto = primeiroNome+" "+nomeDoMeio+" "+ultimoNome;
		return nomeCompleto;
		
	}
	

}
