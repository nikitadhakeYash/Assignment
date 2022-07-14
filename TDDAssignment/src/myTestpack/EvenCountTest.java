package myTestpack;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import mypack.CountVowel;
import mypack.EvenCount;

class EvenCountTest {

	@Test
	void test() {
		
		int arr[]= {2,3,4,5,6};
		int n=arr.length;
		
		assertEquals("Nope!",3,EvenCount.calEven(arr, n));	
		
	}

}
