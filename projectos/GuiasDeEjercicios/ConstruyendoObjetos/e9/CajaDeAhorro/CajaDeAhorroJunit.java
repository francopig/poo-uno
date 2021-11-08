package e9.CajaDeAhorro;

import static org.junit.Assert.*;

import org.junit.Test;

public class CajaDeAhorroJunit {

	@Test
	public void creoCuentaTest() {
		CajaDeAhorro cajaNueva = new CajaDeAhorro("Asimov Code");
		//cajaNueva = null;
		assertNotNull(cajaNueva); 	
	}

	@Test
	public void consultarTitularTest() {
		CajaDeAhorro cajaNueva = new CajaDeAhorro("Franco");
		String esperado = "Franco";
		String obtenido = cajaNueva.obtenerTitular();
		assertEquals(esperado, obtenido);
	}
	
	@Test
	public void consultarSaldoTest() {
		CajaDeAhorro cajaNueva = new CajaDeAhorro("uwu");
		double esperado = 0;
		double obtenido = cajaNueva.consultarSaldo();
		assertEquals(esperado, obtenido, 0.001);
		//el tercer argumento es la tolerancia de diferencia
	}
	
	@Test
	public void depositarTest() {
		CajaDeAhorro cajaNueva = new CajaDeAhorro("uwu");
		cajaNueva.depositar(1000);
		double esperado = 1000;
		double obtenido = cajaNueva.consultarSaldo();
		assertEquals(esperado, obtenido, 0);		
	}
	
	@Test(expected = Error.class)
	public void depositarNegativoTest() {
		//queremos ver si detecta el error
		//entonces este test está a la espera de que suceda un error
		CajaDeAhorro cajaNueva = new CajaDeAhorro("uwu");
		cajaNueva.depositar(-1000);	
	}
	
	@Test
	public void extraerTest() {
		CajaDeAhorro cajaNueva = new CajaDeAhorro("Asimov");
		cajaNueva.depositar(1000.50);
		cajaNueva.extraer(500);
		double esperado = 500.50;
		double obtenido = cajaNueva.consultarSaldo();
		assertEquals(esperado, obtenido, 0);
	}
	
}
