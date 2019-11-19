package cartas;

import excecoes.*;

public class RepositorioCartasArray implements RepositorioCartas {
	private Carta[] cartas;
	private int pos = 0;

	public RepositorioCartasArray() {
		this.cartas = new Carta[100];
	}

	public void inserir(Carta carta) throws ArrayCheioException{
		if (this.cartas[pos] == null) {
			this.cartas[pos] = carta;
			pos++;
		} else if (pos == 100) {
			ArrayCheioException eA = new ArrayCheioException();
			throw eA;
		} else {
			pos++;
			inserir(carta);
		}
	}

	public void remover (int id) throws NaoEncontradoException {
		if (!existe(id)) {
			throw new NaoEncontradoException();
		} else {
			for (int k = 0; k < cartas.length; k++) {
				if (this.cartas[k] != null && this.cartas[k].getId() == id) {
					this.cartas[k] = null;
				}
			}
		}

	}

	public Carta procurar(int id) throws NaoEncontradoException {
		Carta aux = null;
		boolean achou = false;
		for (int k = 0; k < cartas.length; k++) {

			if (this.cartas[k] != null && this.cartas[k].getId() == id) {
				aux = this.cartas[k];
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
	public void atualizar(int id, Carta carta) throws NaoEncontradoException {
		boolean achou = false;
		for (int k = 0; k < cartas.length; k++) {
			if (this.cartas[k] != null && this.cartas[k].getId() == id) {
				this.cartas[k] = carta;
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
		for (int k = 0; k < cartas.length; k++) {
			if (this.cartas[k] != null && this.cartas[k].getId() == id) {
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
