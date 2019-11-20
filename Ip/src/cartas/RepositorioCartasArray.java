package cartas;

import excecoes.*;

public class RepositorioCartasArray implements RepositorioCartas {
	private Carta[] cartas;

	public RepositorioCartasArray() {
		this.cartas = new Carta[100];
	}
	
	//M�todo que insere o objeto no repositorio
	public void inserir(Carta carta) throws ArrayCheioException {
		boolean aux = false;
		for (int k = 0; k < this.cartas.length && !aux; k++) {
			if (this.cartas[k] == null) {
				this.cartas[k] = carta;
				aux = true;
			}
		}
		if (!aux) {
			ArrayCheioException e = new ArrayCheioException();
			throw e;
		}
	}
	//M�todo que remove o objeto no repositorio
	public void remover(int id) throws NaoEncontradoException {
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
	//M�todo que retorna ou n�o um objeto dado o ID
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
	//M�todo que substitui um objeto dado ID por outro objeto passado como parametro no repositorio
	public void atualizar(int id, Carta carta) throws NaoEncontradoException {
		boolean achou = false;
		for (int k = 0; k < this.cartas.length && !achou; k++) {
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
	//M�todo que retorna um boolean indicando se o objeto esta ou n�o no repositorio
	public boolean existe(int id) {
		boolean achou = false;
		for (int k = 0; k < this.cartas.length && !achou; k++) {
			if (this.cartas[k] != null && this.cartas[k].getId() == id) {
				achou = true;
			}
		}
		return achou;
	}

	// M�todo que retorna todos os objetos do reposit�rio
	public Carta[] retornaTudo() {
		Carta[] aux = new Carta[100];
		for (int k = 0; k < cartas.length; k++) {
			if (this.cartas[k] != null) {
				aux[k] = this.cartas[k];
			}
		}
		return aux;
	}
}
