package Recursividad;

public class Recursividad {
	//Método se llama a sí mismo
	
	//Cuenta atrás hasta cero
	public static void cuentaAtras(int n) { //HAY QUE PONER LIMITE PARA PARAR-- CASO BASE
		if(n==0) { //caso base
			System.out.println(n);
			return; //EN UN MÉTODO USAR RETURN. OJO CON VOID- NO DEVUELVE NADA
		}
		System.out.println(n);
		cuentaAtras(n-1);//Caso recursivo
	}
	
	//Suma de decremento: n + n-1 + n-2 + ...
	public static int sumaRecursiva(int n) {
		if(n==0) {
			return 0; //sumaRecursiva(0) = 0
		}
		return n + sumaRecursiva(n-1); //USAR RECURSIVIDAD: 4 + sumaRec(3) = 4 + 3 + sumaRec(2) = 4 + 3 + 2 + sumaRec(1) = 4 + 3 + 2 + 1 + sumaRec(0)
	}
	
	//Dada una pos de array, sumar los valores siguientes
	public static int sumaArray(int[] arr, int i) {
		if (i == (arr.length-1)) {
			return arr[i]; //retornar el contenido de la ultima posición. En este caso i = arr.lenght-1
		}
		return arr[i] + sumaArray(arr, i+1); //Caso recursivo tiene que llegar la caso base
	}
	
	
	
	
	public static void main(String[] args) {
		cuentaAtras(13); //Exception in thread "main" java.lang.StackOverflowError. Ejecuta constantemente el método recurrente: Se queda sin memoria
		System.out.println("Suma: " + sumaRecursiva(13));
		int[] arr = {1, 2 ,3 ,4};
		System.out.println("Suma array: " + sumaArray(arr, 1)); 

	}

}
