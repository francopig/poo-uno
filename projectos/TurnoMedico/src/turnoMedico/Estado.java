package turnoMedico;

public enum Estado {
	ACTIVO("Activo"),
	BAJA("Baja"),
	CUMPLIDO("Cumplido");
	
	private String estadoElegido;
	
	private Estado(String estado) {
		this.estadoElegido=estado;
	}
	public String getEstadoElegido() {
		return this.estadoElegido;
	}
	public void setEstadoElegido(String estado) {
		this.estadoElegido=estado;
	}
	
}
