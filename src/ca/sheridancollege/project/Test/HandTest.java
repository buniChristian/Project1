
package deliverable3;

import org.junit.Test;
import static org.junit.Assert.*;

import java.beans.Transient;
import java.util.List;
/**
 *
 * @author Al Justin and Chris
 */
public class HandTest {
    
    public HandTest() {
    }
    

    /**
     * Test of mergeHand method, of class Hand.
     */
    @Test
    public void testMergeHand() {
        System.out.println("mergeHand");
        Hand other = null;
        Hand instance = new Hand();
        instance.mergeHand(other);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of take method, of class Hand.
     */
    @Test
    public void testTake() {
        System.out.println("take");
        int numCards = 0;
        Hand instance = new Hand();
        List<Card> expResult = null;
        List<Card> result = instance.take(numCards);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCard method, of class Hand.
     */
    @Test
    public void testAddCard() {
        System.out.println("addCard");
        Card i = null;
        Hand instance = new Hand();
        instance.addCard(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCards method, of class Hand.
     */
    @Test
    public void testAddCards() {
        System.out.println("addCards");
        List<Card> list = null;
        Hand instance = new Hand();
        instance.addCards(list);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCardToBottom method, of class Hand.
     */
    @Test
    public void testAddCardToBottom() {
        System.out.println("addCardToBottom");
        Card c = null;
        Hand instance = new Hand();
        instance.addCardToBottom(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeCard method, of class Hand.
     */
    @Test
    public void testRemoveCard() {
        System.out.println("removeCard");
        Hand instance = new Hand();
        Card expResult = null;
        Card result = instance.removeCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeCardFromBottom method, of class Hand.
     */
    @Test
    public void testRemoveCardFromBottom() {
        System.out.println("removeCardFromBottom");
        Hand instance = new Hand();
        Card expResult = null;
        Card result = instance.removeCardFromBottom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of handSize method, of class Hand.
     */
    @Test
    public void testHandSize() {
        System.out.println("handSize");
        Hand instance = new Hand();
        int expResult = 0;
        int result = instance.handSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
