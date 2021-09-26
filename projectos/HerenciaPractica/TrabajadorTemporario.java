package Herencia;

//TrabagadorTemporario ES UN trabajador
//con una duración especifica

public class TrabajadorTemporario extends Trabajador {
	//atributos
	private int duracionContrato;
	
	//Constructor
	 public TrabajadorTemporario(int dni, String nombre, double salario, int antiguedad) {
		 super(dni, nombre, salario, antiguedad);
		 this.duracionContrato = duracionContrato;
		
	 }
	 

}
