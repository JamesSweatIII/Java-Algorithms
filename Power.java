import java.util.Scanner;

// Name: James Sweat III
// Computing ID: jes9hd
// Homework Name: Module 1 - Power

public class Power {
	
	public static long power (int base , int exp) {
		
		int sum = 1;
		
		while (exp != 0) {
			
			sum = sum * base;
			exp--;
			
		}
		
		return sum;
	}



public static void main(String[] args) {

	Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	int base = myObj.nextInt();  
	int exp = myObj.nextInt();

	long x = power(base,exp);
	System.out.println(x);
	
	}

}
