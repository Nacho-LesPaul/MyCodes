package logica;

public class Tablero {
	
	public static final int DIM = 8;
	Casilla[] casillas;
	
	public Tablero() {
		casillas = new Casilla[DIM];
		for (int i=0;i<DIM;i++)
			casillas[i] = new Espacio(i);
		// Nuevo
		colocaInvasor();
	}

	private void colocaInvasor() {
		int posicionInvasor = (int) (Math.random() * DIM);
		casillas[posicionInvasor] = new Invasor(posicionInvasor);
		System.out.println("Invasor = "+posicionInvasor);
	}

	public Casilla[] getCasillas() {
		return casillas;
	}

	public void setCasillas(Casilla[] casillas) {
		this.casillas = casillas;
	}

}
