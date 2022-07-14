package myTestpack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import mypack.MySingletonClass;

class MySingletonClassTest {

	@Test
	void test() {
		MySingletonClass obj1=MySingletonClass.getInstance();
		MySingletonClass obj2=MySingletonClass.getInstance();
		
		System.out.println("Checking singletone objects equality ");
		assertEquals(true,obj1==obj2);

	}

	
}
