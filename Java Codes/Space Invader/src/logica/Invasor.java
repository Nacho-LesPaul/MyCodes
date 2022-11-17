package logica;

public class Invasor extends Casilla {

	public Invasor (int posicion) {
	 setPosicion(posicion);
	 System.out.println(getPosicion());
	 setPuntos(3000);
	}
}
