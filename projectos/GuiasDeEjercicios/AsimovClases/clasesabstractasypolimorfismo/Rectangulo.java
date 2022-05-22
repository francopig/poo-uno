package clasesabstractasypolimorfismo;

public class Rectangulo extends Figura {

	//Constructor
	public Rectangulo(String nombre, double base, double altura) {
		super(nombre, base, altura);
		//con super invocamos al constructor de la clase Figura(superclase)
	}
	
	
	//Metodos
	
	@Override //esto porque sobreescribo los métodos
	public double calcularArea() {
		return this.getBase() * this.getAltura();
	}


	
	@Override
	public double calcularPerimetro() {
		return 2 * this.getBase() + 2 * this.getAltura();
	}
	
	
}
