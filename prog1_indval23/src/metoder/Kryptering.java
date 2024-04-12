package metoder;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Kryptering {

	
	static int [] key= {4,6,7,3,2}; 
	
	 public static void main(String[] args) {
		
		 String c=crypt("abcdef dsffdfd",key);
		
		 PrintWriter p = null;
		try {
			 p = new PrintWriter("text.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		p.print(c);
		p.close();
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
