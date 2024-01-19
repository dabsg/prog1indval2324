package ifsatser;

import java.util.Scanner;

public class Förbrukning {
	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		
		System.out.println("ange förbrukning");
		
		double förbrukning = input .nextDouble();
		
		if(förbrukning< 0.5) {
			
			System.out.print("låg förbrukning");
			
		}else {
			
			System.out.println("hög förbrukning ");
			
		}
		
		
		
		
		
	}

}
