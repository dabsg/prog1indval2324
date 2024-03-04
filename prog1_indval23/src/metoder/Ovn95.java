package metoder;

public class Ovn95 {

	public static void main(String[] args) {
		
		mönster(10, 100);
		
	}
	
	public static void mönster(int rader, int kolumner) {
		
		for (int i = 0; i < rader; i++) {
			for (int j = 0; j < kolumner; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
