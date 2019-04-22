package principal;

public class Project {

	private static PilaTDA p;
	private static ColaTDA c;
	
	public static void main(String[] args) {
		//p = new PilaDinamica();
		c = new ColaD();
		for(int i = 1; i <= 10; i++){
			c.acolar(i*2);
		}
		
		
	}

	public static int sumarPila(PilaTDA p){
		PilaTDA pilaAux = new PilaDinamica();
		pilaAux.inicializarPila();
		
		int suma = 0;
		
		while(!p.pilaVacia()){
			suma = suma + p.tope();
			pilaAux.apilar(p.tope());
			p.desapilar();
		}
		
		while(!pilaAux.pilaVacia()){
			p.apilar(pilaAux.tope());
			pilaAux.desapilar();
		}
		
		return suma;
	}
	
	public static int sumarCola(ColaTDA c){
		ColaTDA colaAux = new ColaD();
		int suma = 0;
		
		while(!c.colaVacia()){
			suma = suma + c.primero();
			colaAux.acolar(c.primero());
			c.desacolar();
		}
		
		while(!colaAux.colaVacia()){
			c.acolar(colaAux.primero());
			colaAux.desacolar();
		}
		
		return suma;
	}
	
	public static int ultimo(PilaTDA p){
		PilaTDA pilaAux = new PilaDinamica();
		pilaAux.inicializarPila();
		int ultimo = 0;
		
		while(!p.pilaVacia()){
			ultimo = p.tope();
			pilaAux.apilar(p.tope());
			p.desapilar();
		}
		
		while(!pilaAux.pilaVacia()){
			p.apilar(pilaAux.tope());
			pilaAux.desapilar();
		}
		
		return ultimo;
		
	}
	
	
}
