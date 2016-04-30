package testUnit;
import org.junit.Assert;
import org.junit.Test;

public class TestApp 
{
	@Test
	public void testPrintNombreApellido() 
	{
		Assert.assertEquals(UnitTestApp.getNombreApellido(), "Santiago Nicolas Calfa");
	}
}