package Concurrencia;

public class TareaA implements Runnable{ //TAREA ES UNA HEBRA (Thread): extends Thread // implements Runnable
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("A: "+i);
			
			//while(!Thread.currentThread().isInterrupted())//manejar que hacer si se introduce
				
			try {
				Thread.sleep(1000); //DESCANSAR 1000ms. Hace comprobacion de interrupción
			} catch (InterruptedException e) {
				return; //si hay un error, terminar la hebra
			} 
				//lanza un error- InterruptedException es un CheckException- java las chequea
				//no se puede poner throw exception si se intenta sobreescribir un metood- cambia la asignatura
		}
	}
}
