package loopar;

import java.util.Scanner;

public class ovn87 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String sätt;
		
		do {
		System.out.println("ange räknesätt eller a för avslut ");

		 sätt = sc.nextLine();

		if(sätt.equals("a")) {
			
			break;
		}
		
		
		System.out.println("ange tal1 ");

		String tal1s = sc.nextLine();
		
		int tal1=Integer.parseInt(tal1s);

		System.out.println("ange tal2 ");

		String tal2s = sc.nextLine();
		
		int tal2=Integer.parseInt(tal1s);
			
		if(sätt.equals("+")) {
			System.out.println("svar="+ (tal1+tal2));
		}else if(sätt.equals("-")){
			
		}else if(sätt.equals("/")){
		
		}else if(sätt.equals("*")){
		
		}
		
		
		}while(!sätt.equals("a"));
		
		
	}
}
