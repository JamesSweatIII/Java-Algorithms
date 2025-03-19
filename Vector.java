package vector;

import java.util.*;


public class Vector<T> implements List<T> {

	private T[] itemArray;
	private int size = 0;
	private static final int INITIAL_CAPACITY = 100;

	public Vector() {
		this(INITIAL_CAPACITY);  // calls the other constructor that takes an int parameter
	}

	@SuppressWarnings("unchecked")
	public Vector(int capacity) {
		this.itemArray = (T[]) new Object[capacity];
		this.size = 0;
	}

	public int capacity() {
		return this.itemArray.length;
	}

	/**
	 * When the underlying array fills up, we need to somehow resize it to accommodate the
	 * Vectors's elements.
	 * Ignores the request if the requested new capacity is too small to fit the elements
	 * already in the Vector
	 */
	public void resize(int newCapacity) {
		// TODO: Implement this method
		
		T[] f = (T[]) new Object[newCapacity*2];
		for (int i = 0; i < newCapacity; i++) {
			 
			
			f[i] = itemArray[i];
			 
		 }
	
		itemArray = f;
		
	}

	@Override
	public int size() {
		// TODO: Implement this method
		return size;
	}

	@Override
	public void clear() {
		// TODO: Implement this method
		
		while(this.size != 0) {
			int i = this.size-1;
			itemArray[i] = null;
			i--;
			this.size--;
			
		}

	}
	
	@Override
	public void insertAt(int index, T item) {
		// TODO: Implement this method
	
		if (this.size == this.capacity()) {
			
			this.resize(this.size);
			
		}
		
	  
		this.size++;

		for(int i = this.size-1; i > index; i--) {
			
		
			itemArray[i] = itemArray[i-1];
		}  
	   
	   
		itemArray[index] = item;
		

		
		
	}

	@Override
	public void insertAtTail(T item) {
		// TODO: Implement this method
		
		if (this.size == 0) {
			
			itemArray[0] = item;
			this.size++;
			
		} else {
	
		itemArray[this.size] = item;
		this.size++;

		}
		
		
		if (this.size == this.capacity()) {
			
			this.resize(this.size);
			
		}
		
		
	}

	@Override
	public void insertAtHead(T item) {
		// TODO: Implement this method
	
		if (this.size == this.capacity()) {
			
			this.resize(this.size);
			
		}
		
		this.size++;

		for(int i = this.size-1; i > 0; i--) {
			
		
			itemArray[i] = itemArray[i-1];
		}
		
		itemArray[0] = item;
		
		
	}


	@Override
	public T removeAtTail() {
		// TODO: Implement this method
		
		if (this.size == 0) {
			
			itemArray[0] = null;
			this.size--;
			
		} else {
	
		itemArray[this.size] = null;
		this.size--;

		}
		
		
		if (this.size == this.capacity()) {
			
			this.resize(this.size);
			
		}

		return null;
	}

	@Override
	public T removeAtHead() {
		// TODO: Implement this method
	
		for(int i = 0; i < this.size-1; i++) {
			
			itemArray[i] = itemArray[i+1];
		}
		
		this.size--;
		
		if (this.size == this.capacity()) {
			
			this.resize(this.size);
			
		}
		
		return null;
	}

	@Override
	public int find(T item) {
		// TODO: Implement this method
//		System.out.println(Arrays.toString(itemArray));
//		System.out.println(item);
		
		for(int i = 0 ; i < this.size-1; i++) {
			
			if (itemArray[i].equals(item))
				return i;
		}
		
		return -1;
	}

	@Override
	public T get(int index) {
		
		// TODO: Implement this method
		
		if (index < this.size && index >= 0) {
	
			return itemArray[index];
			
		} else {
			
			return null;
		}
	}

	/*
	 * This toString() method allow you to print a nicely formatted version of your Vector. E.g.
	 *     System.out.println( myVector );
	 * It uses utility methods in the Java Arrays library.
	 */
	@Override
	public String toString() {
//		return Arrays.toString(this.itemArray); // prints entire array from 0 to capacity-1
		return Arrays.toString(Arrays.copyOfRange(this.itemArray, 0, this.size)); // prints from 0 to size-1
	}

}
