package TurnoMedico;

public enum Estado {
	ACTIVO("Activo"),
	BAJA("Baja"),
	CUMPLIDO("Cumplido");
	
	private String estado;
	
	private Estado(String estado) {
		this.estado = estado;
	}
	
	public String getNombre() {
		return this.estado;
	}
	
}
