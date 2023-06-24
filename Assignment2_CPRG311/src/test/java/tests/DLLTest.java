
package tests;

import contracts.ListADT;
import dataStructures.DLL;
import java.util.Iterator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mfgperez
 */
public class DLLTest {
    
    public DLLTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of size method, of class DLL.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        DLL instance = new DLL();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class DLL.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        DLL instance = new DLL();
        instance.clear();
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class DLL.
     */
    @Test
    public void testAdd_int_Object() {
        System.out.println("add");
        int index = 0;
        Object toAdd = null;
        DLL instance = new DLL();
        boolean expResult = false;
        boolean result = instance.add(index, toAdd);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class DLL.
     */
    @Test
    public void testAdd_Object() {
        System.out.println("add");
        Object toAdd = null;
        DLL instance = new DLL();
        boolean expResult = false;
        boolean result = instance.add(toAdd);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAll method, of class DLL.
     */
    @Test
    public void testAddAll() {
        System.out.println("addAll");
        ListADT toAdd = null;
        DLL instance = new DLL();
        boolean expResult = false;
        boolean result = instance.addAll(toAdd);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class DLL.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int index = 0;
        DLL instance = new DLL();
        Object expResult = null;
        Object result = instance.get(index);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class DLL.
     */
    @Test
    public void testRemove_int() {
        System.out.println("remove");
        int index = 0;
        DLL instance = new DLL();
        Object expResult = null;
        Object result = instance.remove(index);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class DLL.
     */
    @Test
    public void testRemove_Object() {
        System.out.println("remove");
        Object toRemove = null;
        DLL instance = new DLL();
        Object expResult = null;
        Object result = instance.remove(toRemove);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of set method, of class DLL.
     */
    @Test
    public void testSet() {
        System.out.println("set");
        int index = 0;
        Object toChange = null;
        DLL instance = new DLL();
        Object expResult = null;
        Object result = instance.set(index, toChange);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class DLL.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        DLL instance = new DLL();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class DLL.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Object toFind = null;
        DLL instance = new DLL();
        boolean expResult = false;
        boolean result = instance.contains(toFind);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of toArray method, of class DLL.
     */
    @Test
    public void testToArray_ObjectArr() {
        System.out.println("toArray");
        Object[] toHold = null;
        DLL instance = new DLL();
        Object[] expResult = null;
        Object[] result = instance.toArray(toHold);
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of toArray method, of class DLL.
     */
    @Test
    public void testToArray_0args() {
        System.out.println("toArray");
        DLL instance = new DLL();
        Object[] expResult = null;
        Object[] result = instance.toArray();
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class DLL.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        DLL instance = new DLL();
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
