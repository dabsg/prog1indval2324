package ovn;

import java.util.Scanner;

public class Ovn27 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("ange tecken");
		
		String teckenString=input.nextLine();
		
		
		 char t  =teckenString.charAt(0);
		
		 int teckenkod = t;
		 
		 System.out.println("Tecknet "+ t+ " har teckenkoden"+ teckenkod );
		 
		
		
		
		
	}
	
	
}
