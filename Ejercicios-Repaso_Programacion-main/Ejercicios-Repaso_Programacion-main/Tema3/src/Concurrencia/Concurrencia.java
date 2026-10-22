package Concurrencia;

public class Concurrencia {
//CREAR HEBRAS- en vez de ser metodos, CLASES NUEVAS
	public static void main(String[] args) throws InterruptedException {
		//CON extends Thread
			//Thread a = new TareaA();
			//Thread b = new TareaB();
		
		//CON implements Runnable
		Runnable tareaA = new TareaA();
		Runnable tareaB = new TareaB();
		
			//CONVERTIR EN HEBRA A PARTIR DE RUNNABLE
		Thread a = new Thread(tareaA); //a la hebra le pasas tarea ejecutable. Ganas poder hacer que herede de otra clase
		Thread b = new Thread(tareaB);

		//a.run();
		//b.run();
		//NO SE USA CON RUN-- se llama al metodo sobreescritp-- lo vuelve secuencial (primero tareaA, despues tareaB)
		
		
		//START crea la hebra y la pone a ejecutar
			a.start();
			b.start();
			
			//Thread.sleep(10000); //cada metodo se ejecuta 10 vecs con sleep de 1000 = 10.000ms de espera.
			
			//ESPERAR QUE TERMINE LA HEBRA
			a.join();//Waits for this thread to terminate.
			b.join();
			
			//a.start(); a.join();-- ejecuta A, espera que termine y después ejecuta B-- vuelve  a ser secuencial
			
			System.out.println("Trabajo terminado."); //se ejecuta tras el start. por los sleep puede aparecer en medio o al principio.
				/*SIN INCLUIR SLEEP: El comportamiento y orden no es siempre igual
				 B: 0
				B: 1
				B: 2
				B: 3
				B: 4
				B: 5
				A: 0
				A: 1
				A: 2
				A: 3
				A: 4
				A: 5
				A: 6
				A: 7
				A: 8
				A: 9
				B: 6
				B: 7
				B: 8
				B: 9
				 */
			//a.interrupt();//internamente lanza un flag. No se para automaticamente. hay que implementar comprobacion en la hebra.
			
			//INCLUIR SLEEP: la ejecucion es mas pausada. Algo más de orden, pero no garantizado
				/*
				 B: 0
				A: 0
				A: 1
				B: 1
				A: 2
				B: 2
				A: 3
				B: 3
				A: 4
				B: 4
				A: 5
				B: 5
				B: 6
				A: 6
				B: 7
				A: 7
				B: 8
				A: 8
				B: 9
				A: 9
				 */
			
		
	}

}
