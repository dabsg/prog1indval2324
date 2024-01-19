package ifsatser;

import java.util.Scanner;

public class Switchcase {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println(" 1:uttag \n 2:insättning \n 3: saldo\n");
		
		int val= input.nextInt();
		
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
		default:
			System.out.println("felaktig inmatning");
		}
		
		
		
		
		
		
	}
}
