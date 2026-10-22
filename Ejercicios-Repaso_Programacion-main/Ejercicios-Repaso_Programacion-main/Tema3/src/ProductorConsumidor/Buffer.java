package ProductorConsumidor;

public class Buffer { //solo guarda una variable
	private int dato = -1;
	private boolean lleno = false;
	
	public synchronized boolean guardar(int dato) {
		if(lleno) {
			this.dato = dato;
			this.lleno = true;
			System.out.println("Dato guardado: " + dato);
			return true;
		}
		return false;
	}
	
	public synchronized int sacar() {
		if(lleno) {
			this.lleno = false;
			System.out.println("Dato sacado: " + dato);
			return dato;
		}
		return -1;
	}
}
