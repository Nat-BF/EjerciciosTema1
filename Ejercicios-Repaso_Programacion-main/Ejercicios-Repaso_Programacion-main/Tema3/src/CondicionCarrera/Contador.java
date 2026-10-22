package CondicionCarrera;
//DOS THREADS COMPITEN POR ACCEDER A UN MISMO VALOR A LA VEZ
public class Contador {
	private int valor=0; //PRIVADO PORQ HAY CLASES QUE INTENTAR ACCEDER AL VALOR A LA VEZ--PROTEGERLO PARA QUE NO LO CAMBIEN
	
	public void incrementar() { 
		
		synchronized(this) { //HEBRAS TIENEN QUE USAR EL MISMO CERROJO- CERROJO ES OBJETO
			//this hace referencia a la instancia de contador. Incrementador deben usar el mismo contador (referencia) para que funcione synchronized
			
			valor++; //REGIÓN CRÍTICA-- aplicar mecanismo de EXCLUSIÓN MUTUA
			//Cerrojo (lock)- se puede usar cualqier objeto como cerrojo: solo deja acceder si tiene el objeto
		}
		
		//Internamente hace:
			//int tmp = valor; Lee
			//tmp = tmp +1; Calcula
			//valor = tmp; Actualiza
		
		//Con dos threads:
			//i1 lee: 0
			//i2 lee: 0
			//i1 calcula: 1
			//i2 calcula: 1
			//i1 actaliza: 1
			//i2 actaliza: 1
				//valor=1
		//CADA THREAD COMPLETA UN BUCLE PERO SOLO SE ACTUALIZA EL VALOR UNA VEZ
			//operación no atómica-- condicion de carrera
	}
	
	public int getValor() {
		return this.valor;
	}
}
