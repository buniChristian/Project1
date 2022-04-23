
package deliverable3;

import org.junit.Test;
import static org.junit.Assert.*;

import java.beans.Transient;
/**
 *
 * @author Al Justin and Chris
 */
public class GameTest {
    
    public GameTest() {
    }

    /**
     * Test of startGame method, of class Game.
     */
    @Test
    public void testStartGame() {
        System.out.println("startGame");
        Game instance = new Game();
        instance.startGame();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dealCards method, of class Game.
     */
    @Test
    public void testDealCards() {
        System.out.println("dealCards");
        Hand hand = null;
        Game instance = new Game();
        instance.dealCards(hand);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of battle method, of class Game.
     */
    @Test
    public void testBattle() {
        System.out.println("battle");
        Player playerOne = null;
        Player CPU = null;
        Hand Deck = null;
        Game instance = new Game();
        boolean expResult = false;
        boolean result = instance.battle(playerOne, CPU, Deck);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
