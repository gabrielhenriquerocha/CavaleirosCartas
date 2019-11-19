package decks;

import cartas.Carta;
import excecoes.ArrayCheioException;

public class Deck {
	private Carta[] baralho;
	private int id;
	private int pos;

	public Deck(int id) {
		this.baralho = new Carta[10];
		this.id = id;
		this.pos = 0;
	}

	public void inserir(Carta carta) throws ArrayCheioException {
		if (pos < 10 && this.baralho[pos] == null) {
			this.baralho[pos] = carta;
			pos++;
		} else if (pos == 10) {
			ArrayCheioException eA = new ArrayCheioException();
			throw eA;
		} else {
			pos++;
			inserir(carta);
		}
	}

	public Carta[] getBaralho() {
		return this.baralho;
	}

	// get do baralho
	public void setBaralho(Carta[] baralho) {
		this.baralho = baralho;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
