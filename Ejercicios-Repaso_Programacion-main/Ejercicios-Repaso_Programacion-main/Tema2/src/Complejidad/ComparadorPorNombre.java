package Complejidad;

import java.util.Comparator;

public class ComparadorPorNombre implements Comparator<Alumno>{ //Comparator: clase para comparar

	@Override
	public int compare(Alumno o1, Alumno o2) {
		return o1.nombre.compareTo(o2.nombre);
	}

}
