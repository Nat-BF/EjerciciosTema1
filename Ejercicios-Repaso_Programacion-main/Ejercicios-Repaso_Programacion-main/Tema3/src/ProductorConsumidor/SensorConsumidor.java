package ProductorConsumidor;

public class SensorConsumidor extends Thread{

	Buffer b;
	
	public SensorConsumidor(Buffer b) {
		this.b = b;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			int valor = b.sacar();
			//espera que se devuelva un valor válido
			while(valor == -1) {
				valor = b.sacar();//mientras sea -1, intentar sacar otro. No queremos imprimir -1
			}
		}
	}
}
