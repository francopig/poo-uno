package claseinterfaces;

public class PuntoMain {
	public static void main(String[] args) {
		Punto punto1 = new Punto(1.0, 1.0);
		Punto punto2 = new Punto(3.2, 4.3);
		
		System.out.println(punto1);
		System.out.println(punto2);
		System.out.println("Distancia de p1 a p2: " + punto1.distancia(punto2));
		
		punto1.reset();
		System.out.println("Reseteo punto1 ");
		System.out.println(punto1);
		
		
		
		System.out.println("-------------------");
		//defino una variable r y con tipo de dato Reseteable
		//Se pueden almacenar objetos de tipo Punto y Puntuacion
		Reseteable r;
		
		r = new Punto(2.0, 3.0);
		r.reset();//contesta al mensaje reset como Punto
		System.out.println(r);
		
		r = new Puntuacion(1.5);
		r.reset();//contesta al mensaje reset como Puntuacion
		System.out.println(r);
		
		/*
		 * Esto también es polimorfimos, a partir de 
		 * una variable de un tipo determinado,
		 * yo le mando el mismo mensaje (reset) y contesta
		 * al mismo mensaje de forma diferente
		 * */
		
	}

}
 