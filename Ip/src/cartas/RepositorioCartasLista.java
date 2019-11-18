package cartas;

import utilitarios.*;

public class RepositorioCartasLista implements RepositorioCartas{
	private Carta carta;
	private RepositorioCartasLista prox;

	public RepositorioCartasLista() {
		this.carta = null;
		this.prox = null;
	}

	public void inserir(Carta carta) {
		if (this.carta == null) {
			this.carta = carta;
			this.prox = new RepositorioCartasLista();
		} else {
			this.prox.inserir(carta);
		}
	}

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

	public boolean existe(int id) throws NaoEncontradoException {
		boolean aux = false;
		if (this.carta != null) {
			if (this.carta.getId() == id) {
				aux = true;
			} else {
				this.prox.existe(id);
			}
			return aux;
		} else {
			NaoEncontradoException e = new NaoEncontradoException();
			throw e;
		}
	}
  
}
