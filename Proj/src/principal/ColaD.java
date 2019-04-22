package principal;

public class ColaD implements ColaTDA {

	Nodo primero;
	Nodo ultimo;
	
	public void inicializarCola() {
		primero = null;
		ultimo = null;
	}

	
	public void acolar(int x) {
		Nodo aux = new Nodo();
		aux.info = x;
		aux.sig = null;
		
		//si la cola no esta vacia
		if(ultimo != null)
			ultimo.sig = aux;
		
		ultimo = aux;
		
		//si la cola estaba vacia
		if(primero == null)
			primero = ultimo;
	}

	
	public void desacolar() {
		primero = primero.sig;
		
		//Si la cola queda vacia
		if (primero == null){
			ultimo = null;
		}
	}

	
	public boolean colaVacia() {
		return (ultimo == null);
	}

	
	public int primero() {
		if(primero == null)
			return 0;
			
		return primero.info;
	}
	
}
