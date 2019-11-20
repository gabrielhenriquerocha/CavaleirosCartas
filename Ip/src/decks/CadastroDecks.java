package decks;

import excecoes.*;

public class CadastroDecks {
	private RepositorioDecks repDeck;

	public CadastroDecks(RepositorioDecks rep) {
		this.repDeck = rep;
	}
	/*
	 * M�todo cadastrar, verifica se o objeto j� existe no repositorio se n�o existe
	 * ela ir� chamar o m�todo inserir do repositorio
	 */
	public void cadastrar(Deck deck) throws IdJaCadastradoException, ArrayCheioException, NaoEncontradoException{
		if(repDeck.existe(deck.getId())) {
			throw new IdJaCadastradoException();
		}else {
			repDeck.inserir(deck);
		}
	}
	/*
	 * M�todo retirar, verifica se o objeto existe, pois se n�o exister n�o tem como
	 * remov�-lo
	 */
	public void retirar(int id) throws NaoEncontradoException{
		if(!repDeck.existe(id)) {
			throw new NaoEncontradoException();
		}else {
			repDeck.remover(id);
		}
	}
	/*
	 * M�todo buscar, verifica se o objeto existe, e caso exista chamar� o m�todo
	 * procurar do repositorio que retorna o objeto com o ID passado pelo paramentro
	 */
	public Deck buscar(int id) throws NaoEncontradoException{
		if(!repDeck.existe(id)) {
			throw new NaoEncontradoException();
		}else {
			return repDeck.procurar(id);
		}
	}
	/*
	 * M�todo retificar, verificar se o objeto com o ID passado existe, caso exista
	 * ele substituir� esse objeto por um novo passado como parametro
	 */
	public void retificar(int id,Deck deck) throws NaoEncontradoException {
		if(repDeck.existe(id)) {
			repDeck.atualizar(id, deck);
		}else {
			throw new NaoEncontradoException();
		}
	}
	/*
	 * M�todo presente, literalmente verifica a presen�a de um objeto, retornando
	 * true caso o objeto exista e false caso n�o exista
	 */
	public boolean presente(int id) {
		return repDeck.existe(id);
	}
}
