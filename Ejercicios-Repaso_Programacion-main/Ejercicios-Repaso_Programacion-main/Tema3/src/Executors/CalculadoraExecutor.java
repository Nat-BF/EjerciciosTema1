package Executors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CalculadoraExecutor {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		int start = 0;
		int end = 103;
		int tareaSize = 20;
		
		List<TareaExecutor> tareas = new ArrayList<>(); //hacer rango de tareas
		
		for (int i = start; i <= end; i+= tareaSize) {
			if(i+tareaSize<=end) {
				TareaExecutor t = new TareaExecutor(i, i+tareaSize);
				tareas.add(t);
			}else {
				TareaExecutor t = new TareaExecutor(i, end);
				tareas.add(t);
			}
		}
		
//		TareaExecutor t1 = new TareaExecutor(4, 5);
//		TareaExecutor t2 = new TareaExecutor(5, 7);

		ExecutorService executor = Executors.newFixedThreadPool(3);//interfaz
		//crea las hebras según las necesidades
		
		List<Future<Integer> > futuros = new ArrayList<>(); //hacer rango de tareas
		
		for (TareaExecutor t : tareas) {
			futuros.add(executor.submit(t));
		}
		
//		Future<Integer> futuro1 = executor.submit(t1); //ejecutar tarea
//		Future<Integer> futuro2 = executor.submit(t2); //ejecutar tarea. MIRAR LOS FUTURE
		
		int res = 0;
		for (Future<Integer> f : futuros) {
			res += f.get();
		}
		
		System.out.println(res);

//		Integer res1 = futuro1.get(); //get espera a que termine la tarea. devuelve un Integer. join() que también devuelve
//		Integer res2 = futuro2.get(); 
		
//		Future<Integer> futuro1 = executor.submit(t1); //ejecutar tarea
//		Integer res1 = futuro1.get(); //get espera a que termine la tarea. devuelve un Integer. join() que también devuelve
//		Future<Integer> futuro2 = executor.submit(t2); //ejecutar tarea. MIRAR LOS FUTURE
//		Integer res2 = futuro2.get();
		//HASTA QUE NO TERMINA EL PRIMERO EL SEGUNDO NO EMPIEZA--SE CONVIERTE EN SECUENCIAL EN VEZ DE CONCURRENTE

		
		executor.shutdown(); //indicar que no hay que recibir mas tareas
	}

}
