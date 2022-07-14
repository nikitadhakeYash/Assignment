package myTestpack;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import mypack.Claculator;

class CalculatorTest {
	
	//private Claculator claculator;
//	public CalculatorTest()
//	{
//		
//	}
//	
//	@BeforeClass
//	public static void setUpClass() {
//		
//	}
//	
//	@AfterClass
//	public static void tearDownClass() {
//		
//	}
//	
//	@Before
//	public  void setUp() {
//		claculator=new Claculator();
//	}
	
	Claculator claculator=new Claculator();
	

	@Test
	public void add() {

		assertEquals(2,claculator.add(1, 1),0);
		assertEquals(1.42,claculator.add(3.14, -1.72),0.001);
		assertEquals(2.0/3,claculator.add(1.0/3, 1.0/3),0.001);
	
	}
	
	@Test
	public void substract() {

		assertEquals(0,claculator.substract(1, 1),0);
		assertEquals(4.86,claculator.substract(3.14, -1.72),0.001);
		assertEquals(2.0/3,claculator.substract(1.0/3, -1.0/3),0.001);
	
	}

	@Test
	public void multiply() {

		assertEquals(2,claculator.multiply(1, 2),0);
		assertEquals(-5.4008,claculator.multiply(3.14, -1.72),0.001);
		assertEquals(0.111,claculator.multiply(1.0/3, 1.0/3),0.001);
	
	}
	
	@Test
	public void divide() {

		assertEquals(2,claculator.divide(4, 2),0);
		assertEquals(-1.826,claculator.divide(3.14, -1.72),0.001);
		assertEquals(1,claculator.divide(1.0/3, 1.0/3),0);
	
	}
	
//	@Rule
//	public ExpectedException objExp=ExpectedException.none();
	@Test()
	public void divideException() {
		//claculator.divide(2,0);
		//assertEquals(2,claculator.divide(4, 0),0);
		Assertions.assertThrows(IllegalArgumentException.class, ()->claculator.divide(5, 0));
	
	}
	
	@Test
	public void mode() {

		assertEquals(0.0,claculator.mod(4, 2),0.0);
	
	}
	
	@Test()
	public void modeException() {
		//claculator.divide(2,0);
		//assertEquals(2,claculator.divide(4, 0),0);
		Assertions.assertThrows(IllegalArgumentException.class, ()->claculator.mod(5, 0));
	
	}
	
	@Test
	public void squareroot() {

		assertEquals(2.0,claculator.squareroot(4),0);
	
	}
	
	@Test()
	public void squarerootException() {
	
		Assertions.assertThrows(IllegalArgumentException.class, ()->claculator.squareroot(-3));
	
	}
	
	@Test
	public void power() {

		assertEquals(4.0,claculator.power(2,2),0);
	
	}
	
	@Test()
	public void powerException() {
	
		Assertions.assertThrows(IllegalArgumentException.class, ()->claculator.power(2,-3));
	
	}
	
	
}
