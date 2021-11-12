package TurnoMedico;

//el cuerpo de una enum contiene todos los valores
//posibles que esta enum puede tomar
// es como una lista de constantes

public enum DiaDeLaSemana {
	LUNES("Lunes"),
	MARTES("Martes"),
	MIERCOLES("Miercoles"),
	JUEVES("Jueves"),
	VIERNES("Viernes"),
	SABADO("Sábado"),
	DOMINGO("Domingo");
	
	private String diaElegido;
	
	private DiaDeLaSemana(String dia) {
		this.diaElegido = dia;
	}
	
	public String getDiaElegido() {
		return this.diaElegido;
	}
}
