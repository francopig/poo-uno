package TurnoMedico;

public class Trabajador {
	private int legajo;
	private int salarioBasico;
	private int antiguedad;
	private String contrato;
	
	
	public Trabajador(int legajo, int salarioBasico, int antiguedad, String contrato) {
		this.legajo = legajo;
		this.salarioBasico = salarioBasico;
		this.antiguedad = antiguedad;
		this.contrato = contrato;
	}
	
	
	public double calcularSueldoNeto() {
		if (contrato == "permantente") {
			return salarioBasico + (antiguedad * 475);
		}else {
			return salarioBasico + (antiguedad * 300);
		}
	}
	
	public int getLegajo() {
		return legajo;
	}
	
	public int getSalarioBasico() {
		return salarioBasico;
	}
	
	public int getAntiguedad() {
		return antiguedad;
	}
	
	public String getContrato() {
		return contrato;
	}
}
