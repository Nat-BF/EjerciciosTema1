package BST;

public class BST {
	
	Nodo raiz;
	//guardar
	public void guardar(int valor) {
		if(raiz == null) {
			raiz = new Nodo(valor);
			return;
		}
		Nodo actual= raiz; //existe raiz
		
		while(actual!=null) {
			if(valor == actual.valor) {
				return;
			}else if(valor < actual.valor) {
				//está hacia la izq
				if(actual.izq ==null) {//comprobar si está vacío
					actual.izq = new Nodo(valor);
					return;
				}
				actual = actual.izq;
			}else {	//está hacia la dch
				if(actual.dch ==null) {//comprobar si está vacío
					actual.dch = new Nodo(valor);
					return;
				}
				actual = actual.dch;	
			}
		}
		
	}
	
	//contains(buscar)
	public boolean contains(int valor) {
		if(raiz == null) {
			raiz = new Nodo(valor);
			return false;
		}
		Nodo actual= raiz; 
		
		while(actual!=null) {
			if(valor == actual.valor) {
				return true; //unica circunstancia en la que encuentr el valor
			}else if(valor < actual.valor) {
				//está hacia la izq
				if(actual.izq ==null) {//comprobar si está vacío
					return false;
				}
				actual = actual.izq;
			}else {	//está hacia la dch
				if(actual.dch ==null) {//comprobar si está vacío
					actual.dch = new Nodo(valor);
					return false;
				}
				actual = actual.dch;	
			}
		}
		return false;
		
	}
	
	
	public static void main(String[] args) {
		BST bst = new BST();
		bst.guardar(7);
		bst.guardar(4);
		bst.guardar(9);
		bst.guardar(1);
		bst.guardar(5);
		bst.guardar(8);
		bst.guardar(15);
		System.out.println(bst.contains(1)); //metodo no estatico!!! hay que llamarlo con un objeto
		System.out.println(bst.contains(20)); //metodo no estatico!!! hay que llamarlo con un objeto

	}
}
