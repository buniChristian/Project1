
package deliverable3;

import org.junit.Test;
import static org.junit.Assert.*;

import java.beans.Transient;


/**
 *
 * @author Al Justin and Chris
 */
public class ValueTest {
    
    public ValueTest() {
    }

    /**
     * Test of values method, of class Value.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        Value[] expResult = null;
        Value[] result = Value.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class Value.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String string = "";
        Value expResult = null;
        Value result = Value.valueOf(string);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRankValue method, of class Value.
     */
    @Test
    public void testGetRankValue() {
        System.out.println("getRankValue");
        Value instance = null;
        String expResult = "";
        String result = instance.getRankValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRankPoint method, of class Value.
     */
    @Test
    public void testGetRankPoint() {
        System.out.println("getRankPoint");
        Value instance = null;
        int expResult = 0;
        int result = instance.getRankPoint();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Value.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Value instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
