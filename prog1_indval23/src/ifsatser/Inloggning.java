package ifsatser;

import java.util.Scanner;

public class Inloggning {

	public static void main(String[] args) {
		
		String user="daniel";
		String pass="posche911";
		
		
		
		Scanner input = new Scanner(System.in);

		System.out.println("ange användarnamn");

		String username = input.nextLine();
		
		System.out.println("ange lösenord");

		String password = input.nextLine();
		
		if(user.equals(username) && pass.equals(password) ) {
			
			System.out.println("godkänt");
			
			
		}else {
			System.out.println("felaktigt användarnamn eller felaktigt lösenord eller både och ");
			
		}
		
		
	}
	
	
}
