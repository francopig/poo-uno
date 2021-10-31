package ParcialHotel;

import java.util.Arrays;
//para cuando probamos el punto E
//al final lo cambie xd

public class Main {
	public static void main(String[] args) {
		//creo un hotel de 6 habitaciones
		Hotel h = new Hotel(6);
		
		h.ocuparHabitacionCon(2, 1);
		h.ocuparHabitacionCon(4, 0);
		h.ocuparHabitacionCon(1, 0);
		
		//pruebo el punto C
		System.out.println("Cantidad total de personas: ");
		System.out.println(h.contarPersonasEnTotal());
		
		//pruebo el punto D
		System.out.println("Cantidad de hab. ocupadas por 4 mayores");
		System.out.println(h.contarHabitacionesCon(4));
		
		//Pruebo el punto E
		
		System.out.println("Ocupación por habitacion");
		int[] hab = h.contarHabitacionesConNPersonas();
		//System.out.println(Arrays.toString(hab));
		for(int l = 0; l < hab.length; l++) {
			System.out.println("Habitaciones con " + l + " personas: " +hab[l]);
		}
		
	}
 
}
