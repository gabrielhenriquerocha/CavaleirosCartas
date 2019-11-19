package extradecks;

import excecoes.*;

public class CadastroExtraDecks {
	private RepositorioExtraDecks repExtraDeck;

	public CadastroExtraDecks(RepositorioExtraDecks rep) {
		this.repExtraDeck = rep;
	}
	
	public void cadastrar(ExtraDeck extradeck) throws IdJaCadastradoException, ArrayException, NaoEncontradoException{
		if(repExtraDeck.existe(extradeck.getId())) {
			throw new IdJaCadastradoException();
		}else {
			repExtraDeck.inserir(extradeck);
		}
	}
	
	public void retirar(int id) throws NaoEncontradoException {
		if(!repExtraDeck.existe(id)) {
			throw new NaoEncontradoException();
		}else {
			repExtraDeck.remover(id);
		}
	}
	
	public ExtraDeck buscar(int id) throws NaoEncontradoException{
		if(!repExtraDeck.existe(id)) {
			throw new NaoEncontradoException();
		}else {
			return repExtraDeck.procurar(id);
		}
	}
	
	public void retificar(int id,ExtraDeck extradeck) throws NaoEncontradoException {
		if(repExtraDeck.existe(id)) {
			repExtraDeck.atualizar(id, extradeck);
		}else {
			throw new NaoEncontradoException();
		}
	}
	
	public boolean presente(int id) throws NaoEncontradoException {
		if(repExtraDeck.existe(id)) {
			return repExtraDeck.existe(id);
		}else {
			throw new NaoEncontradoException();
		}
	}
}
