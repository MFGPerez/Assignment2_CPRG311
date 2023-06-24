
package tests;

import contracts.StackADT;
import dataStructures.Stack;
import java.util.Iterator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mfgperez
 */
public class StackTest {
    
    public StackTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of push method, of class Stack.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object toAdd = null;
        Stack instance = new Stack();
        instance.push(toAdd);
        fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class Stack.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        Stack instance = new Stack();
        Object expResult = null;
        Object result = instance.pop();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of peek method, of class Stack.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        Stack instance = new Stack();
        Object expResult = null;
        Object result = instance.peek();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class Stack.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        Stack instance = new Stack();
        instance.clear();
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class Stack.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        Stack instance = new Stack();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of toArray method, of class Stack.
     */
    @Test
    public void testToArray_0args() {
        System.out.println("toArray");
        Stack instance = new Stack();
        Object[] expResult = null;
        Object[] result = instance.toArray();
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of toArray method, of class Stack.
     */
    @Test
    public void testToArray_ObjectArr() {
        System.out.println("toArray");
        Object[] holder = null;
        Stack instance = new Stack();
        Object[] expResult = null;
        Object[] result = instance.toArray(holder);
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class Stack.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Object toFind = null;
        Stack instance = new Stack();
        boolean expResult = false;
        boolean result = instance.contains(toFind);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of search method, of class Stack.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        Object toFind = null;
        Stack instance = new Stack();
        int expResult = 0;
        int result = instance.search(toFind);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class Stack.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        Stack instance = new Stack();
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Stack.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        StackADT that = null;
        Stack instance = new Stack();
        boolean expResult = false;
        boolean result = instance.equals(that);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class Stack.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Stack instance = new Stack();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
