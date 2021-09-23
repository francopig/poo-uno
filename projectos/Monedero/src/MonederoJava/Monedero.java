package MonederoJava;
 
public class Monedero {
	/*
	 * Atributos
	 * 
	 * -> Privado: visible dentro de la clase donde
	 * se lo definio, en este caso, sol
	 */
	private Dinero dinero;

	/*
	 *Constructor 
	 * -> Se ejecuta al instanciar la clase
	 * ->Se usa para inicializar los atributos
	 */
	
	//Constructor parametrizado
	
	public Monedero(Dinero dineroInicial) {
		this.dinero = dineroInicial;
	}
	
	
	//Constructor por defecto/predeterminado
	public Monedero() {
		this.dinero = null;
	}
	
	/*
	 * Métodos
	 */
	public double consultarDinero() {
		return this.dinero.getMonto();
	}
	
	public void sacarDinero(double monto) {
		if (monto > 0 && monto <= this.dinero.getMonto())
			this.dinero.setMonto(this.dinero.getMonto() - monto);
	}
	
	public void ponerDinero(double monto) {
		if (monto > 0)
			this.dinero.setMonto(this.dinero.getMonto() + monto  );
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
