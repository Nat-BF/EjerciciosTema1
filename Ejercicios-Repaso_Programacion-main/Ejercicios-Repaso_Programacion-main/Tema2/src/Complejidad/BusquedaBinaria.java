package Complejidad;

public class BusquedaBinaria {
	public static int busquedaBinaria(int[] arr, int valor) {
		int izq=0;
		int dch=arr.length-1;//punteros en los extremos
		int pos = (dch-izq)/2; //empezar a evaluar por el medio
		
		while(dch>=izq) { //while con punteros
			if(arr [pos] == valor) {
				return pos;
			} else if(arr[pos]>valor) { //buscar en la izquierda -- actualizar dch
				dch=pos-1;
				pos= izq +((dch-izq)/2);
			}else {//buscar en la derecha -- actualizar izq
				izq=pos +1;
				pos= izq +((dch-izq)/2);
			}
		}return -1;
	}
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



	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,6,7,10,12,14}; //lista ordenada
		System.out.println(busquedaBinaria(arr, 7));

	}

}
