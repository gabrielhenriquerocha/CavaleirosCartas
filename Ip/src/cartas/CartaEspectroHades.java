package cartas;

import cartas.Carta;

public class CartaEspectroHades extends Carta {

	public CartaEspectroHades(String nome, String desc,int id) {
		super(nome,desc, id);
	}
	
	public String getDesc() {
		return "O efeito sombrio da carta: " + desc;
	}
	

}
