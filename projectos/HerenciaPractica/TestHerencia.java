 package Herencia;

public class TestHerencia {
	public static void main(String[] args) {
		
		//creamos un trabajador instanciando a la clase trabajador
		//a su vez extiende a la clase persona
		Trabajador t = new Trabajador(11222333,"Lucas", 10580.55,4);//dni-name-salario-antiguedad
		
		//t.trabajar();
		
		//comer y dormir son métodos heredados de la clase persona  
		//t.comer();
		//t.dormir();
		
		
		TrabajadorTemporario tt = new TrabajadorTemporario(11222333,"Lucas",500.50, 3);
		tt.trabajar();
		tt.dormir();
		tt.comer();
		
	}

}