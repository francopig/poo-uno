package claseinterfaces;

public class Puntuacion implements Reseteable{
	//Atributos
	private double valor;
	
	//Constructor
	public Puntuacion (double valor) {
		this.valor = valor; 
	}
	
	//Metodos
	public void reset() {
		this.valor = 0.0;
	}

	@Override
	public String toString() {
		return "Puntuación[" + this.valor + "]"; 
	}
}
