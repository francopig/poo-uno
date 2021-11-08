package e9.CajaDeAhorro;

public class CajaDeAhorro {
	
	private double saldo;
	private String titular;
	
	
	
	 /*
	 * post: la instancia queda asignada al titular indicado
	 * y con saldo igual a 0.
	 */
	 public CajaDeAhorro(String titularDeLaCuenta) {
		 this.titular = titularDeLaCuenta;
		 //this.saldo = 0.0; no hace falta
	 }
	 
	 /*
	 * post: devuelve el nombre del titular de la Caja de Ahorro.
	 */
	 public String obtenerTitular() {
		 return titular;
	 }
	 
	 /*
	 * post: devuelve el saldo de la Caja de Ahorro.
	 */
	 public double consultarSaldo() {
		 return saldo;
	 }
	 
	 /*
	 * pre : monto es un valor mayor a 0.
	 * post: aumenta el saldo de la Caja de Ahorro según el monto
	 * depositado. 
	 */
	 public void depositar(double monto) {
		 if(monto > 0) {
			 saldo += monto;
		 }else {
			 throw new Error("Error en el monto ingresado");
		 }
	 }
	 
	 /*
	 * pre : monto es un valor mayor a 0 y menor o igual que el saldo de la 
	 * Caja de Ahorro.
	 * post: disminuye el saldo de la Caja de Ahorro según el monto
	 * extraido.
	 */
	 public void extraer(double monto) {
		 if((monto > 0) && (monto <= saldo)) {
			 saldo -= monto;
		 }else {
			 throw new Error("Error en el monto ingresado");
		 }
	 }

}

