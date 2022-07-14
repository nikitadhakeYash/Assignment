package myTestpack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import mypack.RemovedSpecialChar;
import mypack.StringPalindrome;

class RemovedSpecCharTest {
	private static RemovedSpecialChar obj;
	
	@BeforeAll
	public static void doInitialization()
	{
		obj=new RemovedSpecialChar();
	}

	
	@Test
	void test() {
       assertEquals(Boolean.FALSE,obj.isContainSpeChar("This @Red $Car"));
	}

}
