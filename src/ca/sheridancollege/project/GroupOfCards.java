/*
 * @author Christian Buni and Al Justin Pinto
 * Tuesday, April 19, 20222
 */
package deliverable3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GroupOfCards {

    private final List<Card> cards = new ArrayList<Card>();

    GroupOfCards() {
        createDeck();
    }

    public void createDeck() {
        for (Suit s : Suit.values()) {
            for (Value r : Value.values()) {
                cards.add(new Card(r, s));
            }
        }
    }
    public void shuffleDeck() {
        Collections.shuffle(this.cards);
    }

    public List<Card> getCards() {
        return this.cards;
    }

    public int getCardsCount() {
        return this.cards.size();
    }

    public Card dealCard() {
    
        return this.cards.remove(this.cards.size() - 1);
    }
    public void addCard(Card c) {
        this.cards.add(0, c);
    }
    @Override
    public String toString() {
        return this.cards.toString();
    }
}
