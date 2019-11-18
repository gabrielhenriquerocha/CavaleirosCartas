package duelistas;

import utilitarios.*;

public class CadastroDuelistas {
	private RepositorioDuelistas repDuelista;

	public CadastroDuelistas(RepositorioDuelistas rep) {
		this.repDuelista = rep;
	}
	
	public void cadastrar(Duelista duelista) throws IdJaCadastradoException, ArrayException, NaoEncontradoException{
		if(repDuelista.existe(duelista.getId())) {
			throw new IdJaCadastradoException();
		}else {
			repDuelista.inserir(duelista);
		}
	}
	
	public void retirar(int id) throws NaoEncontradoException {
		if(!repDuelista.existe(id)) {
			throw new NaoEncontradoException();
		}else {
			repDuelista.remover(id);
		}
	}
	
	public Duelista buscar(int id) throws NaoEncontradoException{
		if(!repDuelista.existe(id)) {
			throw new NaoEncontradoException();
		}else {
			return repDuelista.procurar(id);
		}
	}
	
	public void retificar(int id,Duelista duelista) throws NaoEncontradoException {
		if(repDuelista.existe(id)) {
			repDuelista.atualizar(id, duelista);
		}else {
			throw new NaoEncontradoException();
		}
	}
	
	public boolean presente(int id) throws NaoEncontradoException {
		if(repDuelista.existe(id)) {
			return repDuelista.existe(id);
		}else {
			throw new NaoEncontradoException();
		}
	}
}

