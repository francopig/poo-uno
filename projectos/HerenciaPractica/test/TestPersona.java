 package Herencia.test;

import static org.junit.Assert.*;

import org.junit.Test;

import Herencia.Persona;


public class TestPersona {

	@Test
	public void testCrearUnaPersona() {
		Persona p = new Persona(11222333, "Lucas");
		assertNotNull(p);
	}
	
	@Test
	public void testNumeroDeDocumento() {
		Persona p = new Persona(11222333, "Lucas");
		int valorEsperado = 11222333;
		int valorObtenido = p.getDni();
		assertEquals(valorEsperado, valorObtenido);
	}

}
