package turnoMedico;

public enum EspecialidadMedico {
	MEDICO_CLINICO("Médico clínico"),
	ODONTOLOGO("Odontólogo"),
	OFTALMOLOGO("Oftalmólogo");
	private String especialidadElegida;
	
	private EspecialidadMedico(String espec) {
		this.especialidadElegida=espec;
	}
	public String getEspecialidadElegida() {
		return this.especialidadElegida;
	}
	
	
	
}


