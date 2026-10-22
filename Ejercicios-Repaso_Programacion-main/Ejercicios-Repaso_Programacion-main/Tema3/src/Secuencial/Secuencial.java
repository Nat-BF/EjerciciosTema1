package Secuencial;

public class Secuencial {
	
	public static void tareaA() {
		for (int i = 0; i < 10; i++) {
			System.out.println("A: "+i);
		}
	}
	public static void tareaB() {
		for (int i = 0; i < 10; i++) {
			System.out.println("B: "+i);
		}
	}
	public static void main(String[] args) {
		tareaA();
		tareaB(); //hasta que no termina A no empieza B
		
	}

}
