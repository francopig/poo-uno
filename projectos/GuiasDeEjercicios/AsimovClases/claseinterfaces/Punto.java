package claseinterfaces;

public class Punto implements Reseteable {
	//atributos
	private double x;
	private double y;
	
	//Constructor parametrizado
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	//Constructor por defecto (crea un punto en el origen)
	public Punto() {
		this(0.0,0.0);
		/*es lo mismo que 
		 * this.x = 0.0;
		 * this.y = 0.0;
		 * */
	}
	
	@Override
	public void reset() {
		this.x = 0.0;
		this.y = 0.0;
	}
	
	
	//calcula la distancia entre los puntos
	public double distancia(Punto o) {
		return Math.hypot(o.x - this.x, o.y - this.y);
	}
	
	@Override
	public String toString() {
		return "Punto["+ this.x + " , " + this.y + "]";
		
	}
}
