package extradecks;

import cartas.Carta;

import utilitarios.ArrayException;

public class ExtraDeck {
	private Carta[] extra;
	private int id;
	private int pos;

	public ExtraDeck(Carta[] extra, int id) {
		this.extra = new Carta[10];
		this.id = id;
	}

//vou colocar o metodo inserir aq
// se der merda eu apago
	public void inserir(Carta carta) throws ArrayException {
		if (pos < 10 && this.extra[pos] == null) {
			this.extra[pos] = carta;
			pos++;
		} else if (pos == 10) {
			ArrayException eA = new ArrayException();
			throw eA;
		} else {
			pos++;
			inserir(carta);
		}
	}

	public Carta[] getExtra() {
		return this.extra;
	}

	public void setExtra(Carta[] extra) {
		this.extra = extra;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
