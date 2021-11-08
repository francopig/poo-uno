package ej1.Vehiculos;

public class Motocicleta extends Vehiculo{
	
	private Persona acompaniante;
	
	public Motocicleta(int kilometrosRecorridos, Persona chofer) {
		super(kilometrosRecorridos, chofer);
	}

	
	public boolean agregarAcompaniante(Persona acompaniante) {
		if(!hayAcompaniante() && hayChofer()) {
			this.acompaniante = acompaniante;
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public boolean cambiarChofer(Persona nuevoChofer) {
		// TODO Auto-generated method stub
		if( !hayAcompaniante()) {
			super.asignarChofer(nuevoChofer);
			return true;
		}
		return false;
	}
	
	
	private boolean hayAcompaniante() {
		return this.acompaniante !=  null;
	}


	//para mostrar la moto
	@Override
	public String toString() {
		return "  Motocicleta [acompaniante=" + acompaniante + super.toString() + "]";
	}
	
	

} 
