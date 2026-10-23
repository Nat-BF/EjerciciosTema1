package ProductorConsumidor;

public class Buffer { //solo guarda una variable
	private int dato = -1;
	private boolean lleno = false;
	
	//Hebra productora
	public synchronized void guardar(int dato) {
		while(lleno){ //si está lleno no puede guardar-- hacer que pare
			try { 
				wait(); //para hasta que le pidan despertar--LIBERA EL CERROJO
			} catch (InterruptedException e) {
				return;
			}		
		}
		this.dato = dato;
		this.lleno = true;
		System.out.println("Guardado: " + dato);
		notifyAll(); //despertar a una hebra pero no se cual. No implica dar el cerrojo, pero deja que pueda luchar por recuperarla
	}
	
	//Hebra consumidora
	public synchronized int sacar() {
		while(!lleno) { //si no está lleno (no hay nada que sacar)-- no actua
			try {
				wait(); //LIBERA EL CERROJO
			} catch (InterruptedException e) {
				e.printStackTrace();
				return -1;//valor invalido
			}	
		}
		this.lleno = false;
		System.out.println("Sacado: " + dato);
		notify(); //despertar a la otra hebra
		return dato;
	}
}
