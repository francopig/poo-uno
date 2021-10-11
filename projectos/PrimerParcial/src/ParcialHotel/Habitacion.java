package ParcialHotel;

/**
 * @author FrancoPignanelli
 */

public class Habitacion {
	
	//atributos
	private int mayores;
	private int menores;
	
	//constructor parametrizado
	public Habitacion(int mayores, int menores) {
		this.mayores = mayores;
		this.menores = menores;
	}
	
	//Métodos
	public boolean estaOcupada() {
		return this.mayores + this.menores > 0;
	}
	
	
	//Getters y setters

	public int getMayores() {
		return mayores;
	}

	public void setMayores(int mayores) {
		this.mayores = mayores;
	}

	public int getMenores() {
		return menores;
	}

	public void setMenores(int menores) {
		this.menores = menores;
	}
	
	
	
	

}
