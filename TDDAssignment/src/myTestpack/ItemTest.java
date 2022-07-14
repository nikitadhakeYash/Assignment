package myTestpack;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import mypack.Item;

class ItemTest {

	@Test
	void testId() {
      Throwable exception= assertThrows(IllegalArgumentException.class,()-> {

			Item item=new Item();
			item.setItemid(88);	
    	  
      });
	}	
		
	
	@Test
	void testName() {
      Throwable exception= assertThrows(IllegalArgumentException.class,()-> {

			Item item=new Item();
			item.setItemname("abs*");	
		
    	  
      });
	}
	
	@Test
	void testCostprice() {
      Throwable exception= assertThrows(IllegalArgumentException.class,()-> {

			Item item=new Item();
			item.setCost_price(-2);	
    	  
      });
	}	

	@Test
	void testSellprice() {
      Throwable exception= assertThrows(IllegalArgumentException.class,()-> {

			Item item=new Item();
			item.setCost_price(20);	
			item.setSell_price(20);	
			//item.setSell_price(20);	
    	  
      });
	}	
	
	
	
	@Test
	void testExpiryDate() {
      Throwable exception= assertThrows(IllegalArgumentException.class,()-> {

			Item item=new Item();
			item.setDateOfoExprire("Wed Jun 29 15:55:44 IST 2022");	
			//item.getToday();	
			//item.setSell_price(20);	
    	  
      });
	}	
}
