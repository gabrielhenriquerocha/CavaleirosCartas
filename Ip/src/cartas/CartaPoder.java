package cartas;

public class CartaPoder extends Carta {

	public CartaPoder(String nome, String desc, int id) {
		super(nome, desc, id);
	}

	//Implementa��o do m�todo abstrato
    public String getDesc() {
        return "Efeito m�gico da carta: " + this.desc;
    }
}
