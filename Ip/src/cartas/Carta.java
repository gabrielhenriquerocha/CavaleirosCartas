package cartas;

public abstract class Carta {
	protected String nome;
	protected String desc;
	protected int id;

	public Carta(String nome, String desc,int id) {
		this.nome = nome;
		this.desc = desc;
		this.id = id;
	}
	
	public void setDesc(String desc) {
    	this.desc = desc;
    }

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId(){
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	//M�todo abstrato, toda classe que herdar de Carta deve implementar esse m�todo, seja qual for a implementa��o
	public abstract String getDesc();
	 
}