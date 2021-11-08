package ej1.Vehiculos;

public class Autobus extends Vehiculo {
	
	private Persona [] pasajeros;
	private int asientoVacio = 0;

	public Autobus(int kilometrosRecorridos, Persona chofer, int cantAsientos) {
		super(kilometrosRecorridos, chofer);
		this.pasajeros = new Persona[cantAsientos];
		
	}
	
	public void subirPasajero(Persona pasajero) {
		//controlo el limite de asientos
		if(this.asientoVacio < this.pasajeros.length) {			
			this.pasajeros[asientoVacio] = pasajero;
			this.asientoVacio++;
		}
	}
	
	public void bajarPasajero() {
		if(hayPasajeros()) {			
			this.asientoVacio--;
		}
	}

	@Override
	public boolean cambiarChofer(Persona nuevoChofer) {
		if(!hayPasajeros()) {
			super.asignarChofer(nuevoChofer);
			return true;
		}
		return false;
		
	}

	private boolean hayPasajeros() {
		return this.asientoVacio > 0;
	}

	@Override
	public String toString() {
		return super.toString() + "  Autobus" + ", asientoVacio=" +  asientoVacio;
	} 
}
