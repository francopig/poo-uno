package ejercicio4;

public class Desarrollador {
	
	private String nombre;
	private int numeroLegajo;
	private int sueldo;
	private Seniority seniority;
			
	
	public Desarrollador(String nombre,int numeroLegajo, int sueldo, Seniority seniority) {
		this.numeroLegajo = numeroLegajo;
		this.sueldo = sueldo;
		this.seniority = seniority;
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	
	public int getNumeroLegajo() {
		return numeroLegajo;
	}

	public int getSueldo() {
		return sueldo;
	}

	public Seniority getSeniority() {
		return seniority;
	}

	public void setSeniority(Seniority seniority) {
		this.seniority = seniority;
	}

	@Override
	public String toString() {
		return "Sueldo: " + this.sueldo;
	}
	
	
	
}