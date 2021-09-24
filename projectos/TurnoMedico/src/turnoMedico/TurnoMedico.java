package turnoMedico;

public class TurnoMedico {
	
	//atributos
	private String nombreProfesional;
	private String nombrePaciente;
	DiaDeLaSemana dia;
	EspecialidadMedico espec;
	Estado estado;
	
	//constructor
	public TurnoMedico(String nombreProfesional, String nombrePaciente, DiaDeLaSemana dia, 	EspecialidadMedico espec) {
		this.nombreProfesional = nombreProfesional;
		this.nombrePaciente = nombrePaciente;
		this.dia = dia;
		this.espec = espec;
		this.estado = estado.ACTIVO;
	}
	
	//METODOS
	
	//m�todo para obtener el estado.
	public Estado getEstado() { 
		return this.estado;
	}
	
	//m�todo para cambiar el estado.
	public void setEstadoElegido(Estado estado) { 
		this.estado = estado;
	}
	
	//metodo que retorna si est� activo o no compar�ndolo con la propiedad del ENUM Estado.ACTIVO.
	public boolean estaActivo() { 
		return getEstado()==Estado.ACTIVO;
	}
	
	//m�todo que retorna la informaci�n del turno. En caso de ser "TRUE" retorna los datos del turno y en 	caso de ser "FALSE" devuelve la cadena con el aviso de que est� inactivo.
	public String resumenTurno() {
		if (getEstado()==Estado.ACTIVO) {
			return (this.nombrePaciente +" - "+ this.nombreProfesional + " - " + 		this.espec.getEspecialidadElegida() + " - " + this.dia.getDiaElegido() );
		}
		else {
			return ("El turno est� inactivo o dado de baja.");
		}
	}
	
	
	public static void main(String[] args) {
		//Creaci�n del objeto "turno1" con los atributos.
		
		TurnoMedico turno1= new 		TurnoMedico("Dr.Juan","Gonzalo",DiaDeLaSemana.DOMINGO,EspecialidadMedico.MEDICO_CLINICO);
		//Creaci�n del objeto "turno2" con los atributos.
		
		TurnoMedico turno2= new TurnoMedico("Dr Franco", "Augusto", 		DiaDeLaSemana.MARTES,EspecialidadMedico.OFTALMOLOGO);
		
		//Impresi�n de los m�todos.
		
		System.out.println(turno1.estaActivo());
		System.out.println(turno1.resumenTurno());
		turno1.setEstadoElegido(Estado.BAJA);
		System.out.println(turno1.resumenTurno());
		
		System.out.println("Turno 2:");
		
		
		System.out.println(turno2.estaActivo());
		System.out.println(turno2.resumenTurno());
		
	}
	
	
}
