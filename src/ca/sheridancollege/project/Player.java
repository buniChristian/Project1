/*
 * @author Christian Buni and Al Justin Pinto
 * Tuesday, April 19, 20222
 */
package deliverable3;

public class Player {

    public String name;
    public Hand hand;
    public Player () {
        this.name = name;
    }
    Player(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hand getHand() {
        return this.hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }
}
