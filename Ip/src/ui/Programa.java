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
		// CadastroCartas cadCarta= new CadastroCartas (repArray);
		CadastroCartas cadCartaLista = new CadastroCartas(repLista);

		// Repositorios e cadastro para Deck
		RepositorioDecks repDecksArray = new RepositorioDecksArray();
		RepositorioDecks repDecksLista = new RepositorioDecksLista();
		// CadastroDecks cadDeck= new CadastroDecks (repDecksArray);
		CadastroDecks cadDeckLista = new CadastroDecks(repDecksLista);

		RepositorioDuelistas repArrayD = new RepositorioDuelistasArray();
		RepositorioDuelistas repListaD = new RepositorioDuelistasLista();

		CadastroDuelistas cadDuelistasLista = new CadastroDuelistas(repListaD);
		
		
		// Repositorios e cadastro para Deck
		RepositorioExtraDecks repExtraDecksArray = new RepositorioExtraDecksArray();
		RepositorioExtraDecks repExtraDecksLista = new RepositorioExtraDecksLista();
			// CadastroDecks cadDeck= new CadastroDecks (repDecksArray);
		CadastroExtraDecks cadExtraDeckLista = new CadastroExtraDecks(repExtraDecksLista);

		// Cartas criadas para teste
		Carta a = new CartaCavaleiro("Ymir",
				"Ymir foi o primeiro ser vivo criado a partir do gelo mágico de Ginungagap.", 2400, 1585, 6, "Rara",
				"Besta-Guerreira", 213);
		Carta b = new CartaCavaleiro("Tyrael", "Arcanjo da Justiça, defensor do santuário e da humanidade", 3000, 2500,
				9, "Super-Rara", "Anjo", 124);
		Carta c = new CartaPoder("Tempestade Nulificadora",
				"Todos os monstros do tipo Máquina têm seu ataque reduzido em 500 pontos", 523);
		Carta d = new CartaEspectroHades("Parede Espelhada",
				"Cada um dos monstros do seu oponente que conduziu um ataque enquanto este card estava com a face para cima no campo tem seu ATK diminuído pela metade enquanto este card permanecer no campo. Durante cada uma das suas Fases de Apoio, pague 2000 Pontos de Vida ou destrua este card. ",
				235);
		Carta e = new CartaPoder("Espanador de Penas da Harpia",
				"Destrua todos os Cards de Magia e Armadilha que seu oponente controla.", 243);
		Carta f = new CartaCavaleiro("Lady Harpia",
				"Este animal alado com forma humana, embora agrade aos olhos, é absolutamente letal em batalha.", 1300,
				1400, 4, "Normal", "Besta-Alada", 734);
		Carta g = new CartaPoder("Buraco Negro", "Destrua todos os monstros no campo.", 773);
		Carta h = new CartaEspectroHades("Buraco Armadilha de Espinhos",
				"Quando um monstro do oponente que foi Invocado por Invocação-Normal ou Especial neste turno declarar um ataque: destrua o monstro atacante e, se isso acontecer, cause dano ao seu oponente igual à metade do ATK original desse monstro.",
				212);
		Carta i = new CartaPoder("Tornado Gigante",
				"Devolva todos os Cards de Magia e Armadilha do campo para à mão.", 921);
		Carta j = new CartaEspectroHades("Opressão Real",
				"Ambos jogadores podem pagar 800 LPs para negar o Special Summon de um ou mais monstros ou o efeito que Special Summons monstros, e destruir aquelas cartas.",
				635);
		Carta x = new CartaPoder("aaaaa", "sassss", 987);
	
		

		Deck deck1 = new Deck(1);
		ExtraDeck deck2 = new ExtraDeck(null, 2);
		Duelista duelista1 = new Duelista(null, 1, deck1, deck2);
		
		//tente
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
			
			// Caso teste para atingir o max do array
			// deck1.inserir(j);
			System.out.println(a.getDesc());
			System.out.println(c.getDesc());
			System.out.println(d.getDesc());
		//se n conseguir, printa o ArrayException
		} catch (ArrayException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Jogo fachada = new Jogo();
	}

}
