package shoppingCartTest;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

import shoppingCartAPI.ServiceShoppingCart;
import shoppingCartAPI.ShoppingCartFactory;
import shoppingCartAPI.Sale;
import shoppingCartAPI.Item;

public class ShoppingCartTesting 
{
	ServiceShoppingCart cart;
	Item item1;
	Item item2;
	Item item3;
	
	@Before
	public void setUp () throws Exception
	{
	cart= ShoppingCartFactory.getShoppingCart();
	item1=new Item("item 1",5,100);
	item2=new Item("item 2",2,10);
	item3=new Item("item 3",10,1);
	
	cart.addItem(item1);
	cart.addItem(item2);
	cart.addItem(item3);
	
	cart.deleteItem(item2);
	}
	
	//Adding a new Item to the cart.
	@Test
	public void addItemTest()
	{		
		assertTrue(cart.addItem(item2));
	}
	
	//Deleting and adding items to the cart.
	@Test
	public void deleteItemTest()
	{
		cart.addItem(item2);
		assertTrue(cart.deleteItem(item2));
		assertTrue(cart.deleteItem(item3));
		cart.addItem(item3);
	 	assertTrue(cart.deleteItem(item3));
	}
	
	//We check out if there is a Sale, and what was the total for that Sale.
	@Test
	public void doCheckOutTest()
	{
		Sale sale;
		sale=cart.doCheckOut();
		assertTrue(510==sale.getTotalSale());
	}
	
	//This is to clear the Cart.
	@Test
	public void clearCartTest()
	{
		cart.clearCart();
	}
	
	//Test to know a specific item in the cart.
	@Test
	public void getItemTest()
	{
		assertTrue(item1==cart.getItem(0));
	}
}