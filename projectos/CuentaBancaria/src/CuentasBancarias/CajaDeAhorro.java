package CuentasBancarias;

public class CajaDeAhorro {

	String titular;
	double saldo;
	
	public CajaDeAhorro(String titular) {
		this.titular = titular;
	}
	
	public String obtenerTitular() {
		return titular;
	}
	
	public double consultarSaldo() {
		return saldo;
	}
	
	public void depositar (double monto) {
		if (monto >= 0) {
			saldo += monto;
		}else {
			throw new Error("Error en el monto ingresado.");
		}
	}
	
	public void extraer (double monto) {
		if(monto <= 0) {
			throw new Error ("Monto invalido");
		}
		
		if(monto > 0 && monto <= saldo) {
			saldo -= monto;
		}else {
			System.out.println("No te alcanza");
		}
	}
	
}
