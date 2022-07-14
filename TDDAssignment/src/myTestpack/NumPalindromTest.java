package myTestpack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import mypack.NumberPalindrome;

class NumPalindromTest {

	@Test
	void test() {
		Assertions.assertEquals(true, NumberPalindrome.isNumPalindrome(121));
	}

	
	@Test
	void test2() {
		Assertions.assertEquals(false, NumberPalindrome.isNumPalindrome(452));
	}
}
