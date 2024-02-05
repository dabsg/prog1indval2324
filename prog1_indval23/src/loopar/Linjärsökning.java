package loopar;

import java.util.Arrays;

public class Linjärsökning {
	public static void main(String[] args) {

	//int i[]=new int[5]; // deklarering av array
	
	int k[]= {2,4,5,3,2,1,2,3,32,222,2,2,2,2,2};
	

//	for(int j=0; j<i.length;j++) {
//		
//		i[j]=(int) ( 8*5*Math.sin(j)+Math.cos(j));
//		
//	}
		
	System.out.println(Arrays.toString(k));
	
	int sökttal=2;
	int antalggr=0;
	
	for (int j = 0; j < k.length; j++) {
		if( k[j]  ==sökttal) {
			antalggr++;
			System.out.println( sökttal +"finns på plats"+j);
			
		}
		
		
	}
	
	System.out.println(sökttal+ "förekommer"+antalggr+"ggr");
	
	
	}
}
