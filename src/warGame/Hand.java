package warGame;

import java.util.LinkedList;

public class Hand extends LinkedList<Card>{ //a hand is just another list of card
	
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

}
