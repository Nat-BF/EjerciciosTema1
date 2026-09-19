package Recursividad;

import java.util.ArrayList;
import java.util.List;

public class Backtracking {
	//LISTA- recuento de soluciones obtenidas. Método recursivo no tiene memoria de lo qe ha ocurrido antes.
	//dar todas las posibles combinaciones de numeros de un array que suman un cierto numero. Ej, {1,2,3}, suma 4
	public static void backtracking(int []arr, int objetivo, int acumulado, List<Integer> solucion) {
		if(acumulado == objetivo) {
			System.out.println(solucion);
			return;
		}
		if(acumulado > objetivo) {
			return;
		}
		for(int i : arr) {//iterar array. i = valor del array
			//Probar
			solucion.add(i);
			//Explorar
			backtracking(arr, objetivo, acumulado + i, solucion); //añadir nueva solucion
			//Volver
			solucion.remove(solucion.size()-1); //eliminar ultima posicion xq vamos hacia atrás
		}
	}
	
	public static void main(String[] args) {
		backtracking(new int[] {1,2,3} , 4, 0, new ArrayList<>());
	}
}
