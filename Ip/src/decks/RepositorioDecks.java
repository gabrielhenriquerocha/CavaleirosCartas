package decks;

import utilitarios.*;

public interface RepositorioDecks {
	public void inserir(Deck deck) throws ArrayException;

	public void remover(int id) throws NaoEncontradoException;

	public Deck procurar(int id) throws NaoEncontradoException;

	public void atualizar(int id, Deck deck) throws NaoEncontradoException;

	public boolean existe(int id) throws NaoEncontradoException;
}
