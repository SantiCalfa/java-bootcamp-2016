package shoppingCartTest;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

import shoppingCartAPI.Item;
import shoppingCartAPI.Sale;
import shoppingCartAPI.ServiceShoppingCart;
import shoppingCartAPI.ShoppingCartFactory;

public class SaleTesting 
{
	Sale sale;
	ServiceShoppingCart cart;
	Item item1;
	Item item2;
	
	//We create again a previous setUp for a sale in the ShoppingCart.
	@Before
	public void setUp()
	{
		cart=ShoppingCartFactory.getShoppingCart();
		item1=new Item("item 1",10,2);
		item2=new Item("item 2",5,1);
		cart.addItem(item1);
		cart.addItem(item2);
		sale=cart.doCheckOut();
	}
	
	//We get the totalSale for the Sale.
	@Test
	public void getTotalSaleTest()
	{
		assertTrue(25==sale.getTotalSale());
		System.out.println(sale.totalSale);
	}
}