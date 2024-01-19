package arr;

import java.util.Arrays;

public class Arr1 {
	public static void main(String[] args) {

	int [] i=new int[3]; // deklarerar array av datatypen int samt skapar array.
	
	i[0]=5;
	i[2]=3; // tilldelar värde till position 2 i array
	
	
	System.out.println(i[0] +" "+ i[1]+" "+ i[2]);  // skriver ut värden
	
	System.out.println(Arrays.toString(i)); // utskrift för felsökningssyfte.
	
	for(int k=0; k<3; k=k+1) {
	
		System.out.println(i[k]);
		
	}
	
	
	}
}
