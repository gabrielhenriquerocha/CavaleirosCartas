package cartas;

public class CartaPoder extends Carta {

	public CartaPoder(String nome, String desc, int id) {
		super(nome, desc, id);
	}

	public String getDesc() {
		return "Efeito m�gico da carta: " + desc;
	}
}
