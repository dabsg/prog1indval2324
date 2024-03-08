package metoder;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CallByReference {

	
	public static void main(String[] args) {
		
		int [] a=new int[5];
		
		a[0]=2;
		a[1]=9;
		a[2]=5;
		a[3]=4;
		a[4]=23;
		
		eraseArr(a);
		System.out.println(Arrays.toString(a));
	}

	private static void eraseArr(int[] a) {
		
		for (int i = 0; i < a.length; i++) {
			
			a[i]= 0;
		}
		
		
	}
	
	
}
