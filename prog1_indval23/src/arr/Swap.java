package arr;

import java.util.Arrays;

public class Swap {

	public static void main(String[] args) {
		
		
		String [] ord=new String[3];
		
		ord[0]="Hej";
		ord[1]="katt";
		ord[2]="hund";
		
		
		String temp= ord[0];
		
		ord[0]= ord[2];
		ord[2]=temp;
		
		System.out.println(Arrays.toString(ord));
		
		
		
		
		
		
	}
	
	
	
	
}
