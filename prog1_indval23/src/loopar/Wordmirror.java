package loopar;

import javax.swing.JOptionPane;

public class Wordmirror {

	public static void main(String[] args) {
		
		 String ord =JOptionPane.showInputDialog("ange ett ord");
		
		 int l=ord.length();
		 String bak="";
		 
		 for(int i=l-1;i>=0;i--) {
			 
			// System.out.print(ord.charAt(i));
			 
			 bak=bak+ord.substring(i, i+1);
			 
			 //bak=bak+ord.charAt(i);
			 
			 System.out.println(bak);
			 
		 }
		
		 
		 
		 System.out.println("hej "+bak);
		 
	}
	
	
	
	
	
}
