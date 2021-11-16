package ejercicio4;

import java.util.Comparator;

class ComparadorA implements Comparator<Desarrollador> {
    
    @Override
    public int compare(Desarrollador d1, Desarrollador d2) {
    	return (d2.getSueldo() - d1.getSueldo());
    }
    
}