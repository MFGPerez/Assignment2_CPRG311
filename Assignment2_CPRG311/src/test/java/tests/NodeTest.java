
package tests;

import dataStructures.Node;

import static org.junit.Assert.*;

/**
 *
 * @author mfgperez
 */
public class NodeTest {
    
    public NodeTest() {
    }

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }
    
   

    /**
     * Test of getValue method, of class Node.
     */
    @org.junit.Test
    public void testGetValue() {
        System.out.println("getValue");
        Node instance = null;
        Object expResult = null;
        Object result = instance.getValue();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValue method, of class Node.
     */
    @org.junit.Test
    public void testSetValue() {
        System.out.println("setValue");
        Object value = null;
        Node instance = null;
        instance.setValue(value);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNext method, of class Node.
     */
    @org.junit.Test
    public void testGetNext() {
        System.out.println("getNext");
        Node instance = null;
        Node expResult = null;
        Node result = instance.getNext();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNext method, of class Node.
     */
    @org.junit.Test
    public void testSetNext() {
        System.out.println("setNext");
        Node next = null;
        Node instance = null;
        instance.setNext(next);
        fail("The test case is a prototype.");
    }
    
}
