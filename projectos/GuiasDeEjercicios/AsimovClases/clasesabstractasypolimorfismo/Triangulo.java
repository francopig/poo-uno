package clasesabstractasypolimorfismo;

public class Triangulo extends Figura {
	
	//atributos
	private double lado1;
	private double lado2;
	private double lado3;
	
	
	//Constructor
	//podrimoas conseguir el lado del triangulo a partir de la base y altura
	//utilizando t.pitagoras pero alta paja
	public Triangulo(String nombre, double base, double altura, double l1, double l2, double l3) {
		super(nombre,base, altura);
		this.lado1 = l1;
		this.lado2 = l2;
		this.lado3 = l3;
	}
	
	//metodos 
	
	@Override
	public double calcularArea() {
		return (this.getBase() * this.getAltura()) / 2;
	}
	
	@Override
	public double calcularPerimetro() {
		return lado1 + lado2 + lado3;
	}

}
