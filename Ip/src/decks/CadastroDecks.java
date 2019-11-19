package decks;

import excecoes.*;

public class CadastroDecks {
	private RepositorioDecks repDeck;

	public CadastroDecks(RepositorioDecks rep) {
		this.repDeck = rep;
	}
	
	public void cadastrar(Deck deck) throws IdJaCadastradoException, ArrayException, NaoEncontradoException{
		if(repDeck.existe(deck.getId())) {
			throw new IdJaCadastradoException();
		}else {
			repDeck.inserir(deck);
		}
	}
	
	public void retirar(int id) throws NaoEncontradoException{
		if(!repDeck.existe(id)) {
			throw new NaoEncontradoException();
		}else {
			repDeck.remover(id);
		}
	}
	
	public Deck buscar(int id) throws NaoEncontradoException{
		if(!repDeck.existe(id)) {
			throw new NaoEncontradoException();
		}else {
			return repDeck.procurar(id);
		}
	}
	
	public void retificar(int id,Deck deck) throws NaoEncontradoException {
		if(repDeck.existe(id)) {
			repDeck.atualizar(id, deck);
		}else {
			throw new NaoEncontradoException();
		}
	}
	
	public boolean presente(int id) throws NaoEncontradoException {
		if(repDeck.existe(id)) {
			return repDeck.existe(id);
		}else {
			throw new NaoEncontradoException();
		}
	}
}
