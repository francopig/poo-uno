package ejercicionota;

public class Nota {
	
	//atributo
	private int valor;
	
	//constructor
	//inicializamos la nota con el valor 
	Nota(int valor) {
		this.valor = valor;
	}
	
	
	//metodo que retorna true si está aprobado
    boolean aprobado() {
		return((valor >= 4) && (valor <= 10));
	}
    
    //retorna true si la nota esta desaprobada
    boolean desaprobado() {
    	return !aprobado();
    }
	
    //metodo para obtener el valor de la nota
    int obtenerValor(){
    	return valor;
    }
    
    /* 
     *post: modifica el valor numero de la nota
     *si nuevoValor es superior al valor actual
     */
    void recuperar(int nuevoValor) {
    	if(nuevoValor > valor) {
    		valor = nuevoValor;
    	}
    }
    
    /*
     * post: devuelve true si el valor es =< 7
     * @return true 
     */
    boolean promociona() {
    	return (valor>= 7);
    }
    
    
	public static void main(String[] args) {
		
		//creamos un objeto de tipo Nota
		Nota parcial1 = new Nota(3);
		Nota parcial2 = new Nota(9);
		
		
		System.out.println("Esta aprobado: " + parcial1.aprobado());
		System.out.println("Esta desaprobado : " + parcial1.desaprobado());
		System.out.println("El valor de la nota es: " + parcial1.obtenerValor());
		
		
		parcial1.recuperar(6);
		System.out.println("El valor recuperado es: " + parcial1.obtenerValor());
		
		System.out.println("Promociona: " + parcial1.promociona());
		System.out.println("Promociona: " + parcial2.promociona());
		
		
	}
	

}
