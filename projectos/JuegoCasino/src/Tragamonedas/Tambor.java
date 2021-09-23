package Tragamonedas;

public class Tambor {

	private int posicion = 1; //atributo
	
	//hacemos el constructor
	//sirve para inicializar el objeto
	public Tambor () {
		this.posicion = 1;
	}
	
	
	
	/* post: devieñve el número de posición en la que se encuentra el Tambor.
	 * Es un valor comprendido entre 1 y 8
	 * */
	public int obtenerPosicion() {
		return this.posicion;
	}

	
	/*
	 * post: hace girar el tambor y luego se detiene en una posicion entre 1 y 8	
	 */	
	public void girar() {
		double aleatorio = Math.random();
		
		posicion = (int) (aleatorio * 8) + 1;
	
	}
}
 