package metoder;

public class KlassVariabel {

	static double PI=3.14;  // deklareras direkt i klassen har ordet static i sig
	
	
	public static double calcCirkelArea(int r) {
		
		double area=  (PI*r*r);
		
		return area;
	}
	
	public static void setPi(double newPi) {
		
		if(newPi<10 && newPi>0) {
		PI=newPi;
		}
	}
	
	public static void main(String[] args) {
		
		
		double area=KlassVariabel.calcCirkelArea(3);
		System.out.println(area);
		
		KlassVariabel.setPi(5);
		KlassVariabel.PI=12;
		
		area=KlassVariabel.calcCirkelArea(3);
		System.out.println(area);
		
		
	}
	
}
