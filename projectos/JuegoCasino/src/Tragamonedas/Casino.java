package Tragamonedas;

public class Casino {
	
	//constantes
	private static final double VALOR_FICHIN = 5;
	private static final double PREMIO = 100;
	
	public static void main(String[] args) {
		Tragamonedas tg = new Tragamonedas();
		System.out.println(tg); //nos devuelve [1][1][1]
		tg.activar();//lo hago girar para que cambie valores
		int contadorDeFichines = 1;
		while(!tg.entregaPremio()) {
			tg.activar(); 
			contadorDeFichines ++;
		}
		ut
		double inversion = VALOR_FICHIN * contadorDeFichines;
		
		System.out.println("Display ");
		System.out.println(tg);
		System.out.println("Con: " + contadorDeFichines + " fichines");
		System.out.println("Inversi�n " + inversion);
		if(inversion < PREMIO) {
			System.out.println("Ganaste: " + (PREMIO - inversion));
		}else {
			System.out.println("Perdiste uwu " +  (inversion - PREMIO));
		}
		 
	}
	

}
 