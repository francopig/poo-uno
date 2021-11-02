package ejerciciocirculo;

public class Circulo {
	
	//atributos
	private double radio;	
	
	//constructor
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	//metodos
	
	public double obtenerRadio() {
		return radio;
	}
	
	public void cambiarRadio(double radioNuevo) {
		radio = radioNuevo;
	}
	
	
	public double obtenerPerimetro() {
		return 2 * Math.PI * radio;
	}
	
	public double obtenerSuperficie() {
		return Math.PI  * Math.pow(radio, 2);
	}
	
	public double obtenerDiametro() {
		return 2 * radio;
	}

}
