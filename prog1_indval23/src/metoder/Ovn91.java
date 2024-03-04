package metoder;

public class Ovn91 {

	public static void main(String[] args) {
		
		int r=2;
		double nyArea=Ovn91.areaCirkel(r);
		System.out.println("arean blir"+nyArea);
	    double volym=volymCylinder(2, 2);     
	    System.out.println("volym blir"+volym);
	}
	
	public static double areaCirkel(int r) {
		
		double area= Math.PI*r*r;
		//System.out.println(area);
		return area;
	}
	public static double volymCylinder(int r , int h) {
		
		double volym = Math.PI*r*r*h;
		return volym;
	}
	
}
