package Ordenacion;

import java.util.Arrays;

public class BubbleSort {
	//Empujar carta mas grande al final-- se va ignorando la ultima empujada (mas grande de la iteracion)
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
	} //COMPLEJIDAD O(n^2)
	//Si está todo ordenado la complejidad es n : O(n)
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(ordenar(new int[] {6,2,4,9,-10})));
		System.out.println(Arrays.toString(ordenar(new int[] {1,2,4,9,10})));
		System.out.println(Arrays.toString(ordenar(new int[] {2,1,3,4,5})));


	}
}
	
