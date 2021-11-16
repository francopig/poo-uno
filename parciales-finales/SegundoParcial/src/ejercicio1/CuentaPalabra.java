package ejercicio1;

import java.io.*;
import java.util.*;

public class CuentaPalabra {
	
	//Atributos
	private File archivo;
	private FileReader fr;
	private BufferedReader br;
	
	//metodos
	public void cuentaPalabras(String archivoEntrada, String archivoSalida, String[] palabras) throws IOException { 
			
			try {
				archivo = new File("src/ejercicio1/" + archivoEntrada);
				fr = new FileReader(archivo);
				br = new BufferedReader(fr);
				
				String linea;
				String [] cosas = null;  
				ArrayList<String> listaConPalabras = new ArrayList<String>();
				
				linea = br.readLine();
				
				while(linea != null){
					cosas = linea.split(" ");
					
					for(String bloque : cosas) {						
						
						bloque = bloque.replace(",", "");
						bloque = bloque.replace(".", "");
						bloque = bloque.replace("(", "");
						bloque = bloque.replace(")", "");
						listaConPalabras.add(bloque);	
					}
					
					linea = br.readLine();
				}			
			
				ArrayList<Integer> escrbir = new ArrayList<Integer>();
				
				for(String busco : palabras) {
					int contador = 0;
					for(String bloque : listaConPalabras) {
						if(bloque.equalsIgnoreCase(busco)) {
							contador ++;
						}
					}
					escrbir.add(contador);
				}
				
				FileWriter archivo = new FileWriter("src/ejercicio1/" + archivoSalida);
				PrintWriter salida = new PrintWriter(archivo);
				BufferedWriter bw = new BufferedWriter(salida);
				
				for(int i=0 ; i<palabras.length ; i++) {
					bw.write(palabras[i]+": "+ escrbir.get(i) + "\n");
				}
				
				bw.close();
				br.close();
			
			} 
			catch (IOException e) {
				e.printStackTrace();
				throw new Error("Error");
			} 
	}

	public String[] obtenerArregloDePalabras() {
		//modificarlo si fuera necesario para hacer más y mejores pruebas
		String[] palabras = {"vim", "unix", "editor", "modo", "Ã³rdenes"}; //Cambié el caracter de la ó con acento para lo reconozca
		return palabras;
	}
	
	public static void main(String[] args) throws IOException {
		CuentaPalabra contador = new CuentaPalabra();
		contador.cuentaPalabras("archivoDeEntrada.in", "archivoDeSalida.out", contador.obtenerArregloDePalabras());
	}
}
