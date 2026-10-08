package Complejidad;

import java.util.Arrays;

public class Merge {
	//Unir dos arrays YA ORDENADOS de forma ordenada: [1,3,6,8][2,4,5,7]
	public static int[] merge(int[] arr1, int[] arr2) {
		int[] resultado = new int[arr1.length+arr2.length];
		int puntero1 = 0; //recorrer arr1
		int puntero2 = 0; //recorrer arr2
		int puntRes = 0;
		while(puntero1<arr1.length && puntero2<arr2.length ) { //evitar outofboundsexcepction
			if (arr1[puntero1] <= arr2[puntero2]) {
				resultado[puntRes] = arr1[puntero1];
				puntero1++;
				puntRes++;
			}else {
				resultado[puntRes] = arr2[puntero2];
				puntero2++;
				puntRes++;
			}
		}
		
		//si un array es mas grande que el otro-- con la condicion anterior hace break con el resultado incompleto
		while (puntero2<arr2.length ) { 
			resultado[puntRes] = arr2[puntero2];
			puntero2++;
			puntRes++;
		}
		
		while (puntero1<arr1.length ) { 
			resultado[puntRes] = arr1[puntero1];
			puntero1++;
			puntRes++;
		}
		return resultado;
	}

		//[5,2,4,3,6,1,9,7]--Dividir en dos mitades
		//  [5,2,4,3]  [6,1,9,7]--mitades no ordenadas--volver a dividir
		//[5,2]  [4,3]  [6,1]  [9,7]--mitades no ordenadas--volver a dividir
		//[5] [2]  [4] [3]  [6] [1]  [9] [7]--ordenados-- usar metodo merge en pares
		//[2,5]  [3,4]  [1,6]  [7,9]--merge
		// [2,5,3,4]  [1,6,7,9]
		// [1,2,3,4,5,6,7,9] --RECURSIVIDAD

		//1º tERMINO DE DIVIDIR CUANDO arr.lenght <=1 (caso base)
		//2º Si no se cumple, divido a la mitad,   |
		//  |---- Cada mitad---------------------
		//3ºJuntar divisiones
		
		public static int[] dividirPrimeraMitad(int[]arr) {
			int[] res= new int [arr.length/2];
			for (int i = 0; i < arr.length/2; i++) {
				res [i] = arr[i];
			}
			return res;
		}
		public static int[] dividirSegundaMitad(int[]arr) {
			int[] res= new int [arr.length-(arr.length/2)];
			int posRes=0;
			for (int i = arr.length/2; i < arr.length; i++) {
				res [posRes] = arr[i];
				posRes ++;
			}
			return res;
		}
		
		public static int[] mergeSort(int[] arr) {
			if(arr.length <=1) {
				return arr;
			} //la primera pasada seguramente no pasara--hay que lograr que llegue ahí
			
			int[] izq= dividirPrimeraMitad(arr);
			int[] dch = dividirSegundaMitad(arr);
			
			//variable para recuperar el valor
			izq=mergeSort(izq);
			dch=mergeSort(dch); //recursividad-- compara y sigue dividiendo
			
			return merge(izq,dch);
		}
		
	public static void main(String[] args) {
		System.out.println(Arrays.toString(merge(new int[] {1,3,6,8}, new int[] {2,4,5,7})));
		System.out.println(Arrays.toString(mergeSort(new int[] {5,2,4,3,6,1,9,7})));

	}
}


