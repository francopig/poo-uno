package e12.Tragamonedas;

public class Tragamonedas {
	
	    //antes de crear el constructor del tragamonedas
		//tengo que crear los 3 tambores
		//estos son atributos de tipo tambor del tragamonedas
		private Tambor t1;
		private Tambor t2;
		private Tambor t3;
		
		
		/*
		 * post: los 3 tambores del Tragamonedas estan
		 * en la posición 1
		 */
		public Tragamonedas() {
			t1 = new Tambor();
			t2 = new Tambor();
			t3 = new Tambor();
		}
		
		public String toString() {
			return "[" + t1.obtenerPosicion()+"]" +
				   "[" + t2.obtenerPosicion()+"]" +
				   "[" + t3.obtenerPosicion()+"]";
			
		}
		
		/*
		 * post: activa el Tragamonedas haciendo girar
		 *  sus 3 tambores
		 */
		public void activar() {
			this.t1.girar();
			t1.girar();
			this.t2.girar();
			this.t3.girar();
		}
		
		public boolean entregaPremio() {
			return this.t1.obtenerPosicion() == t2.obtenerPosicion()
			         && t2.obtenerPosicion() == t3.obtenerPosicion();  
		}

}
