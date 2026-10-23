package Executors;

public class Calculadora {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		HebraCalculo a = new HebraCalculo(4,5);
		HebraCalculo b = new HebraCalculo(5,7); //DOS HEBRAS. CADA UNA CON UN TROZO DE LA TAREA

		a.start();
		b.start();
		a.join(); //OJO CON QUE EL MAIN TERMINE ANTES QUE LA HEBRA
		b.join();
		System.out.println(a.getRes()+b.getRes()); //Se imprime antes de que el calculo termine-- la hebra empieza pero el main termina antes

	}

}
