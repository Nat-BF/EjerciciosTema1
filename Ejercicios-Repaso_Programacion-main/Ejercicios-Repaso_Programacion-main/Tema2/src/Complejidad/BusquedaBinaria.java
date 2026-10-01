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
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,6,7,10,12,14}; //lista ordenada
		System.out.println(busquedaBinaria(arr, 7));

	}

}
