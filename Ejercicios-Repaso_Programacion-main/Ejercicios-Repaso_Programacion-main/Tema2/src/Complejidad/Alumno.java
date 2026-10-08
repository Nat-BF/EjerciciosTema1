package Complejidad;

public class Alumno implements Comparable<Alumno>{ //Interfaz para comparar
	String nombre;
	double nota;
	
	public Alumno(String nombre, double nota) {
		this.nombre=nombre;
		this.nota = nota;
	}
	
	public static int[] ordenar(int[] arr) {
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
	
	
	@Override
	public int compareTo(Alumno o) {
		//ordenar segun orden alfabetico
		return this.nombre.compareTo(o.nombre);
	}
	
	public static void main(String[] args) {
		String a = "Ana";
		String c = "Carlos";
		Alumno a1= new Alumno(a, 9.0);
		Alumno a2= new Alumno(c, 7.0);
		
		System.out.println(a.compareTo(c)); //-2
			//Si a menor que c: negativo, si a mayor que c: positivo, si a=c:0
			//Compara por orden ortografico (a va antes que la c = a menor que c, 2 veces antes)
		
		System.out.println(Double.compare(9.0, 2.0)); //1: 9 es mayor
		
		System.out.println(a1.compareTo(a2)); //Comparar alumnos según nombre 

	}
	
}
