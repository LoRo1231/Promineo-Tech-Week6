package warGame;

public class Player {
	
	private String name; //instance variable
	private Hand hand = new Hand();
	private int score;

	public Player(String name) {
		// TODO Auto-generated constructor stub
		
		this.name = name;
		
	}
	
	////////////////////////////////////////////////////////////////////////

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return name;
	}
	
	////////////////////////////////////////////////////////////////////////

	public void draw(Deck deck) {
		// TODO Auto-generated method stub
		
		hand.add(deck.remove()); //access the hand and add our deck but then remove that card
		
	}
	
	////////////////////////////////////////////////////////////////////////

	public Hand getHand() {
		// TODO Auto-generated method stub
		
		return hand;
	}
	
	////////////////////////////////////////////////////////////////////////

	public Card flip() {
		// TODO Auto-generated method stub
		
		
		return hand.remove();
	}
	
	////////////////////////////////////////////////////////////////////////

	public void incrementScore() {
		// TODO Auto-generated method stub
		
		score ++;
		
	}
	
	public int score() {
		// TODO Auto-generated method stub
		
		return score;
		
	}

}
