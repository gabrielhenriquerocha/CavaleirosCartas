
package duelistas;

import utilitarios.NaoEncontradoException;

public class RepositorioDuelistasLista implements RepositorioDuelistas {

	private Duelista duelista;
	private RepositorioDuelistasLista prox;

	public RepositorioDuelistasLista() {
		this.duelista = null;
		this.prox = null;
	}

	public void inserir(Duelista duelista) {
		if (this.duelista == null) {
			this.duelista = duelista;
			this.prox = new RepositorioDuelistasLista();
		} else {
			this.prox.inserir(duelista);
		}
	}

	public Duelista procurar(int id) throws NaoEncontradoException {
		Duelista aux = null;
		if (this.duelista != null) {
			if (this.duelista.getId() == id) {
				aux = this.duelista;
			} else {
				this.prox.procurar(id);
			}
			return aux;
		} else {
			NaoEncontradoException e = new NaoEncontradoException();
			throw e;
		}
	}

	public void remover(int id) throws NaoEncontradoException {
		if (this.duelista != null) {
			if (this.duelista.getId() == id) {
				this.duelista = this.prox.duelista;
				this.prox = this.prox.prox;
			} else {
				this.prox.remover(id);
			}
		} else {
			NaoEncontradoException e = new NaoEncontradoException();
			throw e;
		}
	}

	public boolean existe(int id) throws NaoEncontradoException {
		boolean aux = false;
		if (this.duelista != null) {
			if (this.duelista.getId() == id) {
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

	public void atualizar(int id, Duelista duelista) throws NaoEncontradoException {
		if (this.duelista != null) {
			if (this.duelista.getId() == id) {
				this.duelista = duelista;
			} else {
				this.prox.atualizar(id, duelista);
			}
		} else {
			NaoEncontradoException e = new NaoEncontradoException();
			throw e;
		}
	}
}