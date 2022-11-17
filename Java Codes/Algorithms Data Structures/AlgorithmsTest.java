package p1Algoritmia;

import static org.junit.jupiter.api.Assertions.*;

import java.security.InvalidParameterException;

//import java.security.InvalidParameterException;

import org.junit.jupiter.api.Test;

class AlgorithmsTest {

	/**
	 * Comprueba que el metodo realiza las potencias de 2 correctamente y que
	 * lanza excepcion cuando es preciso
	 */
	@Test
	void testPow2Iter() {
		Algorithms al = new Algorithms();
		for (int i=0; i<63; i++) {
			assertEquals(Math.pow(2, i),al.pow2Iter(i));
		}
		assertThrows(InvalidParameterException.class, () -> al.pow2Iter(-6));
	}
	
	/**
	 * Comprueba el correcto funcionamiento calculando las potencias de 2 de forma
	 * recursiva
	 */
	@Test
	void testPow2Rec1() {
		Algorithms al = new Algorithms();
		
		for (int i=0; i<63; i++) {
			assertEquals(Math.pow(2, i),al.pow2Rec1(i));
		}
		assertThrows(InvalidParameterException.class, () -> al.pow2Rec1(-6));
	}
	
	/**
	 * Comprueba el correcto funcionamiento calculando las potencias de 2 de forma
	 * recursiva
	 */
	@Test
	void testPow2Rec2() {
		Algorithms al = new Algorithms();
		
		for (int i=0; i<30; i++) {
			assertEquals(Math.pow(2, i),al.pow2Rec2(i));
		}
		assertThrows(InvalidParameterException.class, () -> al.pow2Rec2(-6));
	}
	
	/**
	 * Comprueba el correcto funcionamiento calculando las potencias de 2 de forma
	 * recursiva
	 */
	@Test
	void testPow2Rec3() {
		Algorithms al = new Algorithms();
		
		for (int i=0; i<63; i++) {
			assertEquals(Math.pow(2, i),al.pow2Rec3(i));
		}
		assertThrows(InvalidParameterException.class, () -> al.pow2Rec3(-6));
	}
	
	/**
	 * Comprueba el correcto funcionamiento calculando las potencias de 2 de forma
	 * recursiva
	 */
	@Test
	void testPow2Rec4() {
		Algorithms al = new Algorithms();
		
		for (int i=0; i<63; i++) {
			assertEquals(Math.pow(2, i),al.pow2Rec4(i));
		}
		assertThrows(InvalidParameterException.class, () -> al.pow2Rec4(-6));
	}
	
	/**
	 * Comprueba que el metodo lanza una excepción cuando se pasa como
	 * parámetro un número negativo
	 */
	@Test
	void testLinear() {
		Algorithms al = new Algorithms();
		assertThrows(InvalidParameterException.class, () -> al.linear(-1));
	}

	/**
	 * Comprueba que el metodo lanza una excepción cuando se pasa como
	 * parámetro un número negativo
	 */
	@Test
	void testQuadratic() {
		Algorithms al = new Algorithms();
		assertThrows(InvalidParameterException.class, () -> al.quadratic(-2));
	}
	
	/**
	 * Comprueba que el metodo lanza una excepción cuando se pasa como
	 * parámetro un número negativo
	 */
	@Test
	void testCubic() {
		Algorithms al = new Algorithms();
		assertThrows(InvalidParameterException.class, () -> al.cubic(-3));
	}
	
	/**
	 * Comprueba que el metodo lanza una excepción cuando se pasa como
	 * parámetro un número negativo
	 */
	@Test
	void testLogarithmic() {
		Algorithms al = new Algorithms();
		assertThrows(InvalidParameterException.class, () -> al.logarithmic(-3));
	}
	
	/**
	 * Comprueba el correcto calculo del factorial de n de forma recursiva
	 */
	@Test
	void testFactorialRec() {
		Algorithms al = new Algorithms();
		for (int i=0; i<21; i++) {
			assertEquals(factorial(i),al.factorialRec(i));
		}
		
		//Para asegurar que funciona tambien el metodo auxiliar
		assertEquals(120,al.factorialRec(5));
		assertEquals(5040,al.factorialRec(7));
		assertEquals(1,al.factorialRec(0));
		assertEquals(1,al.factorialRec(1));
		
		assertThrows(InvalidParameterException.class, () -> al.factorialRec(-6));
	}

	/**
	 * Metodo auxiliar que calcula el factorial para contrastarlo con el calculado
	 * de forma recursiva
	 * @param n
	 * @return
	 */
	private long factorial(int n) {
		long factorial = 1;
		while ( n!=0) {
			  factorial=factorial*n;
			  n--;
			}
		return factorial;
	}
	
	/**
	 * Comprueba el correcto calculo de la posicion n en la serie de fibonacci
	 */
	@Test
	void testFibonacci() {
		Algorithms al = new Algorithms();
		
		assertEquals(1,al.fibonacciRec(2));
		assertEquals(1,al.fibonacciRec(1));
		assertEquals(0,al.fibonacciRec(0));
		assertEquals(5,al.fibonacciRec(5));
		assertEquals(8,al.fibonacciRec(6));
		assertEquals(55,al.fibonacciRec(10));
		assertEquals(89,al.fibonacciRec(11));
		assertEquals(144,al.fibonacciRec(12));

		assertThrows(InvalidParameterException.class, () -> al.fibonacciRec(-6));
	}
	
	/**
	 * Comprueba el correcto funcionamiento del calculo de potencias de forma
	 * recursiva
	 */
	@Test
	void testPotenciaRec() {
		Algorithms al = new Algorithms();
		
		for (int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				assertEquals(Math.pow(i, j),al.potenciaRec(i, j));
			}
			
		}
		assertThrows(InvalidParameterException.class, () -> al.potenciaRec(-6,1));
		assertThrows(InvalidParameterException.class, () -> al.potenciaRec(1,-1));
	}
	
	/**
	 * Comprueba el correcto funcionamiento del calculo recursivo del resto de una
	 * division
	 */
	@Test
	void testRestoDivRec() {
		Algorithms al = new Algorithms();
		for (int i=1; i<20; i++) {
			for(int j=1; j<20; j++) {
				assertEquals(i%j,al.restoDivRec(i, j));
			}
		}
		assertThrows(InvalidParameterException.class, () -> al.restoDivRec(-6,1));
		assertThrows(InvalidParameterException.class, () -> al.restoDivRec(1,-1));
	}
	
	/**
	 * Comprueba el correcto funcionamiento del calculo de divisiones enteras de forma
	 * recursiva
	 */
	@Test
	void testRestoDivEnt() {
		Algorithms al = new Algorithms();
		for (int i=1; i<20; i++) {
			for(int j=1; j<20; j++) {
				assertEquals(i/j,al.divEntRec(i, j));
			}
		}
		assertThrows(InvalidParameterException.class, () -> al.divEntRec(-6,1));
		assertThrows(InvalidParameterException.class, () -> al.divEntRec(1,-1));
	}
}
