package Ordenacion;

import java.util.Arrays;

public class Ordenacion { //SELECTION SORT
	//Para hacer Busqueda Binaria (complejidad) es necesario que el array esté ordenado
			//ORDENACIÓN	
		//posMin; valorMin se actualizan si, al recorrer el array, aparecen valores más pequeños
			//se guarda valor mas pequeño y se coloca al principio, 
			//iterando para ponerlo en el lugar donde no se haya ordenado ya: pos 0 --pos 1 --pos 2
		//en la siguiente iteración hay que actualizar posMin, valorMin, pues al termiar la it anteror guardan los valores del mas pequeño ya ordenado
		//Actualizar con el valor y posicion del primer elemento de la nueva iteración
		//Ej: pos 4 --- posMin=4, valorMin=11-- posMin=5, valorMin=10-- posMin=7, valorMin=7
		//Ej: pos 5 --- posMin=5, valorMin=10-- posMin=5 --no hay mas pequeñas delante
		//Ej: pos 6 --- posMin=6, valorMin=12-- posMin=7, valorMin=11
		//Ej: pos 7 --- posMin=7, valorMin=12
				//PASOS
					//1. Buscar carta más pequeña
					//2. Cambiar por la que corresponde (pos)
					//3. Repetir
	
	public static int[] ordenar(int[] arr) {
		for (int pos = 0; pos < arr.length; pos++) {
			int posMin = pos; //se tiene que actualizar cada vez que se complete una iteracion (se ha ordeando un numero y se a colocado en pos anterior)
			int valorMin = arr[pos];
			for (int i = pos+1; i < arr.length; i++) { //Las cartas antes de pos ya estan ordenadas-- empezar a buscar la carta menor desde pos. No tiene que compararse consigo misma
				if(arr[i] < arr[posMin]) { //si el valor en i es menor que la anteriormente menor
					posMin = i; 
					valorMin = arr[posMin];
				}
			}//se intercambian la carta una vez ya se haya recorrido todo el array
			int tmp = arr[pos]; //variable auxiliar temporal
			arr[pos] = arr[posMin];
			arr[posMin] = tmp;
		}
		return arr;
		//ORDEN DE COMPLEJIDAD: for de fuera se recorre n veces, 
							//for de dentro se recorre [n+(n-1) + (n-2) + ...+ 3+2 +1] veces =(juntando terminos)= (n+1)/2
							//Complejidad total: n*(n+1/2) = (n^2+n)/2 == O(n^2)
								//Tarda lo mismo en el caso mejor y en el caso peor
		
	}
	
	public static void main(String[] args) {
		System.out.println(ordenar(new int[] {6,2,4,9,-10})); //ESTO IMPRIME LA REF EN MEMORIA	
		System.out.println(Arrays.toString(ordenar(new int[] {6,2,4,9,-10}))); 

	}
}
