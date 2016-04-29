package Topic0Pto3;

public class ProxyDBAccesor 
{
	public void getConnection() 
	{
		System.out.print("ProxyDBAccesor: \n");
		DatabaseAccesor dba = new DatabaseAccesor();
		dba.getConnection();		
	}
}