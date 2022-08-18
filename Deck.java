package finalProject;

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Deck {
	
	public Deck() {
		createNewDeck();
	}
	
	Deque<Card> cards = new LinkedList<>();  //[]
	
	public void shuffle() {
		Collections.shuffle((List<?>) cards);
	}
	
	public Card draw() {
		return cards.removeLast();
	}
	
	private void createNewDeck() {
		int numbers[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		String suits[] = {"Spades","Hearts", "Clubs", "Diamonds"};
		
		for(int number : numbers) {
			for(String suit : suits) {
				Card card = new Card();
				card.setValue(number);
				card.setName(suit);
				cards.add(card);
			}
		}
	}
	
	public static void main(String[] args) {
		Deck deck = new Deck();
		System.out.println(deck.cards.size());
		deck.shuffle();
		
		for (Card card : deck.cards) {
			System.out.println(card.getValue() + card.getName());
		}
		
	}
}

