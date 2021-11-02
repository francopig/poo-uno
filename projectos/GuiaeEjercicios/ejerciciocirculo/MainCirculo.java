package ejerciciocirculo;

public class MainCirculo {
	public static void main(String[] args) {
		
		Circulo circulito = new Circulo(2);
		
		System.out.println("Radio: " + circulito.obtenerRadio());
		circulito.cambiarRadio(5);
		System.out.println("Radio actual: " + circulito.obtenerRadio());
		System.out.println("Perimetro: " + circulito.obtenerPerimetro());
		System.out.println("Superficie: " + circulito.obtenerSuperficie());
		System.out.println("Diametro: " + circulito.obtenerDiametro());
		
	}
}
