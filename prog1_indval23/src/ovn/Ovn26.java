package ovn;

import java.util.Scanner;

public class Ovn26 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("ange ditt namn:");
		
		String fullname=input.nextLine();    // daniel andersson 
		
		int mellan=fullname.indexOf(' ');
		
		String förnamn= fullname.substring(0, mellan);
		
		String enamn = fullname.substring(mellan+1);
		
		System.out.println(förnamn+ " "+enamn );
		
		
		
	}
}
