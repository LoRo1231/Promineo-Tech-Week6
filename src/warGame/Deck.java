package warGame;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Deck extends LinkedList<Card> { //the deck is made up of cards so we will extend a list of Card

	private final List<String> values = List.of("2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14)");
	
	private final List<String> type = List.of("Diamonds", "Clubs", "Hearts", "Spades");
	
	private final List<String> rank = List.of("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace)");

	
	public Deck() { //constructor
		//initialize cards with values & types
		
		for (int pos = 0; pos < values.size(); pos++) {
			int value = pos + 2;
			String name = rank.get(pos);
			
			for (String suit : type) {
				Card card = new Card(name, suit, value);
				add(card);
			}
		}
	}
	
	//////////////////////////////////////////////////////////////////////

	@Override
	public String toString() { //method for separating each card onto a different line in console
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		String lf = System.lineSeparator();
		
		for (Card card : this) {
			sb.append(card).append(lf);
		}
		
		return sb.toString();
	}
	
	//////////////////////////////////////////////////////////////////////

	public void shuffle() {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		
		for (int i = 0; i < size(); i++) { //going through the deck list in order
			//then need to find another random position and swap cards
			int j = random.nextInt(size());//this will be the random position between 0 & the size of the list
			
			Card cardA = get(i);
			Card cardB = get(j); //sets card at the position int i or j to a variable
			
			set(i, cardB);
			set(j, cardA);
			
			
		}
		
	}
}
