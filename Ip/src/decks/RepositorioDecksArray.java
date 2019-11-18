package decks;

import utilitarios.ArrayException;
import utilitarios.NaoEncontradoException;

public class RepositorioDecksArray implements RepositorioDecks {
	private Deck[] decks;
	private int pos;

	public RepositorioDecksArray() {
		this.decks = new Deck[20];
		this.pos = 0;
	}

	public void inserir(Deck deck) throws ArrayException {
		if (this.decks[pos] == null) {
			this.decks[pos] = deck;
			pos++;
		} else if (pos > 19) {
			ArrayException e = new ArrayException();
			throw e;
		}
	}

	public void remover(int id) throws NaoEncontradoException {

		if (!existe(id)) {
			throw new NaoEncontradoException();
		} else {
			for (int k = 0; k < decks.length; k++) {
				if (this.decks[k] != null && this.decks[k].getId() == id) {
					this.decks[k] = null;
				}
			}
		}
	}

	public Deck procurar(int id) throws NaoEncontradoException {
		Deck aux = null;
		boolean achou = false;
		for (int k = 0; k < decks.length; k++) {

			if (this.decks[k] != null && this.decks[k].getId() == id) {
				aux = this.decks[k];
				achou = true;
			}

		}
		if (!achou) {
			NaoEncontradoException e = new NaoEncontradoException();
			throw e;
		} else {
			return aux;
		}

	}

	public void atualizar(int id, Deck deck) throws NaoEncontradoException {
		boolean achou = false;
		for (int k = 0; k < decks.length; k++) {
			if (this.decks[k] != null && this.decks[k].getId() == id) {
				this.decks[k] = deck;
				achou = true;
			}
		}
		if (!achou) {
			NaoEncontradoException e = new NaoEncontradoException();
			throw e;
		}

	}

	public boolean existe(int id) throws NaoEncontradoException {
		boolean achou = false;
		for (int k = 0; k < decks.length; k++) {
			if (this.decks[k] != null && this.decks[k].getId() == id) {
				achou = true;
			}
		}
		if (!achou) {
			NaoEncontradoException e = new NaoEncontradoException();
			throw e;
		}
		return achou;
	}

}
