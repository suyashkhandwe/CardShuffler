package cardShuffler;

import cardDeck.Deck;
import cardDeck.DeckOfPokerCards;

/**
 * This class hosts the main and calls other associated methods
 * 
 * @author Sona
 */
public class CardShufflerEngine {

	/**
	 * This is the entry point of the code
	 * 
	 * @param args
	 *            : Denotes the command line arguments that can be passed to the
	 *            code
	 */
	public static void main(String[] args) {
		Deck pokerDeck = new Deck();
		pokerDeck.setDeckType(new DeckOfPokerCards());
		pokerDeck.setupNewDeck("poker");
		pokerDeck.simpleShuffleCards();
		for (int i = 0; i < 52; i++) {
			System.out.println(
					String.format("%1$s - %2$s", pokerDeck.getDeckName(), pokerDeck.getDeck()[i].getCardName()));
		}
	}
}