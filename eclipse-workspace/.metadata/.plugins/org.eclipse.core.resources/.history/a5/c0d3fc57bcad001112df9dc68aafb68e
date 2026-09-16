package repaso;
//HERENCIA- Estudiate es una persona
public class Estudiante extends Persona implements Cansado{ //solo puedes heredar de una clase, pero puedes implementar varias interfaces

	public Estudiante(String nombre) {
		super(nombre); //funcion super() llama a constructor de persona. No hace falta declarar atributo
	}
	//Sobreescribir metodo padre-@Override
	@Override
	public void comer() {
		System.out.println("Soy estudiante");
	}
	
	@Override
	public void descansar() {
		System.out.println("Soy estudiante y zzzzzz");
		
	}
	
	public static void main(String[] args) {
		Estudiante e = new Estudiante("Laura");
		System.out.println(e.nombre);
		e.comer();
		e.descansar();
	}
	
	
}

//MODIFICADORES
	//public: clase, paquete, subclase, world
	//protected: se puede acceder desde la clase, paquete y subclase. No desde world.
	//no modif : se puede acceder desde clase y paquete. No se accede desde subclase
	//private : solo se accede desde la  propia clase.
		//atrubutos suelen ser private