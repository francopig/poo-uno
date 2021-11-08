 package ej1.Vehiculos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VehiculosTest {
	Persona asimov; //para usarlo en los tests
	Persona franco;
	Persona pig;
	Persona cobol;
	Persona c;
	Persona java;
	Persona python;
	
	
	@Before
	public void setUp() throws Exception {
		asimov = new Persona();	
		franco = new Persona();	
		pig    = new Persona();	
	}
	
	@Test
	public void crearMotoTest() {
		asimov = new Persona();
		Motocicleta moto = new Motocicleta(150, asimov);
		assertNotNull(moto);
		assertEquals(150, moto.getKilometrosRecorridos());
	}
	
	@Test
	public void agregarAcompanianteTest(){
		Motocicleta moto = new Motocicleta(0, null);
		assertFalse(moto.agregarAcompaniante(asimov));
				
		moto = new Motocicleta(0, franco);
		assertTrue(moto.agregarAcompaniante(pig));
	}
	
	@Test
	public void cambiarChoferTest(){
		Motocicleta moto = new Motocicleta(0, asimov);
		assertTrue(moto.agregarAcompaniante(franco));
				
		Autobus bondi = new Autobus(0, pig, 20);
		bondi.subirPasajero(cobol);
		bondi.subirPasajero(java);
		
		
		//da falso porque intento cambiar chofer teniendo pasajeros
		assertFalse(bondi.cambiarChofer(cobol));
		assertFalse(moto.cambiarChofer(python));
		
		bondi.bajarPasajero();
		bondi.bajarPasajero();
		
		//despues de bajar los pasajeros si puedo cambiar chofer
		assertTrue(bondi.cambiarChofer(java));
	}
	
	@Test
	public void comoVehiculosTest() {
		Vehiculo moto = new Motocicleta(0, asimov);
		Vehiculo bondi = new Autobus(0,franco,0);
		
		System.out.println(moto);
		System.out.println(bondi);
		
		moto = bondi; //se puede porque los dos son vehiculos
		System.out.println("----------------");
		System.out.println(moto);
		System.out.println(bondi);
	}
	
	

}
