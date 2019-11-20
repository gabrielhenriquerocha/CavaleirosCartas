package extradecks;

import excecoes.*;

public class CadastroExtraDecks {
	private RepositorioExtraDecks repExtraDeck;

	public CadastroExtraDecks(RepositorioExtraDecks rep) {
		this.repExtraDeck = rep;
	}
	/*
	 * M�todo cadastrar, verifica se o objeto j� existe no repositorio se n�o existe
	 * ela ir� chamar o m�todo inserir do repositorio
	 */
	public void cadastrar(ExtraDeck extradeck) throws IdJaCadastradoException, ArrayCheioException, NaoEncontradoException{
		if(repExtraDeck.existe(extradeck.getId())) {
			throw new IdJaCadastradoException();
		}else {
			repExtraDeck.inserir(extradeck);
		}
	}
	/*
	 * M�todo retirar, verifica se o objeto existe, pois se n�o exister n�o tem como
	 * remov�-lo
	 */
	public void retirar(int id) throws NaoEncontradoException {
		if(!repExtraDeck.existe(id)) {
			throw new NaoEncontradoException();
		}else {
			repExtraDeck.remover(id);
		}
	}
	/*
	 * M�todo buscar, verifica se o objeto existe, e caso exista chamar� o m�todo
	 * procurar do repositorio que retorna o objeto com o ID passado pelo paramentro
	 */
	public ExtraDeck buscar(int id) throws NaoEncontradoException{
		if(!repExtraDeck.existe(id)) {
			throw new NaoEncontradoException();
		}else {
			return repExtraDeck.procurar(id);
		}
	}
	/*
	 * M�todo retificar, verificar se o objeto com o ID passado existe, caso exista
	 * ele substituir� esse objeto por um novo passado como parametro
	 */
	public void retificar(int id,ExtraDeck extradeck) throws NaoEncontradoException {
		if(repExtraDeck.existe(id)) {
			repExtraDeck.atualizar(id, extradeck);
		}else {
			throw new NaoEncontradoException();
		}
	}
	/*
	 * M�todo presente, literalmente verifica a presen�a de um objeto, retornando
	 * true caso o objeto exista e false caso n�o exista
	 */
	public boolean presente(int id){
		return repExtraDeck.existe(id);
	}
}
