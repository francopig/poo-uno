package invertirfecha;

public class Fecha {
	
	//atributo
	int fecha;
	
	//constructor
	public Fecha(int f) {
		fecha = f;
	}
	
	//metodos
	int decimeTuDia() {
		return fecha % 100;
	}
	
	int decimeTuMes() {
		return fecha / 100 % 100;
	}
	
	int decimeTuAnio() {
		return fecha / 10000;
	}
	
	
	public String dateVuelta() {
		return ("dia " + decimeTuDia() + "; mes: "  + decimeTuMes()
		+ "; año: " + decimeTuAnio());			
	}
	
	
	
	public static void main(String[] args) {
		Fecha hoy = new Fecha(20210813);//creamos el objeto
		
		System.out.println(hoy.dateVuelta());
		System.out.println("dia: " + hoy.decimeTuDia());
		System.out.println("mes: " + hoy.decimeTuMes());
		System.out.println("año: " + hoy.decimeTuAnio());
		
		//probamos con otro más
		Fecha mañana = new Fecha(20210814);
		System.out.println(mañana.dateVuelta());
	}

}
