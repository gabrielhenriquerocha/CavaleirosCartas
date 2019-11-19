package extradecks;

import excecoes.NaoEncontradoException;

public class RepositorioExtraDecksLista implements RepositorioExtraDecks {
	private ExtraDeck extra;
	private RepositorioExtraDecksLista prox;

	public RepositorioExtraDecksLista() {
		this.extra = null;
		this.prox = null;
	}

	public void inserir(ExtraDeck extra) {
		if (this.extra == null) {
			this.extra = extra;
			this.prox = new RepositorioExtraDecksLista();
		} else {
			this.prox.inserir(extra);
		}
	}

	public void remover(int id) throws NaoEncontradoException {

		if (this.extra != null) {
			if (this.extra.getId() == id) {
				this.extra = this.prox.extra;
				this.prox = this.prox.prox;
			} else {
				this.prox.remover(id);
			}
		} else {
			NaoEncontradoException e = new NaoEncontradoException();
			throw e;
		}
	}

	public ExtraDeck procurar(int id) throws NaoEncontradoException {
		ExtraDeck aux = null;
		if (this.extra != null) {
			if (this.extra.getId() == id) {
				aux = this.extra;
			} else {
				this.prox.procurar(id);
			}
			return aux;
		} else {
			NaoEncontradoException e = new NaoEncontradoException();
			throw e;
		}
	}

	public void atualizar(int id, ExtraDeck extra) throws NaoEncontradoException {

		if (this.extra != null) {
			if (this.extra.getId() == id) {
				this.extra = extra;
			} else {
				this.prox.atualizar(id, extra);
			}
		} else {
			NaoEncontradoException e = new NaoEncontradoException();
			throw e;
		}
	}

	public boolean existe(int id) throws NaoEncontradoException {
		boolean aux = false;
		if (this.extra != null) {
			if (this.extra.getId() == id) {
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

