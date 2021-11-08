package ej1.Vehiculos;

public abstract class Vehiculo {
	private int kilometrosRecorridos;
	private Persona chofer;
	
	public Vehiculo (int kilometrosRecorridos, Persona chofer) {
		this.kilometrosRecorridos = kilometrosRecorridos;
		//this.chofer = chofer;
		asignarChofer(chofer);
	}
	
	public int getKilometrosRecorridos() {
		return kilometrosRecorridos;
	}
	
	protected void asignarChofer(Persona chofer) {
		this.chofer = chofer;
	}
	
	protected boolean hayChofer() {
		return this.chofer != null;
		//si chofer es distinto de null hay chofer
	}
	
	
	
 
	@Override
	public String toString() {
		return "Vehiculo [kilometrosRecorridos=" + kilometrosRecorridos  +"]";
	}

	public abstract boolean cambiarChofer(Persona chofer);
	
	
}
