package main;

import java.util.Vector;

public class BigOh {
	// Note: that each method has a default return value, you *must* change 
	// this as you write your solution (i.e., don’t keep “return 0”, for example, 
	// change it to the appropriate thing to return based on the method).  
	
	/* Binary Search: Should run in Theta(logn) time */
	/* Returns true if item is in the array a */
	public static boolean binarySearch(int[] a, int item) {
		//TODO: IMPLEMENT THIS METHOD
		//Set int variablew "min" to zero, and "max" to a.length-1 (last index)
		int min = 0;
		int max = a.length-1;
		// Continue while min is less than or equal to max
		while(min <= max) {
			//middle = middle element between min and max [Do this: (min+max)/2;]
			int middle = (min+max)/2;
			//if middle element is the item, then found !
			if(a[middle] == item) {
				
				return true;
				
			}
			//if item is less than middle element
			if(a[middle] > item) {
				//repeat search between min and middle-1
				max = middle-1;
			}
				
			//if item is more than middle element
			if(a[middle] < item) {
			//repeat search between middle+1 and max
				min = middle+1;
			}
					
		//If this loop exits, then the item was not found
			if(min > max) {
				return false;
			}
		}
		
		return false;
	}

	
	/* Max value in array: Should run in Theta(n) time */
	public static int max(int[] a) {
		//TODO: IMPLEMENT THIS METHOD
		//Remember to use a for-loop here!
		int max = 0;
		for(int i = 0; i <= a.length-1; i++) {
			
			if(a[i] > max) {
				
				max = a[i];
				
			}
		}
		return max;
	}

	
	/* Calls binary search n times. Counts number of successful searches */
	/* You should search for the numbers 1 through n in succession */
	/* Should run in Theta(nlogn) time */
	public static int multipleBinarySearch(int[] a) {
		//TODO: IMPLEMENT THIS METHOD
		int count = 0;
		//Create a for-loop that runs n times, where n is the size of the input array
		for (int i = 0; i <= a.length-1; ++i) {
		//  Call binarySearch within the loop, if it returns true, increment a counter
		//  Updated 10/7: search for each value a[i] in the array in succession
			if(binarySearch(a, a[i])) {
				count++;	
			}
		}
		//Return the counter 
		return count;
	}

	
	/* Counts pairs of numbers whose sum is multiple of 5 */
	/* Should run in Theta(n^2) time */
	public static int allPairs(int[] a) {
		//TODO: IMPLEMENT THIS METHOD
		int count = 0 ;
		//Create two (2) nested for-loops that go from 0 to the end of the array
		for (int i = 0; i <= a.length-1; ++i) {
			  // inner loop
			  for(int j = 0; j <=a.length-1; ++j) {
			    
				  if((a[i] + a[j]) % 5 == 0 && (a.length >= 1)){
					  
					  count++;
					  
				  }
				  
			  }
		}
		//These become two indices into the array (use to compare two elements)
		//You now are able to compare all pairs, check if the sum of two numbers is a 
		// multiple of 5. If so, increment a counter
		//Return the counter		
		return count;
	}

	
	/* Counts the pairs of three in the list a,b,c in which a+b=c */
	/* Should run in Theta(n^3) time */
	public static int allTriads(int[] a) {
		//TODO: IMPLEMENT THIS METHOD
		//Similar strategy to the "allPairs method.
		int count = 0;
		//Create three (3) nested for-loops
		for (int i = 0; i <= a.length-1; ++i) {
			  // inner loop
			  for(int j = 0; j <=a.length-1; ++j) {
				// inner loop
				  for(int k = 0; k <=a.length-1; ++k) {
					  
					  
					  if(((a[i] + a[j]) == a[k]) && (a.length >= 1))  {
						  
						  count++;
						  
					  }
					  
				  }
			  }
		}
		//Comparing three items in the list (a, b, and c), check if a+b=c. 
		// If so, increment a counter
		return count;
	}

		
	/* Finds all subsets of a */
	/* Should run in Theta(2^n) time */
	/* e..g, {1,2,3} would print {},{1},{2},{3},{1,2},{1,3},{2,3},{1,2,3} */
	public static void allSubsets(int[] a, int i, Vector<Integer> sol) {
		if(i >= a.length) {
			//Found another subset, but not printing because printing is really slow.
			return;
		}		
		allSubsets(a, i+1, sol);
		sol.add(a[i]);
		allSubsets(a, i+1, sol);
		sol.remove(sol.size()-1);
	}

}
