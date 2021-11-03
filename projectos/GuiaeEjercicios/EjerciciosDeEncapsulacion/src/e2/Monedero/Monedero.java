package e2.Monedero;

public class Monedero {

	//atributos
	private int dinero;
	
	
	//constructor
	public Monedero (int dinero) {
		this.dinero = dinero;
	}
	
	
	//metodos
	public void meterDinero(int n) {
		if(n > 0) {
			dinero += n;
		}else {
			System.out.println("Solo se pueden agregar montos mayores a 0");
		}
	}
	
	public void sacarDinero(int n) {
		if((n > dinero) || (n < 0)) {
			System.out.println("Operacion invalida");
		}else {
			dinero -= n;
		}
	}
	
	public void consultarDinero() {
		System.out.println("Dinero disponible: " + dinero);
	}
	
}
