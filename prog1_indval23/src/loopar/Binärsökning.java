package loopar;

public class Binärsökning {

	public static void main(String[] args) {
		
		
		int [] arr= {3,5,6,45,56,78,98}; 
		
		int sökttal=78787;
		int start=0;
		int slut= arr.length-1;
		
		boolean finns= false;
		int mitt = (start+slut)/2;
		
		while( slut-start>=0) {
			
			System.out.println("mitt" +mitt);
			
			if( arr[mitt]== sökttal) {
			
				System.out.println("sökttal finns på pos "+mitt);
				finns=true;
				break;
			}
			if(sökttal<arr[mitt]) {
				
				slut= mitt-1;
				
			}
			if(sökttal>arr[mitt]) {
				
				start=mitt+1;
			}
			
			mitt=(start+slut)/2;
			
		}
		
		if(finns==false) {
		System.out.println("talet finns ej");
		}
		
		
	}
	
	
}
