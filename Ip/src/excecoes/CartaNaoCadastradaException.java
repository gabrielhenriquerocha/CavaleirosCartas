package excecoes;

public class CartaNaoCadastradaException extends Exception{
	public CartaNaoCadastradaException() {

		super("Alguma carta do deck n�o foi cadastrada");

	}
}