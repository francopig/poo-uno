package clasesabstractasypolimorfismo;

public class FiguraMain {
	public static void main(String[] args) {
		
		//Crear un rectangulo "R2" con 4 de base y 5 de altura
		Rectangulo r2 = new Rectangulo("Rectangulo 2", 2, 5);
		System.out.println("R2 area: " + r2.calcularArea());
		
		
		// f es un objeto polimorfico (puede tomar varias formas)
		//Figura f; puedo declarar una variable de tipo Figura
		//Figura f = new Figura(); instaciar no se puede porque es abstracta
		
		//Dentro de f puedo almacenar objetos de diferentes tipos
		Figura f = new Rectangulo("Rectangulo 3", 3, 4);	
		System.out.println("R3 area: " + f.calcularArea());
		
		f = new Triangulo("Triangulo1", 2, 2, 3,4,5);
		System.out.println("Triangulo1 area: " + f.calcularArea());
		

		//podemos apreciar el polimorfismo porque primero calcula el area
		//como un triangulo y después como un triangulo
	}
}
 