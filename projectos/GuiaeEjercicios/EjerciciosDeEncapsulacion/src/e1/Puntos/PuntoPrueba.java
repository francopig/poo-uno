package e1.Puntos;

public class PuntoPrueba {
	public static void main(String[] args) {
		Punto punto1 = new Punto(100.0, 200.0);
		Punto punto2 = new Punto(400.0, 800.0);
		
		System.out.println("Distancia: " + calcularDistancia(punto1,punto2));
		
		
	}
		

		//hay que arreglar esta poronga
	public static double calcularDistancia(Punto p1, Punto p2) {
		return Math.sqrt(Math.pow((p2.x - p1.x), 2) - Math.pow((p2.y - p1.y) , 2));
	}
}	

