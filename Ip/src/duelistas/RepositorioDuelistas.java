package duelistas;

import utilitarios.*;

public interface RepositorioDuelistas {
	public void inserir(Duelista duelista) throws ArrayException;

	public void remover(int id) throws NaoEncontradoException;

	public Duelista procurar(int id) throws NaoEncontradoException;

	public void atualizar(int id, Duelista duelista) throws NaoEncontradoException;

	public boolean existe(int id) throws NaoEncontradoException;

}