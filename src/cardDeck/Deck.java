package cardDeck;

import java.util.Random;

/**
 * This class implements shuffling logic and use the GenericDeck interface
 * 
 * @author Sona
 *
 */
public class Deck {
	/**
	 * Handles the deck of cards
	 */
	private GenericDeck genericDeck;

	/**
	 * Sets the type of deck
	 * 
	 * @param deck
	 *            : Type of deck such as Poker cards deck, UNO cards deck etc.
	 */
	public void setDeckType(GenericDeck deck) {
		this.genericDeck = deck;
	}

	/**
	 * Sets the name of the current deck
	 * 
	 * @param deckName
	 *            : Name of the deck
	 */
	public void setDeckName(String deckName) {
		this.genericDeck.setDeckName(deckName);
	}

	/**
	 * Gets the name of the deck
	 * 
	 * @return Name of the deck
	 */
	public String getDeckName() {
		return this.genericDeck.getDeckName();
	}

	/**
	 * Sets up a new deck
	 */
	public void setupNewDeck() {
		this.genericDeck.setupNewDeck();
	}

	/**
	 * Sets up a new deck along with the name of the deck
	 * 
	 * @param deckName
	 *            : Name of the deck
	 */
	public void setupNewDeck(String deckName) {
		this.genericDeck.setDeckName(deckName);
		this.genericDeck.setupNewDeck();
	}

	/**
	 * Sets up the deck
	 * 
	 * @param deck
	 *            : Collection of cards to be added to the deck
	 */
	public void setDeck(Card[] deck) {
		this.genericDeck.setDeck(deck);
	}

	/**
	 * Gets the deck of cards
	 * 
	 * @return Deck of cards
	 */
	public Card[] getDeck() {
		return this.genericDeck.getDeck();
	}

	/**
	 * Shuffles cards with a simple random logic
	 */
	public void simpleShuffleCards() {
		Random randomize = new Random();
		Card[] deckToShuffle = this.genericDeck.getDeck();

		for (int cardIdx = 0; cardIdx < this.genericDeck.getCardCountInDeck(); cardIdx++) {
			int swapIdx = randomize.nextInt(this.genericDeck.getCardCountInDeck());

			Card cardToSwap = deckToShuffle[swapIdx];
			deckToShuffle[swapIdx] = deckToShuffle[cardIdx];
			deckToShuffle[cardIdx] = cardToSwap;
		}
		this.genericDeck.setDeck(deckToShuffle);
	}
}
