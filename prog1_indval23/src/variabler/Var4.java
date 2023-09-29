package variabler;

public class Var4 {

	public static void main(String[] args) {
		
		
		String förnamn= "daniel";
		String efternamn="andersson";
		
		String sammansatt= förnamn +" "+ efternamn;
		
		System.out.println(sammansatt);
		
		char c=sammansatt.charAt(2);
		
		System.out.println(c);
		 
		String text=sammansatt.substring(7);
		
		System.out.println(text);
		
		String text1=sammansatt.substring(0, 14);
		
		System.out.println(text1);
		
		int antaltecken=sammansatt.length();
		
		System.out.println(antaltecken);
		
		  int posMellan   =sammansatt.indexOf(' ');
		  
		  System.out.println(posMellan);
		
		
		
		
		
		
		
	}
	
	
	
	
}
