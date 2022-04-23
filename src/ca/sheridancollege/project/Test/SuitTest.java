/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package deliverable3;

import org.junit.Test;
import static org.junit.Assert.*;

import java.beans.Transient;
/**
 *
 * @author Al Justin and Chris
 */
public class SuitTest {
    
    public SuitTest() {
    }

    /**
     * Test of values method, of class Suit.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        Suit[] expResult = null;
        Suit[] result = Suit.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class Suit.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String string = "";
        Suit expResult = null;
        Suit result = Suit.valueOf(string);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIcon method, of class Suit.
     */
    @Test
    public void testGetIcon() {
        System.out.println("getIcon");
        Suit instance = null;
        String expResult = "";
        String result = instance.getIcon();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSuitName method, of class Suit.
     */
    @Test
    public void testGetSuitName() {
        System.out.println("getSuitName");
        Suit instance = null;
        String expResult = "";
        String result = instance.getSuitName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Suit.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Suit instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
