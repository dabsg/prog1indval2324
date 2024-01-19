package ifsatser;

import java.util.Scanner;

public class Försäkring {
	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ange ålder på din bil");
		
		double ålder = input .nextInt();
		
		
		if( ålder>=10) {
			
			System.out.print("trafikförsäkring");
			
		}else if(ålder>=5  &&  ålder<10   ) {
			
			System.out.println("halvförsäkring");
		}else {
			
			System.out.println("helförsäkring");
		}
		
		
	}
}
