package e9.CajaDeAhorro;

public class CajaDeAhorroTest {
	public static void main(String[] args) {
		CajaDeAhorro miCaja = new CajaDeAhorro("Asimov");
		
		//consulto estado inicial
		System.out.println("Titular: " + miCaja.obtenerTitular());
		System.out.println("Saldo : $" + miCaja.consultarSaldo());
		
		//Agrego y saco saldo
		miCaja.depositar(420);
		miCaja.extraer(69);
		System.out.println("Saldo: $" + miCaja.consultarSaldo());
				
	}
}
