package MonederoJava;

public class Dinero {
	//Atributos
	private String codigoISO;
	private String nombre;
	private double monto;
	
	//Constructor
	public Dinero (String codigoISO, String nombre, double monto) {
		this.codigoISO = codigoISO;
		this.nombre = nombre;
		this.monto = monto;
	}
	
	//Métodos getters y setters
	public double getMonto() {
		return this.monto;
	}
	
	public void setMonto(double monto) {
		this.monto = monto;
	}

}
