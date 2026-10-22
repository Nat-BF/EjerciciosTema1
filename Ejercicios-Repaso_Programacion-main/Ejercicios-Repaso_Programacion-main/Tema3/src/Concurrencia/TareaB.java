package Concurrencia;

public class TareaB extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("B: "+i);
			
			//while(!Thread.currentThread().isInterrupted())//manejar que hacer si se introduce
				
			try {
				Thread.sleep(1000); //DESCANSAR 1000ms. Hace comprobacion de interrupción
			} catch (InterruptedException e) {
				return; //si hay un error, terminar la hebra
			} 
		}
	}
}
