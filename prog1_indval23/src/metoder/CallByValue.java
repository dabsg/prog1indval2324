package metoder;

public class CallByValue {

	public static void main(String[] args) {
	
		int a=5;
		
		int svar=sum (a,10);
		System.out.println(a);
	}
	
	public static int sum (int a, int b ) {
		
		
		int s=a+b;
		a=1000;
		return s;
	}
	
	
	
	
}
