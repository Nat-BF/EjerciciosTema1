package Executors;

public class CalculoSecuencial {
	public static int calculo (int lo, int hi) {
		int res = 0;
		
		for(int i = lo; i<hi; i++) {
			res += i*i;
		}
		return res;
	}
	
	public static void main(String[] args) {
		System.out.println(calculo(4,7));
	}
}
	