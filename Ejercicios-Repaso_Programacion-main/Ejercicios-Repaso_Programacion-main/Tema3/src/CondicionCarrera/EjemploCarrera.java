package CondicionCarrera;

public class EjemploCarrera {

	public static void main(String[] args) throws InterruptedException {
		Contador c = new Contador();
		Thread i1 = new Incrementador(c);
		Thread i2 = new Incrementador(c);
		
//		i1.start();
//		i2.start();
//
//		System.out.println(c.getValor()); //valor modificado por las hebras
			//DEVUELVE 0 XQ EL MAIN TERMINA ANTES QUE LAS HEBRAS
		i1.start();
		i2.start();

		i1.join();
		i2.join();
		System.out.println(c.getValor()); //valor modificado por las hebras
			//13006. En cada ejecucion sale algo diferente SIN EXCLUSIÓN MUTUA
			//con synchronized se aplica el cerrojo-- devuelve 20000

	}

}
