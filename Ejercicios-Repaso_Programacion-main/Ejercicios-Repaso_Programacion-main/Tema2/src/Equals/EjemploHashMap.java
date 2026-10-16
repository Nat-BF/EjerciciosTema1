package Equals;

import java.util.HashMap;
import java.util.Map;

public class EjemploHashMap {

	public static void main(String[] args) {
		Map<String, Double> notas = new HashMap<>(); //usar los wrappers
		//Claves son únicas
		notas.put("Ana", 9.0);
		notas.put("Carlos", 9.0);
		notas.put("Lucía", 5.0);
		System.out.println(notas);
		
		//Actualizar
		notas.put("Ana", 9.5);
		System.out.println(notas);

		//Recuperar valores
		System.out.println("Nota de Ana: " + notas.get("Ana"));
		
		//Comprobar si existen claves
		System.out.println(notas.containsKey("Pedro"));
		
		//Eliminar
		notas.remove("Lucía");
		System.out.println(notas);
		
		//Tamaño
		System.out.println(notas.size());
		
		//Recorrer. No hay posiciones. Usar un for-each usando las CLAVES
		for (String nombre : notas.keySet()) {
			System.out.println("Nombre: "+nombre + "| Nota: "+ notas.get(nombre));

		}

///////////////////
		Map<String, Alumno> alumnos = new HashMap<>(); //usar los wrappers

	}

}
