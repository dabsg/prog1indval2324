package metoder;

public class MinValueInArray {
	
	
	public static void main(String[] args) {
		int []arr = {45,4,56,2,56,7};
	
		findMin(arr);
	}

	public static void findMin(int arr[]) {
		
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]<min) {
				
				min=arr[i];
				
			}
						
		}
		System.out.println(min);
	}


}
