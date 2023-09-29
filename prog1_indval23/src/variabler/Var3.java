package variabler;

import javax.swing.JOptionPane;

public class Var3 {

	public static void main(String[] args) {
		
		
		String temp1s=JOptionPane.showInputDialog("ange en temperatur");
		
		double temp1=Double.parseDouble(temp1s);
		
		String temp2s=JOptionPane.showInputDialog("ange en temperatur");
		
		int temp2=Integer.parseInt(temp2s); 
		
		double medeltemp = ((temp1+temp2)/2.0);
		
		System.out.println("medel temp blir : "+medeltemp);
		
		
	}
	
}
