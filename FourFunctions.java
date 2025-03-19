
// Name: James Sweat III
// Computing ID: jes9hd
// Homework Name: Module 1 - FourFuctions

public class FourFunctions {
	
	public static int evenSumSplit (int[] numbers ) {
		
		int sum = 0;
		
		for (int i = 0; i <= numbers.length-1; i++) {
			
			sum += numbers[i];
		
		}
		
		int target = sum / 2;
		int pivot = 0;
		
		if (sum % 2 == 0) {
		
			for (int i = 0; i <= numbers.length-1; i++) {
				
				if (pivot != target) {
					
					pivot += numbers[i];
					
				} else {
					
					return i-1;
				}
				
			}
		
		}
		
		return -1;
	}
	
	public static boolean just8and9(int [] numbers) {
		
		int count = 0;
		int length = numbers.length;
		
		for (int i = 0; i <= numbers.length-1; i++) {
			
			if (numbers[i] == 9 || numbers[i] == 8 ) {
				
				count++;		
			}
			
		}
		
		if (count == length) {
		
			return true;
		}
		
		return false;
		
	}
	
	public static int countRuns ( int[] numbers ) {
		
		int runs = 0;
		int target = numbers[0];
		boolean inRun = false;
		
		for (int i = 1; i <= numbers.length-1; i++) {
			
			if (numbers[i] == target & inRun == false) {
				
				runs += 1;
				target = numbers[i];
				inRun = true;
				
			} else if (numbers[i] != target) {
				
				target = numbers[i];
				inRun = false;
				
			}
		}
		
		return runs;
	}
	
	public static int sum67 ( int[] numbers ) {
		
		int sum = 0;
//		int target = 6;
		boolean count = true;
		
		for (int i = 0; i <= numbers.length-1; i++) {
			
			if (numbers[i] != 6 & count == true) {
				
				sum += numbers[i];
			
			} else if (numbers[i] == 6)	{
				
				count = false;
				
			} else if (numbers[i] == 7 & count == false) {
				
				count = true;
			}
		
		}
		return sum;

	}
	
	public static int mode ( int[] numbers ) {
		
		int mode = 0;
		int max = 0;
		
		for (int n = 0; n < numbers.length; n++) {
			
			int count = 0;
			
			for (int p = 0; p < numbers.length; p++) {
			
				if (numbers[p] == numbers[n]) {
//					
					count++;
				}
			}
			
			if (count > max) {
					
				max = count;
				mode = numbers[n]; 
			}
		}
		
		return mode;
	}
	
	public static void main(String[] args) {
		
		int [] list1 = {1,1,1,2,1};
		int w = evenSumSplit(list1);
		
		int [] list2 = {8,9};
		boolean x = just8and9(list2);
			
		int [] list3 = {1, 1, 2, 2, 1, 1};
		int y = countRuns(list3);
		
		int [] list4 = {1,1,6,7,2};
		int z = sum67(list4);
		
		int [] list5 = {2,1};
		int a = mode(list5);

		
	}
	
}

