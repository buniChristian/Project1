/*
 * @author Christian Buni and Al Justin Pinto
 * Tuesday, April 19, 20222
 */
package deliverable3;

/**
 *
 * @author chris
 */
public enum Suit {
    DIAMONDS("Diamonds", "D"),
    SPADES("Spades", "S"),
    CLUBS("Clubs", "C"),
    HEARTS("Hearts", "H");

    private String suitName;
    private String icon;

    Suit(String suitName, String symbol){
        this.suitName = suitName;
        this.icon = symbol;
    }
    public String getIcon(){
        return this.icon;
    }
    public String getSuitName() {
        return this.suitName;
    }
    @Override
    public String toString() {
        return this.getIcon();
    }
}