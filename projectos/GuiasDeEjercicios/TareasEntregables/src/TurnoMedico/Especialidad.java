package TurnoMedico;

public enum Especialidad {
	MEDICO_CLINICO("Médico clinico"),
	ODONTOLOGO("Odontologo"),
	OFTALMOLOGO("Oftalmolog");
	
	//Atributo
	private String nombre;
	
	//Constructor privado
	private Especialidad (String nombre) {
		this.nombre = nombre;
	}
	
	//Getter
	public String getNombre() {
		return this.nombre;
	}
}

