package ovn;

import java.util.Scanner;

public class Ovn28 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("ange tecken");
		
		String teckenString=input.nextLine();
		
		
		 char t  =teckenString.charAt(0);
		
		 int teckenkod = t+32;
		 
		 char litetTecken= (char)teckenkod; 
		
		 System.out.println(litetTecken);
		
		
	}
	
	
}
