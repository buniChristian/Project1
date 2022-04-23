/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package deliverable3;

import static deliverable3.Suit.CLUBS;
import static deliverable3.Suit.HEARTS;
import static deliverable3.Value.JACK;
import static deliverable3.Value.TWO;
import org.junit.Test;
import static org.junit.Assert.*;

import java.beans.Transient;
import org.junit.Before;

/**
 *
 * @author Al Justin and Chris
 */
public class CardTest {
    
    public CardTest() {
    }
    
    Card test1 , t2, t3, t4, t5, t6;
    
    @Before
    public void setUpBefore() {
        test1 = new Card(JACK, CLUBS);
        t2 = new Card(JACK, CLUBS);
        t3 = new Card(TWO, HEARTS);
        t4 = new Card(TWO, CLUBS);
        t5 = new Card(JACK, HEARTS);

    }

    @Test
    public void testGetSuitGood() {
        System.out.println("getSuitGood");
        Suit expResult = CLUBS;
        Suit result = test1.getSuit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testGetSuitBad() {
        System.out.println("getSuitBad");
        Suit expResult = null;
        Suit result = test1.getSuit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testGetSuitBoundary() {
        System.out.println("getSuitBoundary");
        Suit expResult = CLUBS;
        Suit result = test1.getSuit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
 

    /**
     * Test of getSuitLetter method, of class Card.
     */
    @Test
    public void testGetSuitLetterGood() {
        System.out.println("getSuitLetterGood");
        String expResult = "A";
        String result = test1.getSuitLetter();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testGetSuitLetterBad() {
        System.out.println("getSuitLetterBad");
        String expResult = null;
        String result = test1.getSuitLetter();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testGetSuitLetterBoundary() {
        System.out.println("getSuitLetterBoundary");
        String expResult = "B";
        String result = test1.getSuitLetter();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getRank method, of class Card.
     */
    @Test
    public void testGetRankGood() {
        System.out.println("getRankGood");
        Value expResult = JACK;
        Value result = test1.getRank();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testGetRankBad() {
        System.out.println("getRankBad");
        Value expResult = null;
        Value result = test1.getRank();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testGetRankBoundary() {
        System.out.println("getRankBoundary");
        Value expResult = JACK;
        Value result = test1.getRank();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getRankLetter method, of class Card.
     */
    @Test
    public void testGetRankLetterGood() {
        System.out.println("getRankLetterGood");
        String expResult = "A";
        String result = test1.getRankLetter();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testGetRankLetterBad() {
        System.out.println("getRankLetterBad");
        String expResult = null;
        String result = test1.getRankLetter();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testGetRankLetterBoundary() {
        System.out.println("getRankLetterBoundary");
        String expResult = "B";
        String result = test1.getRankLetter();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getCardPoints method, of class Card.
     */
    @Test
    public void testGetCardPointsGood() {
        System.out.println("getCardPointsGood");
        Integer expResult = 12;
        Integer result = test1.getCardPoints();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testGetCardPointsBad() {
        System.out.println("getCardPointsBad");
        Integer expResult = null;
        Integer result = test1.getCardPoints();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testGetCardPointsBoundary() {
        System.out.println("getCardPointsBoundary");
        Integer expResult = 11;
        Integer result = test1.getCardPoints();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getCard method, of class Card.
     */
    @Test
    public void testGetCardGood() {
        System.out.println("getCardGood");
        String expResult = "AC";
        String result = test1.getCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    public void testGetCardBad() {
        System.out.println("getCardBad");
        String expResult = null;
        String result = test1.getCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    public void testGetCardBoundary() {
        System.out.println("getCardBoundary");
        String expResult = "AC";
        String result = test1.getCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of compare method, of class Card.
     */
    @Test
    public void testCompareGood() {
        System.out.println("compareGood");
        Card c1 = test1;
        Card c2 = t2;
        int expResult = 0;
        int result = c1.compare(c2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testCompareBad() {
        System.out.println("compareBad");
        Card c1 = test1;
        Card c2 = t2;
        Integer a = null;
        int expResult = a;
        int result = c1.compare(c2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testCompareBoundary() {
        System.out.println("compare");
        Card c1 = test1;
        Card c2 = t2;
        int expResult = 1;
        int result = c1.compare(c2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of IfSameSuit method, of class Card.
     */
    @Test
    public void testIfSameSuit() {
        System.out.println("IfSameSuit");
        Card compare = null;
        Card instance = null;
        boolean expResult = false;
        boolean result = instance.IfSameSuit(compare);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSameRank method, of class Card.
     */
    @Test
    public void testIsSameRank() {
        System.out.println("isSameRank");
        Card compare = null;
        Card instance = null;
        boolean expResult = false;
        boolean result = instance.isSameRank(compare);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Card.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Card instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Card.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Card instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
    
