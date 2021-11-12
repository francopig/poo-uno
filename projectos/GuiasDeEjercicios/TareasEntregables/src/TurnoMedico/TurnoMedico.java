package TurnoMedico;

public class TurnoMedico {
	String paciente;
	Especialidad especialidad;
	Estado estado;

	public TurnoMedico(String paciente,Especialidad especialidad, Estado estado) {
		this.paciente = paciente;
		this.especialidad = especialidad;
		this.estado = estado;
	}
	
	public String getPaciente() {
		return paciente;
	}
	
	public Especialidad getEspecialidad() {
		return especialidad;
	}
	
	public Estado getEstado() {
		return estado;
	}
	
	public void setEspecialidad(Especialidad nuevaEspecialidad) {
		this.especialidad = nuevaEspecialidad;
	}
	
	public void setEstado(Estado nuevoEstado) {
		this.estado = nuevoEstado;
	}
	
	public String resumenTurno() {
		return this.getPaciente() + " - " + this.getEspecialidad().getNombre() +
				" - " + this.getEstado().getNombre();
	}
	


}
