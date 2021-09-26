package Herencia;


//En la herencia ponemos primero la subclase
//después la palabra reservada extends
//y luego el nombre de la superclase 
public class Trabajador extends Persona {
	//Atributos
	private double salario;
	private int antiguedad;

	
	//Constructor
	public Trabajador(int dni, String nombre, double salario, int antiguedad) {
		super(dni,nombre);//invoca al constructor de la clase persona
		
		this.salario = salario;
		this.antiguedad = antiguedad;
	}
	
	//Métodos
	public void trabajar() {
		System.out.println("TRABAJANDO ");
	}
	
	public void comer() {
		System.out.println("COMIENDO");
	}

}
