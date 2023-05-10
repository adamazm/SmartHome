package package02;

public class Item {
	
	String itemName;
	int price;
	boolean stock;
	
	public String getName() {
		return itemName;
	}
	public int getPrice() 
	{
		return price;
	}
	
	public boolean getStock()
	{
		return this.stock;
	}
	
	//remove stock 
	
	public void removeStock() 
	{
		this.stock = false;
	}
}
