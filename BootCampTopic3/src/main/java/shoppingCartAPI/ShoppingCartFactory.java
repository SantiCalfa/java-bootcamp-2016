package shoppingCartAPI;

public class ShoppingCartFactory 
{
	public static ServiceShoppingCart getShoppingCart()
	{
		return new ShoppingCartImp();
	}
}