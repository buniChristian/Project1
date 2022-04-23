/*
 * @author Christian Buni and Al Justin Pinto
 * 
 */
package deliverable3;

import java.util.ArrayList;
import java.util.List;


public class Hand {

    private List<Card> cards; //players individual cards


    public Hand() {
        this.cards = new ArrayList<Card>();
    }
    public void mergeHand(Hand other) {
        for (Card c : other.cards) {
            this.addCardToBottom(c);
        }
    }
    public List<Card> take(int numCards) {
        if (numCards > this.handSize()) {
            return null;
        }

        List<Card> out = new ArrayList<>();
        for (int i = 0; i < numCards; i++) {
            out.add(this.cards.remove(this.handSize() - 1));
        }

        return out;
    }
    public void addCard(Card i) {
        cards.add(i);
    }
    public void addCards(List<Card> list) {
        this.cards.addAll(list);
    }
    public void addCardToBottom(Card c) {
        cards.add(0, c);
    }
    public Card removeCard() {
        if (handSize() < 1) {
            return null;
        }
        return cards.remove(handSize() - 1);
    }
    public Card removeCardFromBottom() {
        if (handSize() < 1) {
            return null;
        }
        return cards.remove(0);
    }
    public int handSize() {
        return cards.size();
    }

}