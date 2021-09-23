package MonederoJava;

public class TestMonedero {
	public static void main(String[] args) {
		
		
		//variable de tipo dinero, le asigno el objeto creado
		Dinero d = new Dinero("ARS", "Pesos argentinos", 22.5);
		
		Monedero m1 = new Monedero(d);	
	    System.out.println("El monedero m1 tiene: $"
			+ m1.consultarDinero());//22.5
	    
	    m1.sacarDinero(22.5);
	    
	    System.out.println("El monedero tiene: $" + m1.consultarDinero()); //0
	    
	    m1.ponerDinero(400.8);
	    
	    System.out.println("El monedero m1 tiene: $" + m1.consultarDinero());//400.8
		 
		 
	}
	
}
