package ui;

import cartas.*;
import decks.*;
import duelistas.*;
import excecoes.ArrayException;
import extradecks.CadastroExtraDecks;
import extradecks.ExtraDeck;
import extradecks.RepositorioExtraDecks;
import extradecks.RepositorioExtraDecksArray;
import extradecks.RepositorioExtraDecksLista;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Repositorios e cadastro para Carta
		RepositorioCartas repArray = new RepositorioCartasArray();
		RepositorioCartas repLista = new RepositorioCartasLista();
		CadastroCartas cadCartaLista = new CadastroCartas(repLista);

		// Repositorios e cadastro para Deck
		RepositorioDecks repDecksArray = new RepositorioDecksArray();
		RepositorioDecks repDecksLista = new RepositorioDecksLista();
		CadastroDecks cadDeckLista = new CadastroDecks(repDecksLista);

		// Repositorios e cadastro para Duelistas
		RepositorioDuelistas repArrayD = new RepositorioDuelistasArray();
		RepositorioDuelistas repListaD = new RepositorioDuelistasLista();
		CadastroDuelistas cadDuelistasLista = new CadastroDuelistas(repListaD);

		// Repositorios e cadastro para ExtraDeck
		RepositorioExtraDecks repExtraDecksArray = new RepositorioExtraDecksArray();
		RepositorioExtraDecks repExtraDecksLista = new RepositorioExtraDecksLista();
		CadastroExtraDecks cadExtraDeckLista = new CadastroExtraDecks(repExtraDecksLista);

		// Cartas criadas para teste
		Carta a = new CartaCavaleiro("Seiya",
				"Caracterizado principalmente por nunca desistir de lutar em qualquer situa��o", 2400, 1585,
				"Sagit�rio", "Cavaleiro de Bronze", "P�gaso", 213);
		Carta b = new CartaCavaleiro("Shiryu", "Shiryu � o mais calmo e reservado perante os outros cavaleiros", 3000,
				2500, "Libra", "Cavaleiros de Bronze", "Draco", 124);
		Carta c = new CartaPoder("Meteoro de P�gaso",
				" Concentrando a cosmo-energia, o Cavaleiro dispara 100 socos por segundos, a velocidade do som, que assumem a forma de meteoros/estrelas cadentes",
				523);
		Carta d = new CartaEspectroHades("Redemoinho Esmagador",
				"Caronte concentra seu Cosmo entre seus punhos, em seguida ele dispara uma capsula ou v�rtice de energia poderosa. ",
				235);
		Carta e = new CartaPoder("C�lera do Drag�o",
				"Emanando um Cosmo Shiryu dispara uma rajada na forma de drag�o que, se acerta, leva o oponente pelos ares.",
				243);
		Carta f = new CartaCavaleiro("Hyoga",
				"� arrogante, e bastante orgulhoso de sua for�a e seu poder, n�o hesitando em demonstrar tais qualidades.",
				1300, 1400, "Aqu�rio", "Cavaleiros de Bronze", "Cygnus", 734);

		Carta g = new CartaPoder("P� de Diamante",
				"Consiste em criar uma grande quantidade de finos cristais de gelo que avan�am em alta velocidade sobre seu advers�rio.",
				773);

		Carta h = new CartaEspectroHades("Balan�a da Maldi��o",
				"Fara� toca com sua harpa uma melodia obscura. O inimigo perde os movimentos de seu corpo, em seguida a �rea onde Fara� e seu inimigo est�o, � tomada de v�rias paredes antigas com escrituras eg�picias.",
				212);
		Carta i = new CartaPoder("Ave F�nix",
				"T�cnica mais poderosa do Cavaleiro de F�nix. Ikki usa a palma das m�os para criar um sopro furioso de ar em chamas, jogando o inimigo pelos ares.",
				921);
		Carta j = new CartaEspectroHades("Reencarna��o",
				"lan�a uma esfera de cosmos que imobiliza o advers�rio que em seguida passa a ver todos os pecados que cometeu durante a vida.",
				635);
		Carta x = new CartaPoder("Corrente de Andr�meda",
				"correntes avan�am para cima de sua v�tima de uma maneira veloz e objetiva, visando acert�-lo por algum �ngulo.",
				987);

		String nome = "Gabriel";
		int idade = 18;

		// caso pra testar as excecoes
		// Carta test = new CartaPoder("aaaa", "aaa", 999);

		Deck deck1 = new Deck(1);
		ExtraDeck deck2 = new ExtraDeck(null, 2);
		Duelista duelista1 = new Duelista(null, 0, null, null);

		// tente
		try {
			deck1.inserir(a);
			deck1.inserir(b);
			deck1.inserir(c);
			deck1.inserir(d);
			deck1.inserir(e);
			deck1.inserir(f);
			deck1.inserir(g);
			deck1.inserir(h);
			deck1.inserir(i);
			deck1.inserir(j);
			deck2.inserir(x);
			duelista1.inserir(nome, idade, deck1, deck2);

			// caso teste
			// deck1.inserir(test);

			System.out.println(a.getNome());
			System.out.println(a.getDesc());
			System.out.println("");
			System.out.println(c.getDesc());
			System.out.println("");
			System.out.println(d.getDesc());
			System.out.println("");
			System.out.println(x.getDesc());
			System.out.println("");
			System.out.println(duelista1.getNome());
			System.out.println(duelista1.getId());
			System.out.println("");

			// se n conseguir, printa o ArrayException
		} catch (ArrayException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Jogo fachada = new Jogo();
	}

}
