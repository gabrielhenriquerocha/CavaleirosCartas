package cartas;

import excecoes.*;

public class CadastroCartas {
	private RepositorioCartas repCartas;

	public CadastroCartas(RepositorioCartas rep) {
		this.repCartas = rep;
	}

	/*
	 * M�todo cadastrar, verifica se o objeto j� existe no repositorio se n�o existe
	 * ela ir� chamar o m�todo inserir do repositorio
	 */
	public void cadastrar(Carta carta) throws IdJaCadastradoException, ArrayCheioException, NaoEncontradoException {
		if (repCartas.existe(carta.getId())) {
			throw new IdJaCadastradoException();
		} else {
			repCartas.inserir(carta);
		}
	}

	/*
	 * M�todo retirar, verifica se o objeto existe, pois se n�o exister n�o tem como
	 * remov�-lo
	 */
	public void retirar(int id) throws NaoEncontradoException {
		if (!repCartas.existe(id)) {
			throw new NaoEncontradoException();
		} else {
			repCartas.remover(id);
		}
	}

	/*
	 * M�todo buscar, verifica se o objeto existe, e caso exista chamar� o m�todo
	 * procurar do repositorio que retorna o objeto com o ID passado pelo paramentro
	 */
	public Carta buscar(int id) throws NaoEncontradoException {
		if (!repCartas.existe(id)) {
			throw new NaoEncontradoException();
		} else {
			return repCartas.procurar(id);
		}
	}

	/*
	 * M�todo retificar, verificar se o objeto com o ID passado existe, caso exista
	 * ele substituir� esse objeto por um novo passado como parametro
	 */
	public void retificar(int id, Carta carta) throws NaoEncontradoException {
		if (repCartas.existe(id)) {
			repCartas.atualizar(id, carta);
		} else {
			throw new NaoEncontradoException();
		}
	}

	/*
	 * M�todo presente, literalmente verifica a presen�a de um objeto, retornando
	 * true caso o objeto exista e false caso n�o exista
	 */
	public boolean presente(int id) {
		return repCartas.existe(id);
	}
}
