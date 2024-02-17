package warGame;

public class Card {
	
	private String name;
	private String suit;
	private int value; //instance variables

	public Card(String name, String suit, int value) {
		// TODO Auto-generated constructor stub
		
		this.name = name;
		this.suit = suit;
		this.value = value;
	}


	@Override
	public String toString() { //without this, it prints the deck with the hex code instead of the string
		// TODO Auto-generated method stub
		return name + " of " + suit + " (value: " + value + ")";
	}
	
	public int value() {
		return value;
	}

}
