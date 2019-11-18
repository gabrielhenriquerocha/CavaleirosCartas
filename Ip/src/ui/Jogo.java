package ui;

import cartas.CadastroCartas;
import cartas.Carta;
import decks.CadastroDecks;
import decks.Deck;
import duelistas.CadastroDuelistas;
import duelistas.Duelista;
import extradecks.CadastroExtraDecks;
import extradecks.ExtraDeck;
import utilitarios.*;

public class Jogo {
	private CadastroCartas cartas;
	private CadastroDecks decks;
	private CadastroDuelistas duelistas;
	private CadastroExtraDecks extradecks;

	// Métodos relacionados a inserção de um objeto

	public void registrar(Carta carta) throws IdJaCadastradoException, ArrayException, NaoEncontradoException {
		if (cartas.presente(carta.getId())) {
			throw new IdJaCadastradoException();
		} else {
			cartas.cadastrar(carta);
		}
	}

	public void fichar(Deck deck) throws IdJaCadastradoException, ArrayException, NaoEncontradoException {
		if (decks.presente(deck.getId())) {
			throw new IdJaCadastradoException();
		} else {
			decks.cadastrar(deck);
		}
	}

	public void arquivar(Duelista duelista) throws IdJaCadastradoException, ArrayException, NaoEncontradoException {
		if (duelistas.presente(duelista.getId())) {
			throw new IdJaCadastradoException();
		} else {
			duelistas.cadastrar(duelista);
		}
	}

	public void catalogar(ExtraDeck extradeck) throws IdJaCadastradoException, ArrayException, NaoEncontradoException {
		if (extradecks.presente(extradeck.getId())) {
			throw new IdJaCadastradoException();
		} else {
			extradecks.cadastrar(extradeck);
		}
	}

	// Métodos relacionados a remoção de um objeto

	public void apagar(int id) throws NaoEncontradoException {
		if (!cartas.presente(id)) {
			throw new NaoEncontradoException();
		} else {
			cartas.retirar(id);
		}
	}

	public void arredar(int id) throws NaoEncontradoException {
		if (!decks.presente(id)) {
			throw new NaoEncontradoException();
		} else {
			decks.retirar(id);
		}
	}

	public void retrair(int id) throws NaoEncontradoException {
		if (!duelistas.presente(id)) {
			throw new NaoEncontradoException();
		} else {
			duelistas.retirar(id);
		}
	}

	public void tirar(int id) throws NaoEncontradoException {
		if (!extradecks.presente(id)) {
			throw new NaoEncontradoException();
		} else {
			extradecks.retirar(id);
		}
	}

	// Métodos relacionados ao retorno de um objeto procurado

	public Carta buscar(int id) throws NaoEncontradoException {
		if (!cartas.presente(id)) {
			throw new NaoEncontradoException();
		} else {
			return cartas.buscar(id);
		}
	}

	public Deck rastrear(int id) throws NaoEncontradoException {
		if (!decks.presente(id)) {
			throw new NaoEncontradoException();
		} else {
			return decks.buscar(id);
		}
	}

	public Duelista catar(int id) throws NaoEncontradoException {
		if (!duelistas.presente(id)) {
			throw new NaoEncontradoException();
		} else {
			return duelistas.buscar(id);
		}
	}

	public ExtraDeck fuçar(int id) throws NaoEncontradoException {
		if (!extradecks.presente(id)) {
			throw new NaoEncontradoException();
		} else {
			return extradecks.buscar(id);
		}
	}

	// Métodos relacionados a atualização de um objeto

	public void retificar(int id, Carta carta) throws NaoEncontradoException {
		if (cartas.presente(id)) {
			cartas.retificar(id, carta);
		} else {
			throw new NaoEncontradoException();
		}
	}

	public void remodelar(int id, Deck deck) throws NaoEncontradoException {
		if (decks.presente(id)) {
			decks.retificar(id, deck);
		} else {
			throw new NaoEncontradoException();
		}
	}

	public void renovar(int id, Duelista duelista) throws NaoEncontradoException {
		if (duelistas.presente(id)) {
			duelistas.retificar(id, duelista);
		} else {
			throw new NaoEncontradoException();
		}
	}

	public void alterar(int id, ExtraDeck extradeck) throws NaoEncontradoException {
		if (extradecks.presente(id)) {
			extradecks.retificar(id, extradeck);
		} else {
			throw new NaoEncontradoException();
		}
	}

	// Métodos relacionados a verificar a presença de um objeto

	public boolean tem(int id) throws NaoEncontradoException {
		if (cartas.presente(id)) {
			return cartas.presente(id);
		} else {
			throw new NaoEncontradoException();
		}
	}

	public boolean esta(int id) throws NaoEncontradoException {
		if (decks.presente(id)) {
			return decks.presente(id);
		} else {
			throw new NaoEncontradoException();
		}
	}

	public boolean contem(int id) throws NaoEncontradoException {
		if (duelistas.presente(id)) {
			return duelistas.presente(id);
		} else {
			throw new NaoEncontradoException();
		}
	}

	public boolean incluido(int id) throws NaoEncontradoException {
		if (extradecks.presente(id)) {
			return extradecks.presente(id);
		} else {
			throw new NaoEncontradoException();
		}
	}
}
