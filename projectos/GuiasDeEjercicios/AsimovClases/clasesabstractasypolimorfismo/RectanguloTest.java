package clasesabstractasypolimorfismo;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectanguloTest {

	
	//Pruebo si puedo crear un rectangulo
	@Test
	public void testCrearRectangulo() {
		Rectangulo rectangulo = new Rectangulo("R1", 2, 2);
		assertNotNull(rectangulo);
	}
	
	//Pruebo calcular el area
	@Test
	public void testAreaRectangulo() {
		Rectangulo rectangulo = new Rectangulo("R1", 2, 2);
		
		double valorEsperado = 4.0;
		double valorObtenido = rectangulo.calcularArea();
		assertEquals(valorEsperado, valorObtenido, 0.0);
		
	}

}
