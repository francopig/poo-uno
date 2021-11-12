package TurnoMedico;

public class TurnoMedicoTest {
	
	
	public static void main(String[] args) {
		
		
		//declaramos una variable de tipo DiaDeLaSemana
		DiaDeLaSemana diaElegido; 
		diaElegido = DiaDeLaSemana.MARTES;
		
		System.out.println("dia elegido: " 
		+ diaElegido.getDiaElegido());
		
		Estado estadoDeMiTurno;
		estadoDeMiTurno = Estado.ACTIVO;
		
		System.out.println("Estado: " 
		+ estadoDeMiTurno.getNombre());
		//cambie getEstado por getNombre
		
		
		Trabajador laburante1 = new Trabajador(01, 500, 5, "permanente");
		System.out.println("Legajo: " + laburante1.getLegajo());
		System.out.println("Salario: " + laburante1.getSalarioBasico());
		System.out.println("Antiguedad: " + laburante1.getAntiguedad());
		System.out.println("contrato: " + laburante1.getContrato());
		System.out.println("Sueldo neto: " + laburante1.calcularSueldoNeto());
		
		
		//-------------------------------------------
		TurnoMedico turno1 = new TurnoMedico("Franco", Especialidad.ODONTOLOGO, Estado.ACTIVO);
		System.out.println("Especialdiad: " + turno1.getEspecialidad().getNombre());
		
		System.out.println(turno1.resumenTurno());
		
		//cambiamos la especialidad y estado del turno usando el setter
		turno1.setEspecialidad(Especialidad.MEDICO_CLINICO);
		turno1.setEstado(Estado.CUMPLIDO);
		System.out.println(turno1.resumenTurno());
		
	}

}
