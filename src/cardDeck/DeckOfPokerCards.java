package cardDeck;

/**
 * Handles deck of poker cards
 * 
 * @author Sona
 *
 */
public class DeckOfPokerCards implements GenericDeck {

	String pokerDeckName;
	Card[] pokerDeck;
	int cardCountInDeck = 52;

	/*
	 * (non-Javadoc)
	 * 
	 * @see cardDeck.GenericDeck#setDeckName(java.lang.String)
	 */
	@Override
	public void setDeckName(String deckName) {
		this.pokerDeckName = deckName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cardDeck.GenericDeck#setupNewDeck()
	 */
	@Override
	public void setupNewDeck() {
		String[] suit = { "Clubs", "Diamonds", "Hearts", "Spades" };
		pokerDeck = new Card[cardCountInDeck];
		int cardCounter = 0;
		for (int suitCounter = 0; suitCounter < suit.length; suitCounter++) {
			for (int cardRank = 1; cardRank <= cardCountInDeck / suit.length; cardRank++) {
				String cardRankName;
				switch (cardRank) {
				case 1:
					cardRankName = "A";
					break;
				case 11:
					cardRankName = "J";
					break;
				case 12:
					cardRankName = "Q";
					break;
				case 13:
					cardRankName = "K";
					break;
				default:
					cardRankName = String.valueOf(cardRank);
					break;
				}
				pokerDeck[cardCounter] = new Card(String.format("%1$s-%2$s", cardRankName, suit[suitCounter]));
				cardCounter++;
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cardDeck.GenericDeck#getDeckName()
	 */
	@Override
	public String getDeckName() {
		return this.pokerDeckName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cardDeck.GenericDeck#getDeck()
	 */
	@Override
	public Card[] getDeck() {
		return this.pokerDeck;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cardDeck.GenericDeck#setDeck(cardDeck.Card[])
	 */
	@Override
	public void setDeck(Card[] deck) {
		this.pokerDeck = deck;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cardDeck.GenericDeck#setupNewDeck(java.lang.String)
	 */
	@Override
	public void setupNewDeck(String deckName) {
		this.pokerDeckName = deckName;
		this.setupNewDeck();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cardDeck.GenericDeck#getCardCountInDeck()
	 */
	@Override
	public int getCardCountInDeck() {
		return this.cardCountInDeck;
	}
}
