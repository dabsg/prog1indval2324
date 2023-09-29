package variabler;

import java.util.Scanner;

public class Var2 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
		System.out.println("ange ett tal");
		
		int tal=input.nextInt();
		
		//int produkt = tal*tal;
		
		double produkt =Math.pow(tal, 2);
		
		System.out.println(tal+" upphöjt till 2 blir "+produkt);
		
	}

}
