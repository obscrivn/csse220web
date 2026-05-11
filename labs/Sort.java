package sort;

public class Sort {

	public static void main(String[] args) {

	}
	
	public static void selection(int[] arr) {
		// Step 1:
		// Outer Loop (look for the smallest value)
		for (int i = 0; i < arr.length; i++) {
			
			// Assume the current position contains the smallest value.
			int minIndex = i;  
			
			//Step 2:
			// Inner Loop (scan the REST of the array looking for an even smaller value)
			for (int j = i+1; j < arr.length; j++) {
			
			// Step 3:
			// Compare current value against the smallest found so far
				if (arr[j] < arr[minIndex]) {
				minIndex = j;
			}
		}
		
		// Step 4:
		// Swap the smallest value into the correct position	
		int temp =	arr[i];
		arr[i] = arr[minIndex];
		arr[minIndex] = temp;
	
	}
	}
	
	public static void insertion(int[] arr) {
		// Step 1:
	    // Start at index 1
	    // Treat the LEFT side as the sorted portion.
		for (int i = 1; i < arr.length; i++) {
			
			// Step 2:
	        // Store the current value we want to insert
	        // into the sorted position.
			int valueToInsert = arr[i];
			
			// Step 3:
	        // Start checking values to the LEFT
			int j;
			
			// Move backward through the sorted section.
			for (j = i-1; j >=0; j--) {
				
				// Step 4:
	            // If the left value is bigger,
	            // shift it one position to the right.
				if (arr[j] > valueToInsert) {
					arr[j+1] = arr[j];
				}
				else {
					break;
				}
				
			}
			// Step 5:
	        // Insert the value into the open position.
			arr[j+1] = valueToInsert;
		}	
	}
		
}
