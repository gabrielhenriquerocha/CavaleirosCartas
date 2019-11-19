package duelistas;

import excecoes.*;

public class RepositorioDuelistasArray implements RepositorioDuelistas {

	private Duelista[] duelistas;
	private int pos;

	public RepositorioDuelistasArray() {
		this.duelistas = new Duelista[20];
		this.pos = 0;
	}

	public void inserir(Duelista duelista) throws ArrayException {
		if (this.duelistas[pos] == null) {
			this.duelistas[pos] = duelista;
			pos++;
		} else if (pos > 19) {
			ArrayException e = new ArrayException();
			throw e;
		}
	}

	public void remover(int id) throws NaoEncontradoException {

		if (!existe(id)) {
			throw new NaoEncontradoException();
		} else {
			for (int k = 0; k < duelistas.length; k++) {
				if (this.duelistas[k] != null && this.duelistas[k].getId() == id) {
					this.duelistas[k] = null;
				}
			}
		}
	}

	public Duelista procurar(int id) throws NaoEncontradoException {
		Duelista aux = null;
		boolean achou = false;
		for (int k = 0; k < duelistas.length; k++) {

			if (this.duelistas[k] != null && this.duelistas[k].getId() == id) {
				aux = this.duelistas[k];
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

	@Override
	public void atualizar(int id, Duelista duelista) throws NaoEncontradoException {
		boolean achou = false;
		for (int k = 0; k < duelistas.length; k++) {
			if (this.duelistas[k] != null && this.duelistas[k].getId() == id) {
				this.duelistas[k] = duelista;
				achou = true;
			}
		}
		if (!achou) {
			NaoEncontradoException e = new NaoEncontradoException();
			throw e;
		}

	}

	@Override
	public boolean existe(int id) throws NaoEncontradoException {
		boolean achou = false;
		for (int k = 0; k < duelistas.length; k++) {
			if (this.duelistas[k] != null && this.duelistas[k].getId() == id) {
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
