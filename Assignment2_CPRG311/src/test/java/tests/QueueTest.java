
package tests;

import contracts.QueueADT;
import dataStructures.Queue;
import java.util.Iterator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mfgperez
 */
public class QueueTest {
    
    public QueueTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of enqueue method, of class Queue.
     */
    @Test
    public void testEnqueue() {
        System.out.println("enqueue");
        Object toAdd = null;
        Queue instance = new Queue();
        instance.enqueue(toAdd);
        fail("The test case is a prototype.");
    }

    /**
     * Test of dequeue method, of class Queue.
     */
    @Test
    public void testDequeue() {
        System.out.println("dequeue");
        Queue instance = new Queue();
        Object expResult = null;
        Object result = instance.dequeue();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of peek method, of class Queue.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        Queue instance = new Queue();
        Object expResult = null;
        Object result = instance.peek();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of dequeueAll method, of class Queue.
     */
    @Test
    public void testDequeueAll() {
        System.out.println("dequeueAll");
        Queue instance = new Queue();
        instance.dequeueAll();
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class Queue.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        Queue instance = new Queue();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class Queue.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        Queue instance = new Queue();
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Queue.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        QueueADT that = null;
        Queue instance = new Queue();
        boolean expResult = false;
        boolean result = instance.equals(that);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of toArray method, of class Queue.
     */
    @Test
    public void testToArray_0args() {
        System.out.println("toArray");
        Queue instance = new Queue();
        Object[] expResult = null;
        Object[] result = instance.toArray();
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of toArray method, of class Queue.
     */
    @Test
    public void testToArray_ObjectArr() {
        System.out.println("toArray");
        Object[] holder = null;
        Queue instance = new Queue();
        Object[] expResult = null;
        Object[] result = instance.toArray(holder);
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of isFull method, of class Queue.
     */
    @Test
    public void testIsFull() {
        System.out.println("isFull");
        Queue instance = new Queue();
        boolean expResult = false;
        boolean result = instance.isFull();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class Queue.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Queue instance = new Queue();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
