package cartas;

public abstract class Carta {
	protected String nome;
	protected String desc;
	protected int id;

	public Carta(String nome, String desc,int id) {
		this.nome = nome;
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

	public abstract String getDesc();
	 
}
