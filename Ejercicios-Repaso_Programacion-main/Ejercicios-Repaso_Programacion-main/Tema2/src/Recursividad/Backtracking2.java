package Recursividad;

import java.util.Arrays;

public class Backtracking2 {
	//Laberinto. 1 son paredes, 0 es camino
	/*(0,0)
	 * |{0 1 0 0}|
	 * |{0 0 0 1}|
	 * |{1 1 0 1}|
	 * |{0 1 0 0}|  (3,3)
	 */  
//Hay que poner al programa limites para que no se salga de laberinto
	//Crear laberinto con array bidimensional
		//laberinto[0] devuelve otro int[]fila
	
	static class Laberinto{
		int[][] mapa;
		public Laberinto(int[][] mapa) {
			this.mapa = mapa;
		}
		
		@Override
		public String toString() {
			String resultado = "";
			for (int[] fila : mapa) {
				for (int valor : fila) {
					resultado += valor + " ";
				}
				resultado += "\n";
			} return resultado;			
		} 
		
	}
	
	public static String matrizToString(int[][] arr){
		String resultado = "";
		for (int[] fila : arr) {
			for (int valor : fila) {
				resultado += valor + " ";
			}
			resultado += "\n";
		} return resultado;
	}
	
	public static boolean camino(Laberinto laberinto, int fila, int columna, boolean[][] visitado) {
		//mapa.lenght devuelve numero de filas, mapa[0].lenght devuelve num columnas
		System.out.println("Intento: (" + fila + ", " + columna +")"); 

		if(fila > laberinto.mapa.length - 1 || fila<0 || columna  > laberinto.mapa[0].length -1 || columna <0 ) {
			//1ºresuelve limite inferior, 2º resuelve limite superior, 3ºDerecha, 4º Izquierda
			return false; //se sale de los limites
		}
		//Cochar con pared (1)
		if(laberinto.mapa[fila][columna] == 1 || laberinto.mapa[fila][columna] ==2) {
			return false;
		}
		//Visitado
		if(visitado[fila][columna] == true) {
			return false;
		}
		//Salida
		if (fila == laberinto.mapa.length -1 && columna == laberinto.mapa[0].length -1){
			laberinto.mapa[fila][columna] = 2;
			return true;
		}
		
		//BACKTRACKING
			//1ºPRUEBO
		laberinto.mapa[fila][columna] = 2; //poner 2 es avanzar
			//2ºEXPLORO los distintos caminos
		if (camino(laberinto,fila+1, columna, visitado) || camino(laberinto,fila-1, columna, visitado) 
			|| camino(laberinto,fila, columna +1, visitado)|| camino(laberinto,fila, columna -1, visitado)) {
			return true; //hay camino
		}
			//3ºVUELVO
		laberinto.mapa[fila][columna] = 0; //deshacer camino cuando se encuentra en una calle sin salida
		
		return false;
	}
	
	public static void main(String[] args) {
		int[][] mapa = {{0,0,1,0},
						{1,0,0,0},
						{0,0,1,1},
						{0,0,0,0}};
		
		boolean [][] visitado ={{false,false,false,false},
				{false,false,false,false},
				{false,false,false,false},
				{false,false,false,false}};
		System.out.println(mapa[0]); //sale la posicion en memoria (tipo referencia- guarda una referencia al objeto)
		System.out.println(Arrays.toString(mapa)); //sale la posicion en memoria de cada fila(tipo referencia- guarda una referencia al objeto)
		System.out.println(Arrays.deepToString(mapa)); 
		System.out.println(matrizToString(mapa)); 
		Laberinto laberinto = new Laberinto(mapa);
		camino(laberinto,0,0, visitado);
		System.out.println(laberinto); 

	}

}
