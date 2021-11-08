package paridad;

public class Paridad {
	public static boolean esPar(int n) {
		return (n % 2 == 0);
	}
	
	public static void main(String[] args) {
		int numero1 = 5;
		int numero2 = 6;		
		
		System.out.println(esPar(numero1));
		System.out.println(esPar(numero2));
		System.out.println(esPar(13));
	}
}
