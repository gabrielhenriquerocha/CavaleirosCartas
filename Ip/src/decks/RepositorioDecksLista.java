package decks;

import utilitarios.NaoEncontradoException;

public class RepositorioDecksLista implements RepositorioDecks {
	private Deck deck;
	private RepositorioDecksLista prox;

	public RepositorioDecksLista() {
		this.deck = null;
		this.prox = null;
	}

	public void inserir(Deck deck) {
		if (this.deck == null) {
			this.deck = deck;
			this.prox = new RepositorioDecksLista();
		} else {
			this.prox.inserir(deck);
		}
	}

	public void remover(int id) throws NaoEncontradoException {

		if (this.deck != null) {
			if (this.deck.getId() == id) {
				this.deck = this.prox.deck;
				this.prox = this.prox.prox;
			} else {
				this.prox.remover(id);
			}
		} else {
			NaoEncontradoException e = new NaoEncontradoException();
			throw e;
		}
	}

	public Deck procurar(int id) throws NaoEncontradoException {
		Deck aux = null;
		if (this.deck != null) {
			if (this.deck.getId() == id) {
				aux = this.deck;
			} else {
				this.prox.procurar(id);
			}
			return aux;
		} else {
			NaoEncontradoException e = new NaoEncontradoException();
			throw e;
		}
	}

	public void atualizar(int id, Deck deck) throws NaoEncontradoException {

		if (this.deck != null) {
			if (this.deck.getId() == id) {
				this.deck = deck;
			} else {
				this.prox.atualizar(id, deck);
			}
		} else {
			NaoEncontradoException e = new NaoEncontradoException();
			throw e;
		}
	}

	public boolean existe(int id) throws NaoEncontradoException {
		boolean aux = false;
		if (this.deck != null) {
			if (this.deck.getId() == id) {
				aux = true;
			} else {
				this.prox.existe(id);
			}
			return aux;
		} else {
			NaoEncontradoException e = new NaoEncontradoException();
			throw e;
		}
	}

}
