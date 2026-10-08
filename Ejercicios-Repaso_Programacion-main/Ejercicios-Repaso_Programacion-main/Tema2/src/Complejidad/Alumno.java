package Complejidad;

import java.util.Arrays;
import java.util.Comparator;

public class Alumno implements Comparable<Alumno>{ //Comparable: objeto puede ser comparado, 
	String nombre;
	double nota;
	
	public Alumno(String nombre, double nota) {
		this.nombre=nombre;
		this.nota = nota;
	}
	
	@Override //Sobreescribe metodo toString
		public String toString() {

			return this.nombre;
		}
	
	/*public static int[] ordenar(int[] arr) {
		for (int pasada = 0; pasada < arr.length; pasada++) {
			System.out.println("Pasada nº: "+ (pasada+1));
			boolean changed = false; //inicialmente no hay cambio
			for (int i = 0; i < arr.length-1-pasada; i++) { //las ya colocadas no se tiene que analizr (-pasada)
				if(arr[i]>arr[i+1]) { //comparar carta en posicion con la siguiente. Si el elemento en pos i es mayor, se intercambia con la siguiente (empujar). 
					int tmp= arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmp;
					changed =true;
				}//En la siguiente iteración la siguiente se compara con la directamente siguiente.
			} //!!!Hacer que si en alguna pasada no se cambia ninguna carta, hacer que termine el metodo (ya está ordenado)
			if(!changed) { //si no hay cambio. Si no se ha metido en el if durante el for, sigue siendo false-- !false = true
				break;
			}

		}
		return arr;
	} 
	*/
	public static Alumno[] ordenarAlumnos(Alumno[] arr) {
		for (int pasada = 0; pasada < arr.length; pasada++) {
			System.out.println("Pasada nº: "+ (pasada+1));
			boolean changed = false; //inicialmente no hay cambio
			for (int i = 0; i < arr.length-1-pasada; i++) { //las ya colocadas no se tiene que analizr (-pasada)
				if(arr[i].compareTo(arr[i+1])>0) { //comparar carta en posicion con la siguiente. Si el elemento en pos i es mayor, se intercambia con la siguiente (empujar). 
					//El metodo compareTo devuelve un positivo si es mayor
					Alumno tmp= arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmp;
					changed =true;
				}//En la siguiente iteración la siguiente se compara con la directamente siguiente.
			} //!!!Hacer que si en alguna pasada no se cambia ninguna carta, hacer que termine el metodo (ya está ordenado)
			if(!changed) { //si no hay cambio. Si no se ha metido en el if durante el for, sigue siendo false-- !false = true
				break;
			}

		}
		return arr;
	} 
	
	@Override //TE OBLIGA A IMPLEMENTARLO LA INTERFAZ COMPARABLE
	public int compareTo(Alumno o) {
		//ordenar segun orden alfabetico
		//return this.nombre.compareTo(o.nombre);
		int c=Double.compare(this.nota, o.nota);
		if(c!=0) {
			return  c;
		}else {
			return this.nombre.compareTo(o.nombre); //si empatan por nota, ordenar por nombre
		}
		//return Double.compare(this.nota, o.nota);// --COMPARAR NOTAS
	}
	
	public static void main(String[] args) {
		String a = "Ana";
		String c = "Carlos";
		String al = "Alejandra";
		
		Alumno a1= new Alumno(a, 9.0);
		Alumno a2= new Alumno(c, 7.0);
		Alumno a3= new Alumno(al, 8.0);
		Alumno[] alumnos = {a2,a1,a3};
		System.out.println(a.compareTo(c)); //-2
			//Si a menor que c: negativo, si a mayor que c: positivo, si a=c:0
			//Compara por orden ortografico (a va antes que la c = a menor que c, 2 veces antes)
		
		//System.out.println(Double.compare(9.0, 2.0)); //1: 9 es mayor
		System.out.println(Arrays.toString(alumnos)); //OJO CON EL toSring--IMPRIMIR ARRAYS
		//System.out.println(a1.compareTo(a2)); //Comparar alumnos según nombre 
		System.out.println(Arrays.toString(ordenarAlumnos(alumnos))); //OJO CON EL toSring--IMPRIMIR ARRAYS
		
		//METODOS PREEXISTENTES DE ARRAYS
		Arrays.sort(alumnos); //internamente usa el compareTo de la clase
			//ES UN VOID. Sorts the specified array of objects into ascending order, according to the natural ordering of its elements.
			//All elements in the array must implement the Comparable interface.
			//Se modifica el array y se guarda en memoria
		System.out.println(Arrays.toString(alumnos)); //OJO CON EL toSring--IMPRIMIR ARRAYS

		//USANDO COMPARATOR--UN NUEVO OBJETO
		ComparadorPorNombre porNombre = new ComparadorPorNombre();
		porNombre.compare(a1, a3);
		//Arrays.sort(alumnos, porNombre)
			//implementar en ordenarAlumnos:
				/*
				 * 
		public static Alumno[] ordenarAlumnos(Alumno[] arr, Comparator<Alumno> comparador) { //INCLUIR COMPARATOR-clase padre
		for (int pasada = 0; pasada < arr.length; pasada++) {
			System.out.println("Pasada nº: "+ (pasada+1));
			boolean changed = false; //inicialmente no hay cambio
			for (int i = 0; i < arr.length-1-pasada; i++) { //las ya colocadas no se tiene que analizr (-pasada)
				if(porNombre.compare(arr[i], arr[i+1])>0) { 
					//El metodo porNombre.compare devuelve un positivo si es mayor
					Alumno tmp= arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmp;
					changed =true;
					
				 */
		//	System.out.println(Arrays.toString(alumnos,porNombre)); //IMPLEMENTANDO COMPARATOR

		ComparadorPorNota porNota = new ComparadorPorNota();
		//Comparator<Alumno>  porNota = new ComparadorPorNota();
		porNota.compare(a2, a3);
		//	System.out.println(Arrays.toString(alumnos,porNota)); //IMPLEMENTANDO COMPARATOR
		
		
		//EXPRESION LAMBDA
		Comparator<Alumno> porNombre2 =(n,b) -> n.nombre.compareTo(b.nombre);
		//no es necesario especificar compare y el tipo de objeto
		

		



	}
	
}
