import lista6.cachorro;
import lista6.cavalo;

public class Programa {

	public static void main(String[] args) {
		
			cachorro roger = new cachorro ("Rogerinho",21);
			
			System.out.println(roger.getNome());
			System.out.println(roger.getIdade());
			roger.som();
		
			
			cavalo rodrigo = new  cavalo ("Reger",22);
			
			System.out.println(rodrigo.getNome());
			System.out.println(rodrigo.getIdade());
			rodrigo.som();
	}

}
