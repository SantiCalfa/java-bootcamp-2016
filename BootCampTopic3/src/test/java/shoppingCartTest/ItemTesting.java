package shoppingCartTest;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import shoppingCartAPI.Item;

public class ItemTesting 
{
	Item item;
	
	//This create a before setUp, creating a new Item.
	@Before 
	public void setUp() throws Exception
	{
		item=new Item("item",5,100);
	}
	
	//The test, first gets the information in the setUp and calling assertTrue we get the final item price if it is correct.
	@Test
	public void getFinalPriceTest()
	{
	assertTrue(500==item.getFinalItemPrice());
	System.out.println(item);
	}
}