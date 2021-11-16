package ejercicio2;

import java.util.*;

public class Diccionario {
	
	public String traducir(String texto, Map<String, String> diccionario) {
		String traduccion = null;
		String[] text = texto.split(" ");
		ArrayList<String> auxiliar = new ArrayList<String>();
		Boolean bandera  = false;
		
		for (int i = 0; i < text.length; i++) {
			bandera = false;
			for (Map.Entry<String, String> e : diccionario.entrySet()) {
				if(text[i].equals(e.getKey())) {
					auxiliar.add(e.getValue());
					bandera = true;
				}
			}
			
			for (Map.Entry<String, String> entry1 : diccionario.entrySet()) {
				if(!text[i].equals(entry1.getKey()) && (!bandera) ) {
					auxiliar.add("<error>");
					bandera = true;
				}
			}
		}
		
		traduccion = String.valueOf(auxiliar);
		return traduccion;
	}

	
	public Map<String, String> obtenerDiccionario() {
		//modificarlo si fuera necesario para hacer más y mejores pruebas
		Map<String, String> diccionario = new HashMap<String, String>();
		diccionario.put("amistad", "friendship");
		diccionario.put("La", "the");
		diccionario.put("la", "the");
		diccionario.put("el", "the");
		diccionario.put("one", "uno");
		diccionario.put("vida", "life");
		diccionario.put("buenos", "good");
		diccionario.put("importantes", "important");
		diccionario.put("mas", "most");
		diccionario.put("tener", "to have");
		diccionario.put("pueden", "can");
		diccionario.put("dificiles", "difficult");

		return diccionario;
	}
	
	public static void main(String[] args) {
		Diccionario dicc = new Diccionario();
		//modificarlo si fuera necesario para hacer más y mejores pruebas
		String texto = "La amistad es uno de los valores mas importantes que se pueden tener en la vida";
		
		String textoTraducido = dicc.traducir(texto, dicc.obtenerDiccionario());
		System.out.println(textoTraducido);
	}

}