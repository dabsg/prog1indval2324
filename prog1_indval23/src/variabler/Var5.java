package variabler;

import javax.swing.JOptionPane;

public class Var5 {

	public static void main(String[] args) {
		
		char ettTecken= 'A';   // versal A
		
		int pos= ettTecken+32;   // omvandling till int 65  +32
		
		char litetTecken= (char)pos;   // omvandling till char, blir litet a
		
		System.out.println(litetTecken);
		
		JOptionPane.showMessageDialog(null, litetTecken);
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
