package CondicionCarrera;
//HEBRA
public class Incrementador extends Thread{
	
	Contador c;
	
	//PARA QUE LAS 	DOS HEBRAS ACCEDAN AL MISMO CONTADOR- SI CADA CLAS ECREA SU OBJETO CONTADOR, MODIFICAN CONTADORES DIFERENTES
	public Incrementador(Contador c) {
		this.c = c;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			c.incrementar(); //tenemos un contador como atributo
		}
	}
}
