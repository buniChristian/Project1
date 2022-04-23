
package deliverable3;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

/**
 *
 * @author Al Justin and Chris
 */
public class GroupOfCardsTest {
    
    public GroupOfCardsTest() {
    }

    /**
     * Test of createDeck method, of class GroupOfCards.
     */
    @Test
    public void testCreateDeck() {
        System.out.println("createDeck");
        GroupOfCards instance = new GroupOfCards();
        instance.createDeck();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of shuffleDeck method, of class GroupOfCards.
     */
    @Test
    public void testShuffleDeck() {
        System.out.println("shuffleDeck");
        GroupOfCards instance = new GroupOfCards();
        instance.shuffleDeck();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCards method, of class GroupOfCards.
     */
    @Test
    public void testGetCards() {
        System.out.println("getCards");
        GroupOfCards instance = new GroupOfCards();
        List<Card> expResult = null;
        List<Card> result = instance.getCards();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCardsCount method, of class GroupOfCards.
     */
    @Test
    public void testGetCardsCount() {
        System.out.println("getCardsCount");
        GroupOfCards instance = new GroupOfCards();
        int expResult = 0;
        int result = instance.getCardsCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dealCard method, of class GroupOfCards.
     */
    @Test
    public void testDealCard() {
        System.out.println("dealCard");
        GroupOfCards instance = new GroupOfCards();
        Card expResult = null;
        Card result = instance.dealCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCard method, of class GroupOfCards.
     */
    @Test
    public void testAddCard() {
        System.out.println("addCard");
        Card c = null;
        GroupOfCards instance = new GroupOfCards();
        instance.addCard(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class GroupOfCards.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        GroupOfCards instance = new GroupOfCards();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
