package com.yash.assignment;

public class ItemAsmnt16 {
	
	int itemId;
	String itemName;
	String categoryName;
	double price;
	String dateOfManufacturing;
	String dateOfExpiring;
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDateOfManufacturing() {
		return dateOfManufacturing;
	}
	public void setDateOfManufacturing(String dateOfManufacturing) {
		this.dateOfManufacturing = dateOfManufacturing;
	}
	public String getDateOfExpiring() {
		return dateOfExpiring;
	}
	public void setDateOfExpiring(String dateOfExpiring) {
		this.dateOfExpiring = dateOfExpiring;
	}
	
	@Override
	public String toString() {
		return "ItemAsmnt16 [itemId=" + itemId + ", itemName=" + itemName + ", categoryName=" + categoryName
				+ ", price=" + price + ", dateOfManufacturing=" + dateOfManufacturing + ", dateOfExpiring="
				+ dateOfExpiring + "]";
	}
	public ItemAsmnt16(int itemId, String itemName, String categoryName, double price, String dateOfManufacturing,
			String dateOfExpiring) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.categoryName = categoryName;
		this.price = price;
		this.dateOfManufacturing = dateOfManufacturing;
		this.dateOfExpiring = dateOfExpiring;
	}
	
	
	
	

}
