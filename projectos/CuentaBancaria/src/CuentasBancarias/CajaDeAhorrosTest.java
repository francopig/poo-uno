package CuentasBancarias;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CajaDeAhorrosTest {

	@Test
	public void creoCuentaTest() {
		CajaDeAhorro ca = new CajaDeAhorro ("Juancho");
		assertNotNull(ca);  
	}
	
	
	@Test
	public void consultarTitularTest() {
		CajaDeAhorro ca = new CajaDeAhorro ("Juancho");
		String esperado = "Juancho";
		String obtenido = ca.obtenerTitular();
		assertEquals(esperado, obtenido);
	}
	
	@Test
	public void consultarSaldoTest() {
		CajaDeAhorro ca = new CajaDeAhorro ("Juancho");
		double esperado = 0;
		double obtenido = ca.consultarSaldo();
		assertEquals(esperado, obtenido, 0.001);
	}
	
	@Test
	public void depositarTest() {
		CajaDeAhorro ca = new CajaDeAhorro ("Juancho");
		ca.depositar(1000); 
		
		double esperado = 1000;
		double obtenido = ca.consultarSaldo();
		assertEquals(esperado, obtenido, 0.001);
	}
	
	@Test(expected = Error.class)
	public void depositarNegativoTest() {
		CajaDeAhorro ca = new CajaDeAhorro ("Juancho");
		ca.depositar(-10); 
		
		double esperado = 1000;
		double obtenido = ca.consultarSaldo();
		assertEquals(esperado, obtenido, 0.001);
	} 
	
	@Test
	public void extraerTest() {
		CajaDeAhorro ca = new CajaDeAhorro ("Juancho");
		ca.depositar(1000.50);
		ca.extraer(500);
		double esperado = 500.50;
		double obtenido = ca.consultarSaldo();
		assertEquals(esperado, obtenido,0.001);
	} 

	@Test
	public void extraerYnoMeAlcanzaTest() {
		CajaDeAhorro ca = new CajaDeAhorro ("Juancho");
		ca.depositar(1000);
		ca.extraer(1500);
		double esperado = 500.50;
		double obtenido = ca.consultarSaldo();
		assertEquals(esperado, obtenido,0.001);
	} 	

}
