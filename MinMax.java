
import java.util.Arrays;
import java.util.Scanner;

// Name: James Sweat III
// Computing ID: jes9hd
// Homework Name: Module 1 - MaxMin

public class MinMax{
/*
* Given a list of integers , return the second largest value in that list
*/
	public static int secondMax (int [] numbers) {
	 // TODO : write the method body

		int length = numbers.length;
		
		
		if (length < 2) {
			
			return 0;	
		}
		
		int max = numbers[length-1];
		
		for (int i = length-2; i >= 0; i--) {
			
			if (max != numbers[i]){
				
				max = numbers[i];
				return max;
			}
		}
		
		return max;  

	}

	/*
	* Given a list of integers , return the second smallest value in that list
	*/

	public static int secondMin (int [] numbers) {
	  // TODO : write the method body
		int length = numbers.length;
		
		if (length < 2) {
			
			return 0;	
		}
		
		int min = numbers[0];
		
		for (int i = 1; i <= length-1; i++) {
			
			if (min != numbers[i]) {
				
				min = numbers[i];
				return min; 
			}
			
		}
		
		return min;
	}



	public static void main(String[] args) {


		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    int size = myObj.nextInt();
	    

		int [] list1 = new int[size];
	    
	    for (int i = 0; i < size; i++) {
		    
	  
	    	list1[i] = myObj.nextInt();  
	    	
	    }
	    
		Arrays.sort(list1);
	    
		
		int x = secondMax(list1);	
		int y = secondMin(list1);	
		
		System.out.println(x);
		System.out.println(y);


	}
}

