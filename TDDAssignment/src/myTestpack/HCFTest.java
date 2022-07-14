package myTestpack;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import mypack.EvenCount;
import mypack.HCFofNum;

class HCFTest {

	@Test
	void test() {
		assertEquals(12,HCFofNum.getHCF(36, 60));	

	}

}
