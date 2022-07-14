package mypack;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Item {
	
	int itemid;
	String itemname;
	int cost_price;
	int sell_price;
	String dateOfMnf;
	String dateOfoExprire;
	
		
	
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		
		if(itemid<100) {
			throw new IllegalArgumentException("Item id should have 3 digit ");
		}
		
		this.itemid = itemid;
	}
	
	
	public String getItemname() {
		return itemname;
	}
	
	public void setItemname(String itemname) {
		
		Pattern p=Pattern.compile("[^a-zA-Z0-9]");
		Matcher m=p.matcher(itemname);
		boolean b=m.find();
		if(b){
			throw new IllegalArgumentException("Item name should only have alphabets");			
		}
		
		
		this.itemname = itemname;
	}
	
	
	public int getCost_price() {
		return cost_price;
	}
	public void setCost_price(int cost_price) {
		
		if(cost_price<0) {
			throw new IllegalArgumentException("Item cost price should not be negative ");			

		}
		
		this.cost_price = cost_price;
	}
	
	
	public int getSell_price() {
		return sell_price;
	}
	
	public void setSell_price(int sell_price) {
//		if(sell_price<0) {
//			throw new IllegalArgumentException("Item sell price should not be negative ");			
//		}
		
		if(sell_price==cost_price) {
			throw new IllegalArgumentException("Item sell price and cost price should not be same ");			
		}
		
		this.sell_price = sell_price;
	}
	
	
	public String getDateOfMnf() {
		return dateOfMnf;
	}
	public void setDateOfMnf(String dateOfMnf) {
		this.dateOfMnf = dateOfMnf;
	}
	
	public String getDateOfoExprire() {
		return dateOfoExprire;
	}
	public void setDateOfoExprire(String dateOfoExprire) {
		Date d=new Date();
		String today=d.toString();
		System.out.print(today);
		if(dateOfoExprire==today) {
			
			throw new IllegalArgumentException("Date of expire and current date should not be same ");			
		}

		this.dateOfoExprire = dateOfoExprire;
	}
	
//	
//	public static String getToday()
//	{
//		Date date=new Date();
//		return date.toString();
//	}
	

}
