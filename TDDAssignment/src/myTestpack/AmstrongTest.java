package myTestpack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import mypack.AmstrongNum;

class AmstrongTest {
	

	@Test
	void test() {
		Assertions.assertEquals(true, AmstrongNum.isAmstrong(153));
	}

	@Test
	void test2() {
		Assertions.assertEquals(false, AmstrongNum.isAmstrong(154));
	}
	
	
}
