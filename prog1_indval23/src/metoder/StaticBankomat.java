package metoder;

public class StaticBankomat {

	
	static int  saldo=100;
	
	public static void insättning(int belopp) {
		
		saldo = saldo + belopp;
		
	}
	public static int getSaldo() {
		
		return saldo;
	}
	public static String uttag(int belopp) {
		
		if( saldo >= belopp) {
			saldo = saldo-belopp;
			
			
		}else {
			
			return "inga likvidamedel";
		}
		return "allt ok du får ditt belopp";
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		int s=getSaldo();
		System.out.println(s);
		StaticBankomat.insättning(200);
		
		 s=getSaldo();
		System.out.println(s);
		
		String stext=StaticBankomat.uttag(1000);
		System.out.println(stext);
		
		s=getSaldo();
		System.out.println(s);
		
		
	}
	
	
}
