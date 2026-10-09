package Equals;

public class Equals {

	public static void main(String[] args) {
		int a=5;
		int b =5;
		//System.out.println(5==5);
		//== se usa con tipos primitivos (char, double, int...). Con referencia compara memoria
		//PARA COMPARAR VALOR: equals
		String s1 = new String("Hola");
		String s2 = new String("Hola");
		System.out.println(s1==s2);//false- direcciones de memoria diferentes
		System.out.println(s1.equals(s2));
		
		String s3 = "Hola";
		String s4 = "Hola";
		System.out.println(s3==s4);//Optimización de Java-- 
		
		Integer i1= new Integer(1);
		Integer i2= new Integer(1);
		System.out.println(i1.equals(i2));
		System.out.println(i1==i2); //tipo Referencia- false


		
	}

}
