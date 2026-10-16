package Equals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Equals {

	public static void main(String[] args) {
		int a=5;
		int b =5;
		//System.out.println(5==5);
		//== se usa con tipos primitivos (char, double, int...). Con referencia compara memoria
		//PARA COMPARAR VALOR: equals
		String s1 = new String("Hola");
		String s2 = new String("Hola");
		System.out.println(s1==s2);//false- direcciones de memoria diferentes
		System.out.println(s1.equals(s2));
		
		String s3 = "Hola";
		String s4 = "Hola";
		System.out.println(s3==s4);//Optimización de Java-- 
		
		Integer i1= new Integer(1);
		Integer i2= new Integer(1);
		System.out.println(i1.equals(i2));
		System.out.println(i1==i2); //tipo Referencia- false

		//REPASAR COMO SE INDICA OBJETO O DIRECCIÓN
		Alumno a1 = new Alumno ("Ana", 9.0);
		Alumno a2 = new Alumno ("Ana", 9.0);
			//a1==a2 compara REFERENCIAS- da false
			//a1.equals(a2) compara por VALOR-- HAY QUE DEFINIR LA FUNCIÓN EQUALS
				//equals predefinido returns (this == object)
		
				//@Override
				//public boolean equals (Object obj){
					//if (this == obj) return true; 
					//if (!(obj instanceof Alumno)) return false;
					//return this.nombre.equals(obj.nombre) && this.nota == obj.nota; //Se asume que con la misma nota y nombre es la misma persona
						//CON STRINGS USAR EQUALS !!!!!!
				//} 
					//en este caso queremos que apunte al mismo objeto (Alumno a1; a2=a1)
					//OJO MÉTODO obj instanceof Objeto !!!!!!!!!!!
		
			//Alumno a3=a1;
				//System.out.println(a3 == a1) -- true. Misma referencia.
				//System.out.println(a3.equals(a1)) -- true. equals definido 
		
		
		//List -- ArrayList
			List<Alumno> alumnos = new ArrayList<>();
			alumnos.add(a1);
			System.out.println(alumnos.contains(a2)); //true- hace un equals (misma nota y nombre)
		
		//Set -- HashSet
			Set<Alumno> alumnosSet = new HashSet<>();
			alumnosSet.add(a1);
			System.out.println(alumnosSet.contains(a2)); //false-- usa el equals definido. Si da false tienen Hash codes diferentes
				//contains tiene complejidad O(n)
			System.out.println(a1.hashCode()); //1555009629 --tras modificar hashCode-- 1078016141
			System.out.println(a2.hashCode()); //41359092--tras modificar hashCode-- 1078016141. contains ya da true
			
		//Map: Key-Value
			Map<String, Double> notas = new HashMap<>(); //usar los wrappers

		
	}

}
