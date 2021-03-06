package test;
import junit.framework.*;
import production.*;

public class testEvenFib extends TestCase{
	EvenFib eFib;
	
	public void setUp(){
		eFib = new EvenFib();
	}
	
	public void testFib(){
		assertEquals(eFib.getFibonacci(6), eFib.getFibonacci(5) + eFib.getFibonacci(4));
	}
	
	public void testSum(){
		assertEquals(44, eFib.getEvenFibSum(10));
	}
}