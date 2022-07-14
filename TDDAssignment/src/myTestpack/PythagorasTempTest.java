package myTestpack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import mypack.PythagorasTemp;

class PythagorasTempTest {
	
	
	static int[] p1= {3,4,5};
	static int[] p2= {3,5,7};

	PythagorasTemp pt=new PythagorasTemp();
	
	@Test
	void test() {
		
		assertEquals(1,pt.pythagoT(p1));
	}

	@Test
	void test2() {
		
		assertEquals(0,pt.pythagoT(p2));
	}
}
