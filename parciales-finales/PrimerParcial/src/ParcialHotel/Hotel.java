package ParcialHotel;

public class Hotel {
	//atributos
	private Habitacion[] habitaciones;
	
	//constructor parametrizado
	Hotel(int cantidadHabitaciones) {
		this.habitaciones = new Habitacion[cantidadHabitaciones];

		for(int i = 0; i < cantidadHabitaciones; i++) {
			this.habitaciones[i] = new Habitacion(0,0);
		}
		 
	}
		
		//Métodos
		public void ocuparHabitacionCon(int mayores, int menores) {
			//1. localizar una habitación disponible
			//2. Ocuparla
			if (mayores + menores <= 8) {
				boolean detener = false;
				int i = 0;
				while(!detener && i < this.habitaciones.length) {
					if(!this.habitaciones[i].estaOcupada()) {
						this.habitaciones[i].setMayores(mayores);
						this.habitaciones[i].setMenores(menores);
						detener = true;
					}
					i++;
			    }
			}
		}
	
	    //Punto C 
		public int contarPersonasEnTotal() {
			int totalPersonas = 0;
			
			for(int j=0; j < this.habitaciones.length; j++) {
				totalPersonas += habitaciones[j].getMayores()+ habitaciones[j].getMenores();
			}
			
			return totalPersonas;
		}
		
		//Punto D
		public int contarHabitacionesCon(int mayores) {
			int cantidadHabitaciones = 0;
			
			for(int j = 0; j < this.habitaciones.length; j++) {
				if (this.habitaciones[j].getMayores() == mayores) {
					cantidadHabitaciones++;
				}				
			}
			
			return cantidadHabitaciones; 
		}
		
		//Punto E
		public int[] contarHabitacionesConNPersonas() {
			int[] cantidadHabitaciones = new int[9];
			int cantidadPorHabitacion = 0;
			
			for(int k = 0; k < cantidadHabitaciones.length; k++) {
				for(int h = 0; h < this.habitaciones.length; h++) {
					cantidadPorHabitacion = this.habitaciones[h].getMayores() + this.habitaciones[h].getMenores();
					if (cantidadPorHabitacion == k ) {
						cantidadHabitaciones[k]++;
					}
					
					cantidadPorHabitacion = 0;
				}
			}
			   
		
		     return cantidadHabitaciones;
			
		}
		

}
 