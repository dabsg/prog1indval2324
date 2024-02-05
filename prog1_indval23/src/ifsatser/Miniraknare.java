package ifsatser;

import java.util.Scanner;

public class Miniraknare {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("ange ett tal");
		double tal1 = input.nextDouble();

		System.out.println("ange ett tal två");
		double tal2 = input.nextDouble();

		System.out.println("ange tecknet + ,- ,/ eller *");

		String räknesätt = input.next();

		System.out.println(räknesätt);

		char r = räknesätt.charAt(0);

		if (r == '+') {
			double svar = tal1 + tal2;
			System.out.println(svar);
		} else if (r == '-') {
			double svar = tal1 - tal2;
			System.out.println(svar);
		} else if (r == '*') {
			double svar = tal1 * tal2;
			System.out.println(svar);
		}

	}

}
