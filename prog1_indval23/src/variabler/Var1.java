package variabler;

import java.util.Scanner;

public class Var1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("ange namn");
		
		String namn=input.nextLine();
		
		System.out.println("ange ålder");
		
		int ålder=input.nextInt();
		
		System.out.println("ange hur mycket pengar du har");
		
		double förmögenhet = input.nextDouble();
		
		
		System.out.println("ditt namn är"+namn+"din ålder är"+ålder+"pengar="+förmögenhet);
		
		
		
		
		
		
		
		
	}
	
	
	
}
