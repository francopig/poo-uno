package Herencia;


/* CONSIGNA (EJEMPLO HERENCIA)
 * Todas las personas se caracterizan por su DNI y su nombre.
 * Además, pueden comer y dormir (informar esto x pantalla)
 * Un trabajador es una persona que además tiene salario y antiguedad
 * Los trabajadores pueden trabajar (informar esto x pantalla)
 * Un estudiante es una persona con un promedio, que puede estudiar (informar esto x pantalla)
 */

public class Persona {
	//atributos de la clase
	private int dni;
	private String nombre;
	
	
	//Constructor
	public Persona(int dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}
	
	//Metodos
	
	//getters para el atributo dni y otro para el nombre
	public int getDni() {
		return this.dni;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	
	
	/*El nivel de acceso protected
	 * hace que el elemento sea visible desde
	 * la clase donde se lo definió
	 * y desde sub-clases
	 * */
	protected void dormir() {
		System.out.println("PERSONA durmiendo");
	}

	public void comer() {
		System.out.println("PERSONA comiendo");
	}
}
 