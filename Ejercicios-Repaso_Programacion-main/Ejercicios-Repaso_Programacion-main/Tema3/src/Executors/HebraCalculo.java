package Executors;

public class HebraCalculo extends Thread{
	private int lo;
	private int hi;
	private int res;
	
	//HAY QUE INICIALIZAR lo Y hi PARA QUE FUNCIONE--CREAR UN CONSTRUCTOR
	public HebraCalculo (int lo, int hi) {
		this.lo = lo;
		this.hi = hi;
	}
	
	@Override
	public void run() {
//		int res = CalculoSecuencial.calculo(lo, hi);
//		res = this.res; //OJO CON COMO DEVOLVER
		
		
		for(int i = lo; i<hi; i++) {
			res += i*i;
		}
	}
	
	public int getRes() {
		return this.res;

	}
}
