package cartas;

import excecoes.*;

public class RepositorioCartasLista implements RepositorioCartas{
	private Carta carta;
	private RepositorioCartasLista prox;

	public RepositorioCartasLista() {
		this.carta = null;
		this.prox = null;
	}
	//M�todo que insere o objeto no repositorio
	public void inserir(Carta carta) {
		if (this.carta == null) {
			this.carta = carta;
			this.prox = new RepositorioCartasLista();
		} else {
			this.prox.inserir(carta);
		}
	}
	//M�todo que remove o objeto no repositorio
	public void remover(int id) throws NaoEncontradoException {

		if (this.carta != null) {
			if (this.carta.getId() == id) {
				this.carta = this.prox.carta;
				this.prox = this.prox.prox;
			} else {
				this.prox.remover(id);
			}
		} else {
			NaoEncontradoException e = new NaoEncontradoException();
			throw e;
		}
	}
	//M�todo que retorna ou n�o um objeto dado o ID
	public Carta procurar(int id) throws NaoEncontradoException {
		Carta aux = null;
		if (this.carta != null) {
			if (this.carta.getId() == id) {
				aux = this.carta;
			} else {
				this.prox.procurar(id);
			}
			return aux;
		} else {
			NaoEncontradoException e = new NaoEncontradoException();
			throw e;
		}
	}

	//M�todo que substitui um objeto dado ID por outro objeto passado como parametro no repositorio
	public void atualizar(int id, Carta carta) throws NaoEncontradoException {

		if (this.carta != null) {
			if (this.carta.getId() == id) {
				this.carta = carta;
			} else {
				this.prox.atualizar(id, carta);
			}
		} else {
			NaoEncontradoException e = new NaoEncontradoException();
			throw e;
		}
	}
	//M�todo que retorna um boolean indicando se o objeto esta ou n�o no repositorio
	public boolean existe(int id) {
		boolean aux = false;
		if (this.carta != null) {
			if (this.carta.getId() == id) {
				aux = true;
			} else {
				aux = this.prox.existe(id);
			}
		} 
		return aux;
	}
	// M�todo que retorna todos os objetos do reposit�rio
	public int tamanhoLista() {
		if (this.carta != null) {
			return 1 + this.prox.tamanhoLista();
		} else {
			return 0;
		}
	}
  
}
