package clasesabstractasypolimorfismo;

public abstract class Figura {
	/*
	 * Figura es una clase abstracta ya que la implementacion
	 * no est� completa: 
	 * Tenemos una parte de la clase que no sabemos
	 * c�mo se comporta, osea que hay al menos 1 metodo
	 * que no sabemos lo que hace.
	 * adem�s, las clases abstractas no se pueden instanciar
	 * */
	
	
	//atributos
	private String nombre;
	private double base;
	private double altura;
	
	//constructor
	public Figura(String nombre, double base, double altura) {
		this.nombre = nombre;
		this.base = base;
		this.altura = altura;
	}
	
	//m�todos abstractos (no estan 100% definidos)
	public abstract double calcularArea();
	public abstract double calcularPerimetro();
	
	//getters para poder acceder a los atributos privados
	public double getBase() {
		return base;
	}
	
	public double getAltura() {
		return altura;
	}
	
	
}
