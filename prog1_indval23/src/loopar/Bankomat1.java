package loopar;

import java.util.Scanner;

public class Bankomat1 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int val;
		do {
		
		System.out.println(" 1:uttag \n 2:insättning \n 3: saldo\n");
		
		val= input.nextInt();
		
		switch (val) {
		case 1: 
			System.out.println("du har valt uttag");
			break;
		case 2:
			System.out.println("du har valt insättning");
			break;
		case 3:	
			System.out.println("du har valt saldo");
			break;
		case 4:	
			System.out.println("du har valt avslut");
			break;
		default:
			System.out.println("felaktig inmatning");
		}
		
		}while(val!=4);
		
		
		
		
	}
}
