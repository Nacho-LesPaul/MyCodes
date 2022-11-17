package p1Algoritmia;

import org.junit.jupiter.api.Test;

class AlgorithmsBenchmarkTest {

	/**
	 * Benchmark para el metodo pow2Iter
	 * Genera fichero csv con datos de tiempo empleado
	 */
	@Test
	void testPow2Iter() {
		AlgorithmsBenchmark t = new AlgorithmsBenchmark();
		
		t.testFinal("S1-pow2Iter.csv", 0, 30, 5, "p1Algoritmia.Algorithms", "pow2Iter");
	}
	
	/**
	 * Benchmark para el metodo pow2Rec1
	 * Genera fichero csv con datos de tiempo empleado
	 */
	@Test
	void testPow2Rec1() {
		AlgorithmsBenchmark t = new AlgorithmsBenchmark();
		
		t.testFinal("S1-pow2Rec1.csv", 0, 63, 5, "p1Algoritmia.Algorithms", "pow2Rec1");
	}
	
	/**
	 * Benchmark para el metodo pow2Rec2
	 * Genera fichero csv con datos de tiempo empleado
	 */
	@Test
	void testPow2Rec2() {
		AlgorithmsBenchmark t = new AlgorithmsBenchmark();
		
		t.testFinal("S1-pow2Rec2.csv", 0, 11, 5, "p1Algoritmia.Algorithms", "pow2Rec2");
	}
	
	/**
	 * Benchmark para el metodo pow2Rec3
	 * Genera fichero csv con datos de tiempo empleado
	 */
	@Test
	void testPow2Rec3() {
		AlgorithmsBenchmark t = new AlgorithmsBenchmark();
		
		t.testFinal("S1-pow2Rec3.csv", 0, 63, 5, "p1Algoritmia.Algorithms", "pow2Rec3");
	}
	
	/**
	 * Benchmark para el metodo pow2Rec4
	 * Genera fichero csv con datos de tiempo empleado
	 */
	@Test
	void testPow2Rec4() {
		AlgorithmsBenchmark t = new AlgorithmsBenchmark();
		
		t.testFinal("S1-pow2Rec4.csv", 0, 63, 5, "p1Algoritmia.Algorithms", "pow2Rec4");
	}

	/**
	 * Benchmark para el metodo linear
	 * Genera fichero csv con datos de tiempo empleado
	 */
	@Test
	void testLinear() {
		AlgorithmsBenchmark t = new AlgorithmsBenchmark();
		
		t.testFinal("S1-linear.csv", 0, 30, 5, "p1Algoritmia.Algorithms", "linear");
	}
	
	/**
	 * Benchmark para el metodo quadratic
	 * Genera fichero csv con datos de tiempo empleado
	 */
	@Test
	void testQuadratic() {
		AlgorithmsBenchmark t = new AlgorithmsBenchmark();
		
		t.testFinal("S1-quadratic.csv", 0, 30, 5, "p1Algoritmia.Algorithms", "quadratic");
	}
	
	/**
	 * Benchmark para el metodo cubic
	 * Genera fichero csv con datos de tiempo empleado
	 */
	@Test
	void testCubic() {
		AlgorithmsBenchmark t = new AlgorithmsBenchmark();
		
		t.testFinal("S1-cubic.csv", 0, 30, 5, "p1Algoritmia.Algorithms", "cubic");
	}
	
	/**
	 * Benchmark para el metodo logarithmic
	 * Genera fichero csv con datos de tiempo empleado
	 */
	@Test
	void testLogarithmic() {
		AlgorithmsBenchmark t = new AlgorithmsBenchmark();
		
		t.testFinal("S1-logarithmic.csv", 0, 50, 100, "p1Algoritmia.Algorithms", "logarithmic");
	}
	
	/**
	 * Benchmark para el metodo factorialRec
	 * Genera fichero csv con datos de tiempo empleado
	 */
	@Test
	void testFactorialRec() {
		AlgorithmsBenchmark t = new AlgorithmsBenchmark();
		
		t.testFinal("S1-factorialRec.csv", 0, 21, 5, "p1Algoritmia.Algorithms", "factorialRec");
	}
	
	/**
	 * Benchmark para el metodo fibonaccilRec
	 * Genera fichero csv con datos de tiempo empleado
	 */
	@Test
	void testFibonacciRec() {
		AlgorithmsBenchmark t = new AlgorithmsBenchmark();
		
		t.testFinal("S1-fibonacciRec.csv", 0, 17, 5, "p1Algoritmia.Algorithms", "fibonacciRec");
	}
	
}
