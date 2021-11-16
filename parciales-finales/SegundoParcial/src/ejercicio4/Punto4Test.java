package ejercicio4;

import java.util.*;

public class Punto4Test {
	public static void main(String[] args) {
		
		 Desarrollador d0  = new Desarrollador("dev0"  , 01, 420,  Seniority.SEMISENIOR);
		 Desarrollador d1  = new Desarrollador("dev1"  , 02, 10,   Seniority.SENIOR);
		 Desarrollador d2  = new Desarrollador("dev2"  , 03, 20,   Seniority.JUNIOR);
		 Desarrollador d21 = new Desarrollador("dev21" , 04, 20,   Seniority.SENIOR);
		 Desarrollador d22 = new Desarrollador("dev22" , 05, 20,   Seniority.JUNIOR);
		 Desarrollador d3  = new Desarrollador("dev3"  , 06, 69,   Seniority.SEMISENIOR);
		 Desarrollador d4  = new Desarrollador("dev4"  , 07, 666,  Seniority.SEMISENIOR);
	
		 //creo lista de desarrolladores
		 LinkedList<Desarrollador> l1 = new LinkedList<Desarrollador>();
		 
		 l1.add(d0);
		 l1.add(d1);
		 l1.add(d2);
		 l1.add(d21);
		 l1.add(d22);
		 l1.add(d3);
		 l1.add(d4);

		 SoftwareFactory s1 = new SoftwareFactory(l1);
				 
		 //los ordeno
		 s1.listarDesarrolladoresSueldo();
		 
		 //borro los que no son semisenior
		 s1.seleccionarSemiSeniors();
		 s1.toString(); //muestro solo sueldo de los semiseniors
		 
	}
}
