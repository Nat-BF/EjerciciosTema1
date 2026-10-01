package Complejidad;

public class Complejidad {

	public static int busquedaLineal(int[] arr, int valor) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == valor) {
				return i;//posicion
			}
		}return -1;
	}
	
	public static void main(String[] args) {
		
		int n = 1;
		for (int i = 0; i < n; i++) {
			System.out.println("Hola");
		}
		for (int i = 0; i < n; i++) {
			for (int j= 0; j < n; j++) {
				System.out.println("Hola");
			}
		}
		
		/*for (int i = 0; i < n; i++) {
			for (int j= 0; j < 3; j++) {
				x++;
			}
		}
		Complejidad 3n. En notacion Big O esos factores no afectan- complejidad sigue siendo lineal
		*/
		
		/*
		 for (int i = 0; i < n; i++) {
			System.out.println("Hola");
		}
		for (int i = 0; i < n; i++) {
			System.out.println("Hola");
		}
		Complejidad n+n = 2n-- anotar como complejidad n
		 */
		
		//BUSQUEDA LINEAL
		int[] arr = {1,4,7,9,2,0,13};
		System.out.println(busquedaLineal(arr, 5));

	}

}
