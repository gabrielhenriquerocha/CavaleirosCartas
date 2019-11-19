package extradecks;

import excecoes.ArrayException;
import excecoes.NaoEncontradoException;

public class RepositorioExtraDecksArray implements RepositorioExtraDecks {
	private ExtraDeck[] extra;
	private int pos;
	public RepositorioExtraDecksArray() {
		this.extra = new ExtraDeck[20];
		this.pos = 0;
	}
	
	public void inserir(ExtraDeck extra) throws ArrayException {
		if (this.extra[pos] == null) {
			this.extra[pos] = extra;
			pos++;
		} else if (pos > 19) {
			ArrayException e = new ArrayException();
			throw e;
		}
	}

	public void remover(int id) throws NaoEncontradoException {

		if (!existe(id)) {
			throw new NaoEncontradoException();
		}else {
			for (int k = 0; k < extra.length; k++) {
				if (this.extra[k] != null && this.extra[k].getId() == id) {
					this.extra[k] = null;
				}
			}
		}
	}

	public ExtraDeck procurar(int id) throws NaoEncontradoException {
		ExtraDeck aux = null;
		boolean achou = false;
		for (int k = 0; k < extra.length; k++) {

			if (this.extra[k] != null && this.extra[k].getId() == id) {
				aux = this.extra[k];
				achou = true;
			}

		}
		if (!achou) {
			NaoEncontradoException e = new NaoEncontradoException();
			throw e;
		} else {
			return aux;
		}

	}

	public void atualizar(int id, ExtraDeck extra) throws NaoEncontradoException {
		boolean achou = false;
		for (int k = 0; k < this.extra.length ; k++) {
			if (this.extra[k] != null && this.extra[k].getId() == id) {
				this.extra[k] = extra;
				achou = true;
			}
		}
		if (!achou) {
			NaoEncontradoException e = new NaoEncontradoException();
			throw e;
		}

	}

	public boolean existe(int id) throws NaoEncontradoException {
		boolean achou = false;
		for (int k = 0; k < extra.length; k++) {
			if (this.extra[k] != null && this.extra[k].getId() == id) {
				achou = true;
			}
		}
		if (!achou) {
			NaoEncontradoException e = new NaoEncontradoException();
			throw e;
		}
		return achou;
	}

}

