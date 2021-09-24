package turnoMedico;

public enum EspecialidadMedico {
	MEDICO_CLINICO("M�dico cl�nico"),
	ODONTOLOGO("Odont�logo"),
	OFTALMOLOGO("Oftalm�logo");
	private String especialidadElegida;
	
	private EspecialidadMedico(String espec) {
		this.especialidadElegida=espec;
	}
	public String getEspecialidadElegida() {
		return this.especialidadElegida;
	}
	
	
	
}


