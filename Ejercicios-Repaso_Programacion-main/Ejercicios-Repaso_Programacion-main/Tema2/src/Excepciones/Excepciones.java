package Excepciones;

public class Excepciones {
	
	public static int accederValor(int[] arr, int pos) {
		int e = Integer.parseInt("abc"); //convierte String a int. Excepción; no debería ser posible.
		int valor = arr[pos];
		System.out.println("Valor: " + valor); //Exception: Index 3 out of bounds for length 3
		return valor;
	}

	public static void main(String[] args) {
		System.out.println("Empieza el programa:"); //Exception: Index 3 out of bounds for length 3
		int[] arr = {1, 2, 3};
		
		//System.out.println(accederValor(arr, 5)); //Exception: Index 3 out of bounds for length 3
									//Stacked trace. Pila- coloca los metodos a los que se llama según se llaman. Se lee de abajo a arriba
										//LIFO = Last In First Out
										//1º Main, 2ºaccedeValor
		
		try {
			System.out.println(accederValor(arr, 5));
		}catch(ArrayIndexOutOfBoundsException e) { //se pueden encadenar catchs
			System.out.println("Índice no válido.");
		} catch (Exception e) {
			System.out.println("Algo ha ido mal.");
		}
	}
}
