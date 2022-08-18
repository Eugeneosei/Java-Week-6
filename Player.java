package finalProject;

import java.util.Deque;
import java.util.LinkedList;

public class Player {
	
	
	private int score; 
	private String name;
	public Player(String name, Deck deckOfCards) {
		score = 0;
		this.name = name;
	}
	
	Deque<Card> hand = new LinkedList<>();
	
	public void describe() {
		System.out.println("Player %s has the following cards" + name);
		for (Card card : hand) {
			card.describe();
		}
	}
	
	public Card flip() {
		return hand.remove();
	}
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	public void incrementScore() {
		score++;
	}
	
	public int getScore() {
		return score;
	}
	
}
