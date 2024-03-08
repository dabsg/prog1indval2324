package metoder;

public class Textbehandling {

		public static boolean palindromTest(String ord) {

		String backWards = "";

		for (int i = ord.length() - 1; i >= 0; i--) {

			backWards = backWards + ord.charAt(i);

		}

		System.out.println(backWards);
		
		if(ord.equals(backWards)){
			
			return true;
		}
		return false;
	}

}
