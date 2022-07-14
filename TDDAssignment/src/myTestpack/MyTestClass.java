package myTestpack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import mypack.StringPalindrome;

class MyTestClass {
	
	private static StringPalindrome obj;
	
	@BeforeAll
	public static void doInitialization()
	{
		obj=new StringPalindrome();
	}

	@Test
	void test() {
		assertEquals(Boolean.TRUE,obj.isPalindrome("madam"));
	}
	
	@Test
	void test2() {
		assertEquals(Boolean.FALSE,obj.isPalindrome("apple"));
	}

}
