package arr;

import java.util.Arrays;
import java.util.Scanner;

public class Arrinläsning {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int [] tal=new int [3];
		
		 tal[0] = input.nextInt();
		 tal[1] = input.nextInt();
		 tal[2] = input.nextInt();
		 
		 int summa = tal[0]+tal[1]+tal[2];
		
		 System.out.println(Arrays.toString(tal)+ "  "+summa);
		
	}
}
