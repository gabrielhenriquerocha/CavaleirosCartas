package duelistas;

import excecoes.*;

public class CadastroDuelistas {
	private RepositorioDuelistas repDuelista;

	public CadastroDuelistas(RepositorioDuelistas rep) {
		this.repDuelista = rep;
	}
	/*
	 * M�todo cadastrar, verifica se o objeto j� existe no repositorio se n�o existe
	 * ela ir� chamar o m�todo inserir do repositorio
	 */
	public void cadastrar(Duelista duelista) throws IdJaCadastradoException, ArrayCheioException, NaoEncontradoException{
		if(repDuelista.existe(duelista.getId())) {
			throw new IdJaCadastradoException();
		}else {
			repDuelista.inserir(duelista);
		}
	}
	/*
	 * M�todo retirar, verifica se o objeto existe, pois se n�o exister n�o tem como
	 * remov�-lo
	 */
	public void retirar(int id) throws NaoEncontradoException {
		if(!repDuelista.existe(id)) {
			throw new NaoEncontradoException();
		}else {
			repDuelista.remover(id);
		}
	}
	/*
	 * M�todo buscar, verifica se o objeto existe, e caso exista chamar� o m�todo
	 * procurar do repositorio que retorna o objeto com o ID passado pelo paramentro
	 */
	public Duelista buscar(int id) throws NaoEncontradoException{
		if(!repDuelista.existe(id)) {
			throw new NaoEncontradoException();
		}else {
			return repDuelista.procurar(id);
		}
	}
	/*
	 * M�todo retificar, verificar se o objeto com o ID passado existe, caso exista
	 * ele substituir� esse objeto por um novo passado como parametro
	 */
	public void retificar(int id,Duelista duelista) throws NaoEncontradoException {
		if(repDuelista.existe(id)) {
			repDuelista.atualizar(id, duelista);
		}else {
			throw new NaoEncontradoException();
		}
	}
	/*
	 * M�todo presente, literalmente verifica a presen�a de um objeto, retornando
	 * true caso o objeto exista e false caso n�o exista
	 */
	public boolean presente(int id){
		return repDuelista.existe(id);
	}
}

