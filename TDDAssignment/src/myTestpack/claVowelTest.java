package myTestpack;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import mypack.CountVowel;
import mypack.StringPalindrome;

class claVowelTest {
	

	@Test
	void test() {
		
      assertEquals("Nope!",3,CountVowel.calVowel("wellcome"));	
	}

}
