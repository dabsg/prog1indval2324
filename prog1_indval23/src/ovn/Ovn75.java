package ovn;

import java.util.Scanner;

public class Ovn75 {
public static void main(String[] args) {
	
	
	Scanner input = new Scanner(System.in);
	
	
	System.out.println("ange längd");
	
	double längd=input.nextDouble();
	
	System.out.println("ange vind");
	
	double vind=input.nextDouble();
	
	if(längd >7.92  && vind<=2  ) {
		
		System.out.println("grattis");
		
	}
	
	
	
}
}
