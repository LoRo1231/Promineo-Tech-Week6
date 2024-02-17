package warGame;

import java.util.List;

public class App {
	
	private Player player1; //"Player" call on the player class "player1" assigns a variable name
	private Player player2; //Instance variables since they are playing each other
	private List<String> names = List.of("Logan", "Hannah"); //adding player names into a list
	private Deck deck;

	
	public static void main(String[] args) {
		
		new App().playTheGame(); //creating a new instance of our class with the method that allows the game to play

	}
	
	////////////////////////////////////////////////////////////////////////

	private void playTheGame() {
		// TODO Auto-generated method stub
		
		//How to play war? Write methods for what needs to happen - top down programming
		
		createPlayers();
		createAndShuffleDeck();
		dealCards();
		playGame();
		declareWinner();
	}
	
	////////////////////////////////////////////////////////////////////////
	
	private void declareWinner() {
		// TODO Auto-generated method stub
		
		if(player1.score() > player2.score()) {
			System.out.println("Player 1 wins!!");
		} else if (player2.score() > player2.score()) {
			System.out.println("Player 2 wins!!");
		} else {
			System.out.println("Oops... You tied.");
		}
		
	}

	////////////////////////////////////////////////////////////////////////
	
	private void playGame() {
		// TODO Auto-generated method stub
		
		while (!player1.getHand().isEmpty()) {
			Card card1 = player1.flip();
			Card card2 = player2.flip();
			
			if (card1.value() > card2.value()) {
				player1.incrementScore();
			} else if (card2.value() > card1.value()) {
				player2.incrementScore();
				
			}
		}
		
	}

	////////////////////////////////////////////////////////////////////////

	private void dealCards() {
		// TODO Auto-generated method stub
		
		while (!deck.isEmpty()) {
			player1.draw(deck);
			player2.draw(deck);
			
		}
		
		//System.out.println(player1.getHand());
		//System.out.println(player2.getHand());
		
	}
	
	////////////////////////////////////////////////////////////////////////

	private void createAndShuffleDeck() {
		// TODO Auto-generated method stub
		
		deck = new Deck();
		//System.out.println(deck);
		
		deck.shuffle();
		
		//System.out.println(deck);
	}

	////////////////////////////////////////////////////////////////////////
	
	private void createPlayers() { //Creates players to play the game
		// TODO Auto-generated method stub
		
		Player player1 = new Player("Logan");
		Player player2 = new Player("Hannah");
		//String player1 = "Logan";//assigns a name in the list to the player
		//String player2 = "Hannah";
		
		System.out.println(player1 + " is playing " + player2);
	}

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}



}
