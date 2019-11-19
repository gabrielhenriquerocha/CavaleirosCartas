package cartas;
import excecoes.*;
public interface RepositorioCartas {
    public void inserir(Carta carta) throws ArrayException;
    public void remover(int id) throws NaoEncontradoException;
    public Carta procurar(int id) throws NaoEncontradoException;
    public void atualizar(int id, Carta carta) throws NaoEncontradoException;
    public boolean existe(int id) throws NaoEncontradoException;
}
