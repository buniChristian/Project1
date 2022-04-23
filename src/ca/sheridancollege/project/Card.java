/*
 * @author Christian Buni and Al Justin Pinto
 * Tuesday, April 19, 2022
 */


public class Card {

   public final Value rank;
    public final Suit suit;
    public final String card;


    Card(Value rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
        this.card = String.format("%s%s", rank.toString(), suit.getIcon());
    }

    public Suit getSuit() {
        return this.suit;
    }

    public String getSuitLetter() {
        return this.suit.getIcon();
    }

    public Value getRank() {
        return this.rank;
    }

    public String getRankLetter() {
        return this.rank.toString();
    }

    public Integer getCardPoints() {
        return this.rank.getRankPoint();
    }
    public String getCard() {
        return this.card;
    }
    public int compare(Card compare) {

        return this.getCardPoints().compareTo(compare.getCardPoints());
    }

    public boolean IfSameSuit(Card compare) {
        return this.suit.equals(compare.suit);
    }

    public boolean isSameRank(Card compare) {
        return this.rank.equals(compare.rank);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        final Card other = (Card) obj;
        return this.suit == other.suit && this.rank == other.rank;
    }
    @Override
    public String toString() {
        return this.rank.getRankValue() + " of " + this.suit.getSuitName();
    }


}
