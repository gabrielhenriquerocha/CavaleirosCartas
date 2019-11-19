package cartas;

import excecoes.*;

public class CadastroCartas {
	private RepositorioCartas repCartas;

	public CadastroCartas(RepositorioCartas rep) {
		this.repCartas = rep;
	}
	
	public void cadastrar(Carta carta) throws IdJaCadastradoException, ArrayCheioException, NaoEncontradoException{
		if(repCartas.existe(carta.getId())) {
			throw new IdJaCadastradoException();
		}else {
			repCartas.inserir(carta);
		}
	}
	
	public void retirar(int id) throws NaoEncontradoException {
		if(!repCartas.existe(id)) {
			throw new NaoEncontradoException();
		}else {
			repCartas.remover(id);
		}
	}
	
	public Carta buscar(int id) throws NaoEncontradoException{
		if(!repCartas.existe(id)) {
			throw new NaoEncontradoException();
		}else {
			return repCartas.procurar(id);
		}
	}
	
	public void retificar(int id,Carta carta) throws NaoEncontradoException {
		if(repCartas.existe(id)) {
			repCartas.atualizar(id, carta);
		}else {
			throw new NaoEncontradoException();
		}
	}
	
	public boolean presente(int id) throws NaoEncontradoException {
		if(repCartas.existe(id)) {
			return repCartas.existe(id);
		}else {
			throw new NaoEncontradoException();
		}
	}
}
