package Equals;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListQueue {

	public static void main(String[] args) {

			List<String> lista = new LinkedList<>();
			
			Queue<String> cola = new LinkedList<>();
			cola.offer("Ana");
			cola.offer("Carlos");
			cola.offer("Lucía");
			System.out.println("\n COLA");
			System.out.println(cola.peek()); //indica el primer elemento
			System.out.println(cola);//[Ana, Carlos, Lucía]
			System.out.println(cola.poll()); //Saca a ANA- LA PRIMERA EN LA COLA
			System.out.println(cola);//[Carlos, Lucía]


			
	}

}
