package ejercicio4;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SoftwareFactory { 
	
	List<Desarrollador> lista;
	
	public SoftwareFactory(List<Desarrollador> lista){
		this.lista = lista;
	}	
	
	//Parte a - Ordenar
	List<Desarrollador> listarDesarrolladoresSueldo(){
		
		Collections.sort(lista, new ComparadorA());
		return lista;
	}
	
	//Parte b - Dejar solo semiseniors
	void seleccionarSemiSeniors() {

		Iterator<Desarrollador> iterator = this.lista.iterator();
        while (iterator.hasNext()) {
            if(iterator.next().getSeniority() != Seniority.SEMISENIOR) {
                iterator.remove();
            }
        }
        System.out.println(this.lista);
	}
	

}
