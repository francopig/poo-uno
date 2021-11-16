package ejercicio3;

import java.io.*;
import java.util.*;

public class CuentaNumero {
    public Integer contarNumeros(String texto) {
    	String[] miTexto = texto.split("~");
    	Integer contador = 0;

        for (int i = 0; i < miTexto.length; i++) {
            if (esNumero(miTexto[i]))
                contador++; 
        }
        return contador;
    }

    public boolean esNumero(String numero) {
        try {
            Integer.parseInt(numero);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public String obtenerTextoDeArchivo(String archivoEntrada) {

        String texto;
        texto = "";
        
        Scanner sc = null;
        String[] l;

        try {
            sc = new Scanner(new File(archivoEntrada));

            while (sc.hasNext()) {
                l = sc.nextLine().split(" ");
                for (int i = 0; i < l.length; i++) {
                    texto = texto + l[i] + "~";
                }
            }

        } catch (FileNotFoundException e) {
        	
            e.printStackTrace();
        } finally {
        	
            sc.close();
        }

        return texto;
    }

    public static void main(String[] args) {
        CuentaNumero c = new CuentaNumero();

        System.out.println(c.contarNumeros(c.obtenerTextoDeArchivo("src/ejercicio3/texto.in")));
    }
}