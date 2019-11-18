package cartas;

public class CartaCavaleiro extends Carta {
	private int atk;
	private int def;
	private int estrela;
	private String raridade;
	private String tipo;

	public CartaCavaleiro(String nome, String desc, int atk, int def, int estrela, String raridade, String tipo,
			int id) {
		super(nome, desc, id);
		this.atk = atk;
		this.def = def;
		this.estrela = estrela;
		this.raridade = raridade;
		this.tipo = tipo;
	}

	public void setATQ(int atk) {
		this.atk = atk;
	}

	public void setDFS(int def) {
		this.def = def;
	}

	public String getDesc() {
		return "Descrição do monstro: " + desc;
	}

	public void setEstrela(int estrela) {
		this.estrela = estrela;
	}

	public void setRaridade(String raridade) {
		this.raridade = raridade;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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

	public String getRaridade() {
		return this.raridade;
	}

	public String getTipo() {
		return this.tipo;
	}

}