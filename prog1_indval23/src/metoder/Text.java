package metoder;

public class Text {

	public static void main(String[] args) {

		String svar = Text.StringTest("hejjjjjj", "hej då");

		System.out.println(svar);
		
		
		System.out.println(   Text.slumpOrd(3)   );
		
	}

	public static String StringTest(String a, String b) {

		int aLength = a.length();

		int bLength = b.length();

		if (aLength == bLength) {
			return "lika";
		}

		if (aLength < bLength) {

			return b;
		} else {

			return a;
		}

	}

	public static String slumpOrd(int tecken) {
		
		String ord="";
		
		for(int i=0; i<tecken;i++) {
		
		int tal = (int) (  26* Math.random()+65);
		char c = (char) tal;
		
		ord=ord+c;
		
		}
		
		
		return ord;
		
	}
	
	
	
}
