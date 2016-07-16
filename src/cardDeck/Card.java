package cardDeck;

/**
 * This class represents a single card
 * 
 * @author Sona
 *
 */
public final class Card {

	/**
	 * Name of the card such as '5-heart' or 'K-spade'
	 */
	private String cardName;

	/**
	 * Constructor for the Card class which creates a card with the given name
	 * 
	 * @param cardName
	 *            : Name of the card to be created
	 */
	public Card(String cardName) {
		this.cardName = cardName;
	}

	/**
	 * Returns the name of the current card
	 * 
	 * @return Name of the card such as '5-heart' or 'K-spade'
	 */
	public String getCardName() {
		return this.cardName;
	}
}
