package principal;

public class PilaDinamica implements PilaTDA {

		Nodo primero;
		
		public void inicializarPila() {
			primero = null;
		}
		
		public void apilar(int x) {
			Nodo aux = new Nodo();
			aux.info = x;
			aux.sig = primero;
			primero = aux;
		}

		public void desapilar() {
			primero = primero.sig;
		}

		
		public boolean pilaVacia() {
			return (primero == null);
		}

		public int tope() {
			return primero.info;
		}
}
