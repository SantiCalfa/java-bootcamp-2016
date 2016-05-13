package shoppingCartAPI;

public class Item 
{
	public static int idGenerator=0;
	public int itemId;
 	public String itemName;
 	public double itemPrice;
 	public int itemQuantity;
 	
 	public Item (String itemName, double itemPrice, int itemQuantity)
 	{ 		
 		this.itemId=idGenerator++;
 		this.itemName=itemName;
 		this.itemPrice=itemPrice;
 		this.itemQuantity=itemQuantity;
 	}
 	
 	public int getItemId () 
 	{
 		return itemId;
 	}
 	
 	public String getItemName ()
 	{
 		return itemName;
 	}
 	
 	public double getItemPrice()
 	{
 		return itemPrice;
 	}
 	
 	public int getItemQuantity()
 	{
 		return itemQuantity;
 	}
 	
 	public double getFinalItemPrice ()
 	{
 		return itemPrice*(double)itemQuantity;
 	}
 	
 	@Override
 	public String toString()
 	{
 		return "Item\n Id: "+itemId+"\n Name: "+itemName+"\n Price: "+itemPrice+"\n Quantitie: "+itemQuantity;
 	}
}