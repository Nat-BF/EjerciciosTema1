package Float;

import java.lang.reflect.Array;

public class Float {

	public static void main(String[] args) {
		int acumuladoInt = 0;
		float acumuladoFloat = 0;

		float[] arr = {2.5f , 3.5f}; //POR DEFECTO GUARDA DECIMALES COMO DOUBLE- HAY QUE ESPICIFICAR COMO FLOAT
		for (int i = 0; i < arr.length; i++) {
			acumuladoInt+=arr[i];
			acumuladoFloat +=arr[i];
		}
	System.out.println(acumuladoInt); //AL SER ACUMULADO TIPO INT GUARDA VALORES COMO 2+3 (?)
	System.out.println(acumuladoFloat); //GUARDA  COMO 2.5 + 3.5
	}

}
