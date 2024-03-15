package metoder;

public class Kryptering {

	
	static int [] key= {4,6,7,3,2}; 
	
	 public static void main(String[] args) {
		
		System.out.println( crypt("abcdef dsjksjfks sdfjnksj",key)   );
		 
	}
	
	
	
	public static String crypt(String text, int [] key) {
		
	String cryptText="";
		
	 int k= 0;
	
		for (int i = 0; i < text.length(); i++) {
			
		char c= (char)  (text.charAt(i)+key[k]);
		k++;	
		cryptText+= c;
		
		if(k==5) {
			
			k=0;
		}
		
		}
		return cryptText;
	}
	
	
	public static void deCrypt() {
		
		
	}
	
	
	
	
	
	
	
	
}
