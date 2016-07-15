/**
 * Main package
 */
package cardShuffler;

import cardDeck.Card;

/**
 * This class hosts the main and calls other associated methods
 * 
 * @author Suyash
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
		Card c = new Card("c");
		System.out.println(c.getCardName());
	}
}