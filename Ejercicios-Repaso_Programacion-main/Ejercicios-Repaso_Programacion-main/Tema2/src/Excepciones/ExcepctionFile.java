package Excepciones;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExcepctionFile {
	public static void abrirFichero(String s) {
		try{
			FileReader f = new FileReader(s); //Excepcion FileNotFound es comprobada por Java. Las RunTimeExcepcion no siempre las comprueba
		}catch(FileNotFoundException e) {
			e.printStackTrace(); //imprimir excepcion
		}
		System.out.println("Fichero abierto."); //Una vez se ejecuta el try catch (cuando se ejecuta correctamento o se maneja la excepción),
												//el programa continua e imprime el mensaje)
		
	}
	
	public static void main(String[] args) {
		abrirFichero("Direcion");
		/*
		 * java.io.FileNotFoundException: Direcion (El sistema no puede encontrar el archivo especificado)
	at java.base/java.io.FileInputStream.open0(Native Method)
	at java.base/java.io.FileInputStream.open(FileInputStream.java:185)
	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:139)
	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:109)
	at java.base/java.io.FileReader.<init>(FileReader.java:60)
	at Tema2/Excepciones.ExcepctionFile.abrirFichero(ExcepctionFile.java:9)
	at Tema2/Excepciones.ExcepctionFile.main(ExcepctionFile.java:17)
		 */
	}
}
