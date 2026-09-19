package Excepciones;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExcepctionFileThrow {
	public static void abrirFichero(String s) throws FileNotFoundException { //reconocer que va a ocurrir una excepción pero sin manejarla
		FileReader f = new FileReader(s); 
		System.out.println("Fichero abierto."); //No se maneja la exepción = no se escribe. Se puede manejar o no en el main
		
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		abrirFichero("Direccion"); // Se puede manejar (try catch )o no (throw) en el main. Si no se maneja hay que reconocerlo.
		
	}
}
