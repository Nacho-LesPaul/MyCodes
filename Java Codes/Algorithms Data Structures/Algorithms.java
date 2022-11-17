import java.security.InvalidParameterException;

public class Algorithms {
	private static final long SLEEP_TIME = 1;

	public static void doNothing() {
		try {
			Thread.sleep(SLEEP_TIME);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	
//*************************** APARTADO A ******************************

	/**
	 * Calcula potencias de dos de forma iterativa Este algoritmo presenta una
	 * complejidad temporal lineal
	 * 
	 * @param n
	 * @return
	 */
	public long pow2Iter(int n) { // calcula 2 elevado a n de forma iterativa

		if (n < 0)
			throw new InvalidParameterException("No permitidos exponentes negativos como " + n);

		long res = 1;
		if (n == 0) {
			return res;
		} else {
			res = 2;
			while (n > 1) {
				doNothing();
				res = res * 2;
				n--;
			}
		}
		return res;
	}

	/**
	 * A continuaci�n se plantea un algoritmo con complejidad temporal lineal
	 * 
	 * @param n
	 */
	public void linear(int n) {

		if (n < 0)
			throw new InvalidParameterException("No permitidos par�metros negativos como " + n);
		for (int i = 0; i < n; i++) {
			doNothing();
		}
	}

	/**
	 * A continuaci�n se plantea un algoritmo con complejidad temporal cuadr�tica
	 * 
	 * @param n
	 */
	public void quadratic(int n) {

		if (n < 0)
			throw new InvalidParameterException("No permitidos par�metros negativos como " + n);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				doNothing();
			}
		}
	}

	/**
	 * A continuaci�n se plantea un algoritmo con complejidad temporal c�bica
	 * 
	 * @param n
	 */
	public void cubic(int n) {

		if (n < 0)
			throw new InvalidParameterException("No permitidos par�metros negativos como " + n);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int z = 0; z < n; z++) {
					doNothing();
				}
			}
		}
	}

	/**
	 * A continuaci�n se plantea un algoritmo con complejidad temporal logaritmica
	 * 
	 * @param n
	 */
	public void logarithmic(int n) {

		if (n < 0)
			throw new InvalidParameterException("No permitidos par�metros negativos como " + n);
		for (int i = 1; i < n; i = i * 2) {
			doNothing();
		}
	}

//*************************** APARTADO B ******************************

	/**
	 * Complejidad temporal lineal
	 * @param n
	 * @return
	 */
	public long factorialRec(int n) {
		
		if (n < 0)
			throw new InvalidParameterException("No permitidos exponentes negativos como " + n);
		if (n == 0) {
			return 1;
		}
		doNothing();
		return n * factorialRec(n - 1);
	}

	/**
	 * Complejidad temporal exponencial
	 * @param n
	 * @return
	 */
	public long fibonacciRec(int n) {
		
		if (n < 0)
			throw new InvalidParameterException("No permitidos exponentes negativos como " + n);
		doNothing();
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return fibonacciRec(n - 1) + fibonacciRec(n - 2);
	}

	/**
	 * Complejidad temporal exponencial
	 * @param a
	 * @param b
	 * @return
	 */
	public long potenciaRec(int a, int b) { // Calcula a elevado a b de forma recursiva por potencias sucesivas

		if (a < 0 || b < 0)
			throw new InvalidParameterException("No permitido alguno de los par�metros introducido");
		if (b == 0) {
			return 1;
		}
		return a * potenciaRec(a,b - 1);
	}

	/**
	 * @param a
	 * @param b
	 * @return
	 */
	public int restoDivRec(int a, int b) { // calcula el resto de la divisi�n a/b de forma recursiva

		if (a < 0 || b <= 0)
			throw new InvalidParameterException("No permitido alguno de los par�metros introducido");
		if (a < b) {
			return a;
		}
		return restoDivRec(a - b, b);

	}

	/**
	 * @param a
	 * @param b
	 * @return
	 */
	public int divEntRec(int a, int b) { // calcula la divisi�n entera a/b de forma recursiva

		if (a < 0 || b <= 0)
			throw new InvalidParameterException("No permitido alguno de los par�metros introducido");
		int cont = 0;
		if (a<b) {
			return cont;
		}
		cont++;
		return cont + divEntRec(a - b, b);
	}

//*************************** APARTADO C ******************************

	/**
	 * Complejidad temporal lineal
	 * @param n
	 * @return
	 */
	public long pow2Rec1(int n) { // calcula 2 elevado a n de forma recursiva 2^n = 2*2^(n-1)

		if (n < 0)
			throw new InvalidParameterException("No permitidos par�metros negativos como " + n);
		doNothing();
		if (n == 0) {
			return 1;
		}
		return 2 * pow2Rec1(n - 1);
	}

	/**
	 * Complejidad temporal exponencial
	 * @param n
	 * @return
	 */
	public long pow2Rec2(int n) { // calcula 2 elevado a n de forma recursiva 2^n = 2^(n-1)+2^(n-1)

		if (n < 0)
			throw new InvalidParameterException("No permitidos par�metros negativos como " + n);
		doNothing();
		if (n == 0) {
			return 1;
		}
		return pow2Rec2(n - 1) + pow2Rec2(n - 1);
	}

	/**
	 * Complejidad temporal escalonada
	 * @param n
	 * @return
	 */
	public long pow2Rec3(int n) { // calcula 2 elevado a n de forma recursiva 2^n = 2^(n/2)*2^(n/2) si n par y *2
									// si es impar
		if (n < 0)
			throw new InvalidParameterException("No permitidos par�metros negativos como " + n);
		doNothing();
		if (n == 0) {
			return 1;
		}
		if (n % 2 == 0) {
			return pow2Rec3(n / 2) * pow2Rec3(n / 2);
		}
		return pow2Rec3(n / 2) * pow2Rec3(n / 2) * 2;
	}
	
	/**
	 * Complejidad temporal Logaritmica
	 * @param n
	 * @return
	 */
	public long pow2Rec4(int n) { // calcula 2 elevado a n de forma recursiva 2^n = como pow2Rec3 pero sin repetir
									// llamada
		if (n < 0)
			throw new InvalidParameterException("No permitidos par�metros negativos como " + n);
		doNothing();
		if (n == 0) {
			return 1;
		}
		long rt = (long) pow2Rec4(n / 2);
        if (n % 2 == 0){
            return rt * rt;
        } else {
            return 2 * rt * rt;
        }
	}

//*************************** APARTADO D - OPCIONAL ******************************
//	public int invertirEnteroRec(int n) {  // Invierte un entero invertirEnteroRec(1234)=4321 de forma recursiva 
//
//	return 0; 
//	} 
//
//	public String invertirStringRec(String l) { // Invierte un string de forma recursiva invertirStringRec("abc")="cba" 
//
//	return "POR HACER"; 
//	} 
//
//	public boolean esSimetrica(int[][] m) { // Indica si es sim�trica una matriz cuadrada de forma recursiva 
//
//	return false; 
//	} 
}
