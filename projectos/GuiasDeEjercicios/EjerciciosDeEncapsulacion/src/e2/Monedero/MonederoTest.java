package e2.Monedero;

public class MonederoTest {
	public static void main(String[] args) {
		//creo objeto de tipo Monedero
		Monedero monedero1 = new Monedero(10);
		
		monedero1.consultarDinero();
		monedero1.meterDinero(15);
		monedero1.consultarDinero();
		monedero1.sacarDinero(5);
		monedero1.consultarDinero();
		
		//pruebo romperlo
		monedero1.meterDinero(-10);
		monedero1.sacarDinero(-10);
	}

}
