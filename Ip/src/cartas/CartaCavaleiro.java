package cartas;

public class CartaCavaleiro extends Carta {
	private int atk;
	private int def;
	private int estrela;
	private String classificacao;
	private String constelacao;

	public CartaCavaleiro(String nome, String desc, int atk, int def, int estrela, String classificacao, String constelacao,
			int id) {
		super(nome, desc, id);
		this.atk = atk;
		this.def = def;
		this.estrela = estrela;
		this.classificacao = classificacao;
		this.constelacao = constelacao;
	}

	public void setATQ(int atk) {
		this.atk = atk;
	}

	public void setDFS(int def) {
		this.def = def;
	}

	public String getDesc() {
		return "Descrição do cavaleiro: " + desc;
	}

	public void setEstrela(int estrela) {
		this.estrela = estrela;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public void setConstelacao(String constelacao) {
		this.constelacao = constelacao;
	}

	public int getATK() {
		return this.atk;
	}

	public int getDEF() {
		return this.def;
	}

	public int getEstrela() {
		return this.estrela;
	}

	public String getClassificacao() {
		return this.classificacao;
	}

	public String getConstelacao() {
		return this.constelacao;
	}

}