package dataStructures;

import java.util.Iterator;

import contracts.ListADT;

/**
 * Class description: 
 *
 * @author Marcel Gallardo (000827700)
 *
 * 
 */
public class DLL implements ListADT {
	
	
	private Node head; 
	private Node tail; 
	private int size; 
	
	public DLL() {
		
		//head = null; 
		//tail = null;
	}

	@Override
	public int size() {
		
		
		return size;
	}

	@Override
	public void clear() {
		
		//head = null;
		
	}

	@Override
	public boolean add(int index, Object toAdd) throws NullPointerException, IndexOutOfBoundsException {
		
		/*
		if (this.isEmpty()) {
			
			  head = new Node(null , toAdd , null);
			  
				
			  size++; 
				
		}
		*/
		return false;
	}

	@Override
	public boolean add(Object toAdd) throws NullPointerException {
		
		/*
	if (this.isEmpty()) {
				
		    head = new Node(null , toAdd , null);
		
			size++; 
			
			return true; 
		}
	    else {
		
	    	Node newNode = new Node(null, toAdd, head);
	    	head = newNode; 
	    	size++; 
	    	return true; 
	    }
	    */
		return false;
	
		
	}

	@Override
	public boolean addAll(ListADT toAdd) throws NullPointerException {
		
		return false;
	}

	@Override
	public Object get(int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object remove(int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object remove(Object toRemove) throws NullPointerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object set(int index, Object toChange) throws NullPointerException, IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		
	
		//return size() == 0;
		return true;
		
	}

	@Override
	public boolean contains(Object toFind) throws NullPointerException {
		
		return false;
	}

	@Override
	public Object[] toArray(Object[] toHold) throws NullPointerException {
		
		return null;
	}

	@Override
	public Object[] toArray() {
		
		return null;
	}

	@Override
	public Iterator iterator() {
		
		return null;
	}

}
