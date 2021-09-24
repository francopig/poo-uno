package turnoMedico;

//Creaci�n del ENUM "DiaDeLaSemana" con sus propiedades y sus valores "String"
public enum DiaDeLaSemana {
	LUNES("Lunes"),
	MARTES("Martes"),
	MIERCOLES("Mi�rcoles"),
	JUEVES("Jueves"),
	VIERNES("Viernes"),
	SABADO("Sabado"),
	DOMINGO("Domingo");
	
	//Declaraci�n de variable para pasarle el ENUM.
	private String diaElegido;
	
	//Constructor parametrizado 
	private DiaDeLaSemana(String dia) {
		this.diaElegido=dia;
	}
	//
	public String getDiaElegido() {
		return this.diaElegido;
	}
	
	
	
}


