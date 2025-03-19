package sorting;

public class SortingAlgorithms {

	/*
	 * Swaps the elements and indices i and j in list
	 * */
	private static <T> void swap(T[] list, int i, int j) {
		if (i < 0 || i >= list.length)
			return;
		if (j < 0 || j >= list.length)
			return;
		T temp = list[i];
		list[i] = list[j];
		list[j] = temp;
	}
	
	// ####################
	// ## INSERTION SORT ## ----------------------------------------------------------------------
	// ####################
	// ## IMPORTANT: the code we've given you below has a small bug!
	// ##   You will need to look at this code and/or test, and fix the bug.
	// ####################
	/**
	 * Usually a slow sorting algorithm. Insertion sort. 
	 * @param list - An array of items
	 */
	public static <T extends Comparable<T>> void insertionSort(T[] list) {
		for (int i = 1; i < list.length; i++) {
			T val = list[i];
			int j = i - 1;
			while (j >= 0 && val.compareTo(list[j]) < 0) {
				list[j+1] = list[j];
				j--;
			}
			list[j+1] = val;
		}
	}
	
	
	// ################
	// ## MERGE SORT ## ----------------------------------------------------------------------
	// ################	
	/**
	 * Recursive Merge sort and associated helper method.
	 * The second method below provides the portion of the array
	 * (i.e., index i to j inclusive) that we want to sort.
	 * 
	 * @param list - An array of items
	 */
	public static<T extends Comparable<T>> void mergeSort(T[] list) {
		mergeSort(list, 0, list.length - 1);
	}
	public static<T extends Comparable<T>> void mergeSort(T[] list, int i, int j) {
		//TODO: write the body of this method
		
		if (i < j) {
			
			int mid = i + (j-i) / 2; 
			mergeSort(list, i, mid);
			mergeSort(list, mid+1, j);
			merge(list, i, mid, j);
			
		}
		
	}
	
	/**
	 * Merge method for Merge Sort algorithm.
	 * Your mergeSort algorithm will call this method as appropriate to do the merging.
	 * @param list - An array of items
	 * @param i - lower bound index
	 * @param mid - middle index
	 * @param j - upper bound index 
	 */
	public static<T extends Comparable<T>> void merge(T[] list, int i, int mid, int j) {
		//TODO: write the body of this method
		
		int one =  mid - i + 1;
		int two = j - mid;
		
		@SuppressWarnings("unchecked")
		T[] left = (T[]) new Comparable[one];
		
		@SuppressWarnings("unchecked")
		T[] right = (T[]) new Comparable[two];
		
		 for (int d = 0; d < one; d++) {
	            left[d] = list[i + d];
		 }
		 
	     for (int w = 0; w < two; w++) {
	            right[w] = list[mid + 1 + w];
	     }
		
		
	    int a = 0, b = 0, c = i;
	     
        while (a < one && b < two) {
            if (left[a].compareTo(right[b]) < 0 || left[a].compareTo(right[b]) == 0) {
                list[c] = left[a];
                a++;
            }
            else {
                list[c] = right[b];
                b++;
            }
            c++;
        }
 

        while (a < left.length) {
            list[c] = left[a];
            a++;
            c++;
        }
 
  
        while (b < right.length) {
            list[c] = right[b];
            b++;
            c++;
        }
	     
		//Reminder: when using a generic type, to create a new array to hold items of type T,
		//  you do something like the following:
		@SuppressWarnings("unchecked")
		T[] merged = (T[]) new Comparable[j-i+1]; // space for new merged list to hold (sorted) sublist

	}

	
	// ###############
	// ## QUICKSORT ## ----------------------------------------------------------------------
	// ###############	
	/**
	 * Recursive Quicksort and associated helper method.
	 * The second method below provides the portion of the array
	 * (i.e., index i to j inclusive) that we want to sort.
	 * >>> Use any partition scheme that you like. 
	 * 
	 * @param list - An array of items
	 */
	public static<T extends Comparable<T>> void quickSort(T[] list) {
		quickSort(list, 0, list.length - 1);
	}
	public static<T extends Comparable<T>> void quickSort(T[] list, int i, int j) {
		//TODO: write the body of this method
		if (i < j) {
			
			int part = partition(list, i, j);
			quickSort(list, i, part-1);
			quickSort(list, part+1, j);	
		}
	}
	
	/**
	 * Partition method for Quicksort - Use any valid partition algorithm that you like.
	 * Your quickSort algorithm will call this method as appropriate to do the partitioning.
	 * @param list - An array of items
	 * @param i - lower bound
	 * @param j - upper bound
	 */
	public static<T extends Comparable<T>> int partition(T[] list, int i, int j) {	
		//TODO: write the body of this method
		T pivot = list[j];
		int index = i - 1;
		
		for(int k = i; k <= j - 1 ; k++) {
			if (pivot.compareTo(list[k]) > 0) {
				index++;
				swap(list, index, k);
			}
			
		}
		swap(list, index+1, j);
		return index + 1; // be sure to return the right value and not 0
	}
	
	//=================================================================================
	
//	public static void main(String[] args) {
//		// TODO:  If you wish to do your own kind of testing
//
//	}

}