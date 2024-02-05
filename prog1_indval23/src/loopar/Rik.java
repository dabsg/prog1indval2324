package loopar;

public class Rik {

	public static void main(String[] args) {
		
		
		int förmögenhet=0;
		int lön=1;
		int dagar=0;
		
		
		while(förmögenhet<1000000) {
			
			förmögenhet=förmögenhet+lön;
			lön=lön*2;
			dagar++;
			System.out.println(dagar+" lön"+ lön+"förmögenhet"+förmögenhet);
			
		}
		System.out.println(dagar);
		
		
		
	}
	
	
}
